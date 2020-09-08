package cn.ctgu.firstdemo.java8.lambda.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestComputer {



    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Person p=new Person();
//        System.out.println(p.getName());

        Class clazz=Class.forName("cn.ctgu.firstdemo.java8.lambda.test.Person");
        Method method=clazz.getMethod("getName");
        Method method2=clazz.getMethod("sayHello");
        method.invoke(clazz.newInstance());
        method2.invoke(clazz.newInstance());

    }


}
