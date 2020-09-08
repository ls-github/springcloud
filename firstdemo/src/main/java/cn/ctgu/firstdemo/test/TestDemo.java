package cn.ctgu.firstdemo.test;

import cn.ctgu.configuration.PersonBean;
import cn.ctgu.firstdemo.entity.Stock;
import cn.ctgu.firstdemo.service.StockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;

//@SpringBootTest
//@RunWith(SpringRunner.class)
public class TestDemo {
    @Autowired
    private StockService stockService;

    public static void main(String[] args) {
//        Integer.valueOf()

//        System.out.println(Integer.parseInt("25.0"));
        System.out.println(Double.valueOf("23.7").intValue());
        System.out.println("   xxx  ");
        System.out.println("   xxx  ".trim());
        System.out.println(Integer.MAX_VALUE);
//        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(TestDemo.class);
//
//        StockService stockService= (StockService) annotationConfigApplicationContext.getBean("stockService");
    }

    @Test
    public void testController(){

////        System.out.println(stockService);
//        Stock stock=new Stock();
//        stock.setCount(10);
//        stock.setGoodsName("103");
//        stockService.saveStock(stock);

//        String [] str=new String[10];
//        str[0]="33";
//        str[1]="aa";
//        System.out.println(str[1]);
//
//        String [] str2=new String[]{"111","333"};
//        str2[1]="bb";
//        str2[2]="cc";
//        System.out.println(str2[2]);

//        String str1="aa"+" ";
//        String str2="aa ";
//        System.out.println(str1==str2);
//       int a=new Integer(1);

        ArrayList list=new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(33);
        System.out.println(list.size());

        Stock stock=new Stock();
        stock=null;
        System.gc();



    }
}
