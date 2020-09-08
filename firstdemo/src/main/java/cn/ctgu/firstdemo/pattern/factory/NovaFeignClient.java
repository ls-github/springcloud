package cn.ctgu.firstdemo.pattern.factory;

public class NovaFeignClient implements FeignClient {
    public void sayHello(){
        System.out.println("hello,nova!");
    }
}
