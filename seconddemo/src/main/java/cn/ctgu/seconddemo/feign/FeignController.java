package cn.ctgu.seconddemo.feign;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FeignController {
    @Autowired
    private FirstDemoFeignClient firstDemoFeignClient;

    private Logger    log= LoggerFactory.getLogger(FeignController.class);

    @GetMapping("/firstdemo/feign")
    public Object consumerFirtDemoService(){
        Object result=firstDemoFeignClient.consumerFirtDemoService();
        return result;
    }

    @RequestMapping("/log")
    public Object getLog(HttpServletRequest request){

        log.info("[{}],[{}],[{}]", request.getRemoteAddr(), request.getRequestURL(),JSON.toJSON(request.getParameterMap()));
        log.info("记录日志！！");
        return "test log!";
    }
}
