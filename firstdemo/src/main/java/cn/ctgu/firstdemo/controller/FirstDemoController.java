package cn.ctgu.firstdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstDemoController {

    @Value("${server.port}")
    private String server_port;

    @GetMapping("/firstdemo")
    public Object testFirtDemoServie(){
        return "firstdemo,hi:"+server_port;
    }

}
