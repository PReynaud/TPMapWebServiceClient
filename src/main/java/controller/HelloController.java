package controller;

import org.apache.axis2.AxisFault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.rmi.RemoteException;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		try {
			PaysWebServiceServiceStub stub = new PaysWebServiceServiceStub("http://localhost:8080/axis2/services/PaysWebServiceService?wsdl");
			PaysWebServiceServiceStub.Pays[] listePays = stub.obtainListePays(new PaysWebServiceServiceStub.ObtainListePays()).get_return();

			for(PaysWebServiceServiceStub.Pays pays: listePays){
				System.out.println(pays.getNomPays());
			}
		} catch (AxisFault axisFault) {
			axisFault.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}