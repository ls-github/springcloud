package cn.ctgu.firstdemo.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest implements Runnable{

//    private int count=0;
    private AtomicInteger count=new AtomicInteger(0);

    @Override
    public void run() {
        for(int i=0;i<1000;i++)
//            this.count++;
            count.getAndIncrement();

    }

    public static void main(String[] args) throws InterruptedException {

        int j=0;
        while (j<100){
            AtomicTest atomicTest=new AtomicTest();
            Thread t1=new Thread(atomicTest);
            Thread t2=new Thread(atomicTest);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            j++;
            System.out.println(atomicTest.count);
        }

    }

}
