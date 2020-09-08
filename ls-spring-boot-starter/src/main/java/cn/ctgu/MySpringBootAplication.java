package cn.ctgu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ctgu.mybatisplus")
public class MySpringBootAplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootAplication.class, args);
    }

}