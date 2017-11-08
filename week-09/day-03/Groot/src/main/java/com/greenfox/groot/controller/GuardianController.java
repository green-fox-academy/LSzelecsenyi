package com.greenfox.groot.controller;

import com.greenfox.groot.model.ErrorResponse;
import com.greenfox.groot.model.Groot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"", "/"})
public class GuardianController {

    @GetMapping("/groot")
    public Object getGroot(@RequestParam(value = "message", required = false) String message) {
        Groot groot = new Groot(message);
        if (message != null) {
            return groot;
        } else return new ErrorResponse();
    }

}
