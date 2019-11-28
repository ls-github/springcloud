package cn.ctgu.seconddemo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="firstdemoclient",fallback = FirstDemoFeignClientHystrix.class)
public interface FirstDemoFeignClient {
    @GetMapping("/firstdemo")
    Object consumerFirtDemoService();
}
