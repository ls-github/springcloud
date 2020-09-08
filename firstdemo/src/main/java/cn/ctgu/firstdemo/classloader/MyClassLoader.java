package cn.ctgu.firstdemo.classloader;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootApplication
public class MyClassLoader extends ClassLoader {
    private String loadPath="e:\\";

//    public MyClassLoader(ClassLoader parent){
//        super(parent);
//    }


    @Override
    protected Class<?> findClass(String filename) throws ClassNotFoundException {
        byte [] data=getClassByteArray(loadPath+filename+".class");
        return defineClass(data,0,data.length);
    }


    private byte [] getClassByteArray(String filepath)  {
        FileInputStream in = null;
        ByteArrayOutputStream outArray = null;
        byte [] data=null;
        try {
            in=new FileInputStream(filepath);
            outArray=new ByteArrayOutputStream(1024);

            int len;
            byte [] buff=new byte[1024];
            while((len=in.read(buff))!=-1){
                outArray.write(buff,0,len);
            }
            data=outArray.toByteArray();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                outArray.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return data;
    }



    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        System.out.println("main ==>"+LoadDemo.age);
        LoadDemo loadDemo=new LoadDemo();
        System.out.println("main ==>"+LoadDemo.age);

//        MyClassLoader myClassLoader=new MyClassLoader();
//        Class clazz=myClassLoader.loadClass("LoadDemo");
//        Object obj=clazz.newInstance();
//        Method set=clazz.getDeclaredMethod("setName",String.class);
//        set.invoke(obj,"zhangsan");
//        Method get=clazz.getDeclaredMethod("getName");
//        System.out.println(get.invoke(obj));


    }
}
