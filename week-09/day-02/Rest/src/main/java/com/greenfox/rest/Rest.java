package com.greenfox.rest;

import com.greenfox.rest.Controller.DoublingError;
import com.greenfox.rest.Controller.ErrorText;
import com.greenfox.rest.model.*;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/appenda/{appendable}")
    public Append append(@PathVariable("appendable") String str) {
        Append append = new Append(str);
        return append;
    }

    @PostMapping("/dountil/{what}")
    public Result doUntil(@PathVariable("what") String what, @RequestBody DoUntil doUntil) {
        Result result = new Result();
        int until = doUntil.getUntil();
        if (what.equals("sum")) {
            int sum = 0;
            for (int i = 1; i <= until; i++) {
                sum += i;
                result.setResult(sum);
            }
        } else if (what.equals("factor")) {
            int factor = 1;
            for (int i = 1; i <= until; i++) {
                factor = factor * i;
                result.setResult(factor);
            }
        }
        return result;
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

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ErrorText missingNumber() {
        ErrorText errorText = new ErrorText();
        errorText.setError("Please provide a number!");
        return errorText;
    }


}

