package cn.ctgu.seconddemo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {

        List list=new ArrayList(Arrays.asList("aa","bb"));
        list.remove("aa");
        list.forEach(item-> System.out.println(item));
    }
}
