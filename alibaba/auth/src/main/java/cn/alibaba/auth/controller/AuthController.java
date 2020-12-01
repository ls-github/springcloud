package cn.alibaba.auth.controller;

import cn.ctgu.alibaba.mystarter.bean.PersonBean;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private PersonBean personBean;

    public AuthController(ApplicationContext applicationContext){
//        this.personBean=applicationContext.getBean(PersonBean.class);
    }

    @GetMapping("/test")
    public Object test(){
        System.out.println(personBean);
        return "hello zs6666";
    }
}
