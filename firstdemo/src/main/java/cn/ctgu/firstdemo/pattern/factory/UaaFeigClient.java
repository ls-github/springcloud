package cn.ctgu.firstdemo.pattern.factory;

public class UaaFeigClient implements FeignClient {
    public void sayHello(){
        System.out.println("hello,uaa!");
    }

}
