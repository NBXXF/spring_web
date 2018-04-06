package com.asange.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Autowired
    private UserProperties userProperties;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public String getUser() {
        return userProperties.toString();
    }
}
