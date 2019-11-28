package cn.ctgu.seconddemo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="firstdemoclient")
public interface FirstDemoFeignClient {
    @GetMapping("/firstdemo")
    Object consumerFirtDemoService();
}
