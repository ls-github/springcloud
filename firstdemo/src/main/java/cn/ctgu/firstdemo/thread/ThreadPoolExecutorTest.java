package cn.ctgu.firstdemo.thread;

import java.util.*;
import java.util.concurrent.*;

public class ThreadPoolExecutorTest {




    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService  executorService=Executors.newFixedThreadPool(10);

        List<Future> resultList=new ArrayList<>();

        for (int i=0;i<100;i++){
            int finalI = i;
            Future future=executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    HashMap<String,Object> resustMap=new HashMap<>();
                    System.out.println(Thread.currentThread().getName()+"_runing");
                    Thread.sleep(1*1000);
//                    System.out.println("task end");

                    if(finalI %3==0){
                        resustMap.put("t_name",Thread.currentThread().getName());
                        resustMap.put("result","sucess");
                    }else {
                        resustMap.put("t_name",Thread.currentThread().getName());
                        resustMap.put("result","error");
                    }
                    return resustMap;
                }
            });
            resultList.add(future);
        }

        executorService.shutdown();

        System.out.println("main1");
//        while (!executorService.isTerminated()){
//            System.out.println("not end");
//            Thread.sleep(1000);
//
//        }


        int success=0;
        int fail=0;
        for(Future f:resultList){
            Map map= (Map) f.get();
            if(map.get("result").equals("sucess")){
                success++;
            }else{
                fail++;
            }
        }

        System.out.println("main 2====>"+success);



        // 线程池，创建异步线程
//        ExecutorService executorService= Executors.newSingleThreadExecutor();
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("异步任务");
//            }
//        });
//

//
//        ThreadPoolExecutor executor=new ThreadPoolExecutor(3,
//        5,
//        30,
//        TimeUnit.SECONDS,
//        new ArrayBlockingQueue<>(8));
//
//        for(int i=0;i<10;i++){
//            executor.execute(()-> System.out.println(Thread.currentThread().getName()+"===>run"));
//        }
//        executor.shutdown();

//        this.wait();


        //定长周期执行任务的线程池
//        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(3);
//        executorService.scheduleWithFixedDelay(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("aa");
//            }
//        },0,3, TimeUnit.SECONDS);




    }
}
