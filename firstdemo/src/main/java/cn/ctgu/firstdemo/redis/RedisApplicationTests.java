package cn.ctgu.firstdemo.redis;

import cn.ctgu.firstdemo.service.StockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class RedisApplicationTests {
    @Autowired
    private StockService stockService;

    @Autowired
    private RedisTemplate template;

    @Autowired
    DistributedLockHandler distributedLockHandler;

    public void setKey(String key, String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, value);
    }

    public String getValue(String key) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        return ops.get(key);
    }


    @Test
    public void test2(){
        for(int i=0;i<1;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    stockService.buyGoods("apple",1);
                }
            });
        }
    }

//    @Test
//    public void testRedis(){
//        Person p1 = new Person();
//        p1.setId(1L);
//        p1.setName("王五");
//        p1.setAge(11);
//        template.opsForValue().set("user1",p1);
//        ValueOperations<String, Person> ops = this.template.opsForValue();
//        System.out.println(ops.get("user1").getName());
//
//    }

    private List<Person> getPersonList() {
        Person p1 = new Person();
        p1.setId(1L);
        p1.setName("張一");
        p1.setAge(11);

        Person p2 = new Person();
        p2.setId(2L);
        p2.setName("張二");
        p2.setAge(22);

        Person p3 = new Person();
        p3.setId(3L);
        p3.setName("張三");
        p3.setAge(33);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        return list;
    }
}

