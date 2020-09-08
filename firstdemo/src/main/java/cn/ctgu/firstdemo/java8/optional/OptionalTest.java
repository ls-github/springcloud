package cn.ctgu.firstdemo.java8.optional;

import cn.ctgu.firstdemo.entity.Stock;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional op=Optional.of(null);

        System.out.println(op.isPresent());
        Stock stock=null;

        Stock s= Optional.ofNullable(stock).orElse(new Stock("xx"));



//        System.out.println(Optional.ofNullable("bb").orElse());;
//        System.out.println();
        String st1="aa";
        String st2="bb";
//        System.out.println(st1.compareTo(st2));
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//        strings.stream().filter(item-> !StringUtils.isEmpty(item)).map(item->item.toUpperCase()).sorted((s1,s2)->s1.compareTo(s2)).forEach(System.out::println);


//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        Optional<Stock> stockOptional=Optional.ofNullable(null);
//
//       String name= stockOptional.map(Stock::getGoodsName).orElse("no name");


//        System.out.println(name);
    //        stock.orElse(new Stock("ls"));
//        stock.ifPresent(item-> System.out.println(stock.get().getGoodsName()));
//        System.out.println();

//        Optional optional=Optional.empty();
//        System.out.println(optional);
//        System.out.println(optional.isPresent());
    }
}
