package cn.ctgu.firstdemo.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    private  CyclicBarrier cyclicBarrier=new CyclicBarrier(3);

    public void sporterRun(){
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread()+"准备完成！"+System.currentTimeMillis());
            cyclicBarrier.await();
            System.out.println(Thread.currentThread()+"执行！"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        CyclicBarrierTest cyclicBarrierTest=new CyclicBarrierTest();

        new Thread(new Runnable() {
            @Override
            public void run() {
                cyclicBarrierTest.sporterRun();
            }
        },"sport1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                cyclicBarrierTest.sporterRun();
            }
        },"sport2").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                cyclicBarrierTest.sporterRun();
            }
        },"sport3").start();
    }

}
