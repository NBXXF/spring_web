package com.asange.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloCtroller {

    @Value("${age}")
    private Integer age;


    @Value("${name}")
    private String name;

    @Value("${desc}")
    private String desc;

    @RequestMapping(value = "he", method = RequestMethod.GET)
    public String sayHello() {
        return desc;
    }

    @RequestMapping(value = {"hello", "hi"}, method = RequestMethod.GET)
    public String sayHello2() {
        return desc;
    }

    @RequestMapping(value = {"hello/{id}"}, method = RequestMethod.GET)
    public String sayHello3(@PathVariable("id") int id) {
        return desc + "  _id: " + id;
    }

    @RequestMapping(value = {"hellowithid"}, method = RequestMethod.GET)
    public String sayHello4(@RequestParam(value = "id",required = false,defaultValue = "99") int id) {
        return desc + "  _id: " + id;
    }
}
