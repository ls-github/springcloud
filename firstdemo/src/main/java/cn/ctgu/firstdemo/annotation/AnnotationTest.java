package cn.ctgu.firstdemo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {
    @MyAnnotion(email = {"aaa","bb"} )
    public void sayHello(){

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method=AnnotationTest.class.getDeclaredMethod("sayHello");
        MyAnnotion annotation=method.getAnnotation(MyAnnotion.class);
        System.out.println( annotation.name());
        annotation.email();
    }
}
