package cn.ctgu.firstdemo.spring;

import cn.ctgu.firstdemo.spring.aop.AspectTest;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Comparator;

public class SpringTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);

        String [] beanNames=context.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(beanName-> System.out.println(beanName));

    }
}
