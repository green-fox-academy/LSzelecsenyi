package com.greenfox.rest;

import com.greenfox.rest.Controller.DoublingError;
import com.greenfox.rest.Controller.ErrorText;
import com.greenfox.rest.model.Doub;
import com.greenfox.rest.model.Greet;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    @RequestMapping("/doubling")
    public Doub doubling(@RequestParam("input") Integer number) {
        Doub db = new Doub(number);
            return db;
    }

    @RequestMapping("/greeter")
    public Greet greet(@RequestParam("name") String name,
                       @RequestParam("title") String title) {
        Greet greet = new Greet(name, title);
        return greet;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ErrorText paramError(MissingServletRequestParameterException missingParam) {
        ErrorText errorText = new ErrorText();
        if (missingParam.getParameterName().equals("input")){
            errorText.setError("Please provide an input!");
        } else if (missingParam.getParameterName().equals("title")) {
            errorText.setError("Please provide a title!");
        } else if (missingParam.getParameterName().equals("name")) {
            errorText.setError("Please provide a name!");
        }
        return errorText;
    }


}

