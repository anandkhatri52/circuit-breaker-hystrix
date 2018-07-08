package com.example.demo.controller;

import com.example.demo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping(value = "/status/{value}")
    public String getStatus(@PathVariable String value) throws Exception {
        return exampleService.getStatus(value);
    }
}
