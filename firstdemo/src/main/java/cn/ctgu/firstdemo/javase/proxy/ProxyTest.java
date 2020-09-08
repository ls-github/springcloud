package cn.ctgu.firstdemo.javase.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void testJdkProxy(){

        UserDao userDao=new UserDaoImpl();

        UserDao userDaoProxy= (UserDao) Proxy.newProxyInstance(this.getClass().getClassLoader(), new UserDaoImpl().getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                method.invoke(userDao,args);
                return null;
            }
        });
        userDaoProxy.addUser();

    }


    @Test
    public void testCglibProxy(){


    }
}
