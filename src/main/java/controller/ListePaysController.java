package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ws.PaysWebServiceServiceStub;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Created by Dimitri on 03/10/2015.
 *
 * @version 1.0
 */
@Controller
@RequestMapping("/listePays")
public class ListePaysController {
    @RequestMapping(method = RequestMethod.GET)
    public String listerPays(ModelMap model) {
        try {
            PaysWebServiceServiceStub stub = new PaysWebServiceServiceStub();
            PaysWebServiceServiceStub.Pays[] listePays = stub.obtainListePays(new PaysWebServiceServiceStub.ObtainListePays()).get_return();
            ArrayList<String> countries = new ArrayList<>();
            for(PaysWebServiceServiceStub.Pays pays: listePays){
                countries.add(pays.getNomPays());
            }
            model.addAttribute("countries", countries);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return "listePays";
    }
}
