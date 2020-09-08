package cn.ctgu.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({PersonBeanProperties.class})
public class PersonBeanConfiguration {

    @Autowired
    private PersonBeanProperties personBeanProperties;

    @Bean(name = "personBean")
    public PersonBean getPersonBean(){
        return new PersonBean(personBeanProperties.getName(),personBeanProperties.getAge());
    }
}


