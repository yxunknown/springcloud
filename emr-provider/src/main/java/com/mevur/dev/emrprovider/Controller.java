package com.mevur.dev.emrprovider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        return "emr-provider: hello";
    }
}
