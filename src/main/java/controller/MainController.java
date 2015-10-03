package controller;

import org.apache.axis2.AxisFault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ws.PaysWebServiceServiceStub;

import java.rmi.RemoteException;
import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class MainController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		try {
			PaysWebServiceServiceStub stub = new PaysWebServiceServiceStub();
			PaysWebServiceServiceStub.Pays[] listePays = stub.obtainListePays(new PaysWebServiceServiceStub.ObtainListePays()).get_return();
			ArrayList<String> countries = new ArrayList<>();
			for(PaysWebServiceServiceStub.Pays pays: listePays){
				countries.add(pays.getNomPays());
			}
			model.addAttribute("countries", countries);
		} catch (AxisFault axisFault) {
			axisFault.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return "index";
	}
}