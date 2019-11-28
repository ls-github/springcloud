package cn.ctgu.firstdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FirstDemoController {

    @Value("${server.port}")
    private String server_port;

    @GetMapping("/firstdemo")
    public Object testFirtDemoServie(){
        Map<String,Object> result=new HashMap<>();
        result.put("code",200);
        result.put("message","sucess!");
        result.put("data","firstdemo提供服务，端口号："+server_port);
        return result;
    }

}
