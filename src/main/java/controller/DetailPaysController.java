package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ws.PaysWebServiceServiceStub;

import java.rmi.RemoteException;

/**
 * Created by Dimitri on 04/10/2015.
 *
 * @version 1.0
 */
@Controller
@RequestMapping("/pays/{name}")
public class DetailPaysController {
    @RequestMapping(method = RequestMethod.GET)
    public String getPaysDetails(@PathVariable String name, ModelMap model) {
        try {
            PaysWebServiceServiceStub stub = new PaysWebServiceServiceStub();
            PaysWebServiceServiceStub.GetPays request = new PaysWebServiceServiceStub.GetPays();
            request.setName(name);
            PaysWebServiceServiceStub.Pays pays = stub.getPays(request).get_return();

            model.addAttribute("country", pays);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return "detailPays";
    }
}
