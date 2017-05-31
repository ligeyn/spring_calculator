package Util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import Model.Number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Number.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Pattern p = Pattern.compile("\\d*(\\.(\\d)*)?");
        Number numder = (Number)o;
        Matcher m = p.matcher(numder.getNum());
        if (!m.matches() || numder.getNum() == null || numder.getNum().isEmpty()){
            errors.rejectValue("num", "only numbers");
        }
    }
}
