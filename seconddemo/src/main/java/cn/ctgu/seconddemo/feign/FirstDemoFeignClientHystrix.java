package cn.ctgu.seconddemo.feign;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FirstDemoFeignClientHystrix implements FirstDemoFeignClient {
    @Override
    public Object consumerFirtDemoService() {
        Map<String,Object> result=new HashMap<>();
        result.put("code",200);
        result.put("message","sucess!");
        result.put("data","firstdemo 服务出错啦！稍后再试！");
        return result;
    }
}
