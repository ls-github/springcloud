package cn.ctgu.seconddemo.accessfirstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SecondDemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
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
