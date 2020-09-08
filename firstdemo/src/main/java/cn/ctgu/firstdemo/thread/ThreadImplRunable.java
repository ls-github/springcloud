package cn.ctgu.firstdemo.thread;

import io.micrometer.shaded.org.pcollections.HashTreePMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadImplRunable implements Runnable {
    private volatile int count = 10;
    private Lock lock = new ReentrantLock();

    public void sellTickets() {
//        lock.lock();
        try {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName()+"看到的还剩1:"+count);
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"看到的还剩2:"+count);
                this.count--;
//                System.out.println(Thread.currentThread().getName() + "购票成功！还剩" + this.count);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            lock.unlock();
        }
    }

    @Override
    public void run() {
        while (true) {
            sellTickets();
        }
    }

    public static void main(String[] args) {
//        ThreadImplRunable myRunable = new ThreadImplRunable();
//        //新建三个售票客户端
//        new Thread(myRunable, "t1").start();
//        new Thread(myRunable, "t2").start();
//        new Thread(myRunable, "t3").start();

//        ConcurrentHashMap
        HashMap   map=new HashMap();
        map.put("name","zhangsan");

    }
}
