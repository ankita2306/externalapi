package com.demo.externalapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestDemoController
{
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello world";
    }

    @GetMapping(value ="/calclienthello")
    private String getHelloClient()
    {
        String uri="https://www.youtube.com/";

        RestTemplate restTemplate=new RestTemplate();

    String result=restTemplate.getForObject(uri,String.class);
    return result;
    }
}
