package cn.ctgu.seconddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class SeconddemoApplication {

    public static void main(String[] args) {
        System.out.println("commit 3");
        SpringApplication.run(SeconddemoApplication.class, args);
        System.out.println("comit 4");
    }

}
