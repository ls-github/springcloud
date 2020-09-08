package cn.ctgu.firstdemo.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class AspectTest {
    public void hello(){
        System.out.println("hello aop");
    }
}
