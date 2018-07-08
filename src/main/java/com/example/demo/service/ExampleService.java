package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @HystrixCommand(fallbackMethod = "getStatusFallback")
    public String getStatus(String value) throws Exception {
        if("INACTIVE".equalsIgnoreCase(value)){
            throw new Exception("exception");
        }
        return "This is status from service";
    }

    public String getStatusFallback(String value){
        return "It's Fallback";
    }

}
