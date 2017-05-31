package Controller;

import Service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Model.Number;



@Controller
public class IndexController {


    @Autowired
    CalcService service;
    @RequestMapping(value = "/")
    public String getIndexPage(Model model){
        model.addAttribute("Number", new Number());
        service.setTotal(0);
        return "index";
    }

}
