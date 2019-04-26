package com.christiangravatt.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping("/christiangravatt/test")
    public String test() {
        return "Hello World!\n";
    }



}
