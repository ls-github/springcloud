package cn.ctgu.firstdemo.java8.stream;

import cn.ctgu.firstdemo.entity.Stock;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    @Test
    public void testList(){

        List<String> list= Arrays.asList("aa","bb","dd","cc");

        int [] a=new int[]{1,3,5,7};
        //数组创建流
        Arrays.stream(a).map(item->item*2).count();
//        List<Integer> aList= (List<Integer>) Arrays.stream(a).map(item->item*2).collect(Collectors.toList());


//        System.out.println(Stream.of(a).map(item->item*2).collect(Collectors.toList());
        //中间操作
        List<String>  filterList=list.stream().filter(item->item.toLowerCase().contains("a")).collect(Collectors.toList());
        System.out.println("filter===>"+filterList);

        List<String>  sortList=list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(sortList);

        //map映射
        List<Stock>  stocks=list.stream().map(item->new Stock(item)).collect(Collectors.toList());
//        stocks.forEach(stock -> System.out.println(stock.getGoodsName()));
//        stocks.forEach(Stock::getGoodsName);


        //终止操作

        //collect
        List listCollect=list.stream().map(item->item.toUpperCase()).collect(Collectors.toList());
        System.out.println(listCollect.toString());

        // join
        String  listJoin=list.stream().map(item->item.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(listJoin);
        System.out.println(String.join(":",list));



    }
}
