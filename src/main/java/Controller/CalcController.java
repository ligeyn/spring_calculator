package Controller;

import Model.Number;
import Model.Action;
import Service.CalcService;
import Service.impl.LogServiceImpl;
import Util.CalculatorValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping(value = "/calculate")
public class CalcController {

    @Autowired
    CalcService service;

    @Autowired
    LogServiceImpl ls;

    CalculatorValidator cv = new CalculatorValidator();

    @RequestMapping(value = "/calc", method = RequestMethod.POST)
    public String doCalc(ModelMap model, @ModelAttribute Number n, @RequestParam("action") String action, BindingResult res) {
        cv.validate(n, res);
        String left = "", right = "";
        if (!res.hasErrors()) {
            left = service.getTotal().getNum();
            right = n.getNum();
            switch (action) {
                case "add":
                    service.add(n);
                    break;
                case "substr":
                    service.substrict(n);
                    break;
                case "divide":
                    service.divide(n);
                    break;
                case "multiply":
                    service.multiplicate(n);
                    break;
            }
        }
        model.addAttribute("Number", service.getTotal());
        ls.saveAction(new Action(left, right, action));

        return "calculator";
    }

    @RequestMapping(value = "calculator")
    public String getCalculator(Model model){
        model.addAttribute("Number", new Number());
        return "calculator";
    }

    @RequestMapping(value = "logs")
    public String getLogs(Model model){
        model.addAttribute("Logs", ls.findAllActions());
        return "logs";
    }
}
