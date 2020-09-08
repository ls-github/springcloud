package cn.ctgu.seconddemo.json;

import com.alibaba.fastjson.JSON;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.HashMap;

public class TestJSON {

    public static void main(String[] args) throws UnsupportedEncodingException {
//        HashMap<String,Object> map=new HashMap();
//        map.put("NAME","zhangsan");
//        map.put("aGe",18);
//        Person obj=JSON.parseObject(JSON.toJSONString(map),Person.class);
//
//        System.out.println(JSON.toJSONString(map));
//        System.out.println(obj.getName());
//        System.out.println(obj.getAge());
//
//        System.out.println(URLEncoder.encode("aaa_bb_==中文" + ".xlsx", "utf-8"));
//
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDateTime.of(2020,2,28,22,33,11));
        // 获取当前日期
        LocalDate now = LocalDate.now();

// 设置日期
        LocalDate localDate = LocalDate.of(2019, 9, 10);
// 获取年
        int year = localDate.getYear();     //结果：2019
        int year1 = localDate.get(ChronoField.YEAR); //结果：2019
// 获取月
        Month month = localDate.getMonth();   // 结果：SEPTEMBER
        int month1 = localDate.get(ChronoField.MONTH_OF_YEAR); //结果：9
// 获取日
        int day = localDate.getDayOfMonth();   //结果：10
        int day1 = localDate.get(ChronoField.DAY_OF_MONTH); // 结果：10
// 获取星期
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();   //结果：TUESDAY
        int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK); //结果：2
    }
}
