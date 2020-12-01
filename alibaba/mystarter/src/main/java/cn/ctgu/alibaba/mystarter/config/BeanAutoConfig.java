package cn.ctgu.alibaba.mystarter.config;


import cn.ctgu.alibaba.mystarter.bean.PersonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({PersonPerproties.class})
public class BeanAutoConfig {

    @Bean
    public PersonBean getPersonBean(PersonPerproties personPerproties){
        PersonBean personBean=new PersonBean();
        personBean.setId(1);
        personBean.setUsername(personPerproties.getName());
        return personBean;
    }

}
