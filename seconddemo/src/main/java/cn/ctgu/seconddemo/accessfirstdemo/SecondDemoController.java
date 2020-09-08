package cn.ctgu.seconddemo.accessfirstdemo;

import cn.ctgu.seconddemo.exception.MyCustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SecondDemoController {
    private Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

    @GetMapping("/seconddemo/test")
    public  Object test(@RequestParam String name){
//        try{
            log.debug("debug");
            log.info("info log");
            log.warn("warning log");
            log.error("error log");
            System.out.println("console log");
            if("zs".equals(name)){
                throw new MyCustomException(1001,"名称有错误！");
            }


//        }catch (Exception e){
//            log.error("出错啦",e);
//        }
       return "demo2";
    }



    @GetMapping("/seconddemo/acessfirstdemo")
    public  Object acessFirstDemo(){
        return restTemplate.getForObject("http://localhost:8083/firstdemo",String.class);
    }

    @GetMapping("/seconddemo/acessfirstdemo/ribbon")
    public  Object acessFirstDemoWithRibbon(){
        return restTemplate.getForObject("http://firstdemoclient/firstdemo",String.class);
    }

}
