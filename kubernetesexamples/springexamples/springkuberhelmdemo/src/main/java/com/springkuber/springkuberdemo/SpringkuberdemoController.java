package com.springkuber.springkuberdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Date;

@RestController
@RequestMapping("/kuber")

public class SpringkuberdemoController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String syHello() {
        return "Hello World from Kubernetes helm for spring-app-chart-3-0 on " +  new Date();
    }

}