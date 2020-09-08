package cn.ctgu.firstdemo.controller;

import cn.ctgu.firstdemo.redis.DistributedLockHandler;
import cn.ctgu.firstdemo.redis.Lock;
import cn.ctgu.firstdemo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @Autowired
    private StockService stockService;

    @Autowired
    DistributedLockHandler distributedLockHandler;

    @GetMapping("/stock")
    public Object buyGoods(@RequestParam(required = false,defaultValue = "apple") String goodsname,@RequestParam(required = false,defaultValue = "1") int count) {


//                        Lock lock=new Lock("lock1","VVVVV");
//                        if(distributedLockHandler.tryLock(lock)){
//                            stockService.buyGoods(goodsname,count);
//                            distributedLockHandler.releaseLock(lock);
//                        }

        stockService.buyGoods(goodsname,count);



//        for(int i=0;i<100;i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    Lock lock=new Lock("lock1","sssssssss");
//                    if(distributedLockHandler.tryLock(lock)){
//                        stockService.buyGoods(goodsname,count);
//                        distributedLockHandler.releaseLock(lock);
//                    }
//
//                }
//            }).start();
//        }
        return "success!";
    }




}
