package cn.ctgu.seconddemo.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FirstDemoFeignClient firstDemoFeignClient;

    @GetMapping("/firstdemo/feign")
    public Object consumerFirtDemoService(){
        Object result=firstDemoFeignClient.consumerFirtDemoService();
        return result;
    }
}
