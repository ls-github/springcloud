package cn.ctgu.firstdemo.spring.bean;


import org.springframework.stereotype.Component;

@Component
public class Person {
    private int age=10;

    public Person(){
        System.out.println("实例化person");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
