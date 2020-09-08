package cn.ctgu.firstdemo.spring;

import cn.ctgu.firstdemo.spring.aop.Cat;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import({MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class SpringConfiguration {
}
