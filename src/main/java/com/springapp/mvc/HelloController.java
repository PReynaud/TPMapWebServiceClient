package com.springapp.mvc;

import PaysSoap.PaysWebServiceServiceLocator;
import PaysSoap.PaysWebService_PortType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		try {
			PaysWebServiceServiceLocator locator = new PaysWebServiceServiceLocator();
			PaysWebService_PortType service = locator.getPaysWebService();

			Object[] listPays = service.obtainListePays();
			for (Object pays: listPays){
				System.out.println((String)pays);
			}

		} catch (javax.xml.rpc.ServiceException ex) {
			ex.printStackTrace();
		} catch (java.rmi.RemoteException ex) {
			ex.printStackTrace();
		}

		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}