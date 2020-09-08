package cn.ctgu.firstdemo.annotation;

import java.lang.annotation.*;

@Inherited
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD,ElementType.FIELD})
public @interface MyAnnotion {
    String name() default "lisi";
    int age() default 18;
    String[] email() ;
}
