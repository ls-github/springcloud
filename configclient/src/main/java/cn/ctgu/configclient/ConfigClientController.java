package cn.ctgu.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${server.port}")
    private String port;
    @GetMapping("/configclient")
    public Object getConfig(){
        return "git远程配置,name:"+name+",age:"+age+",server.port:"+port;
    }
}
