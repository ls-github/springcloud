package cn.ctgu.firstdemo.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    private Semaphore semaphore=new Semaphore(3);

    public void work(){
        try {
            //拿机器
//            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+"拿到机器工作！");
            Thread.sleep(100);
//            semaphore.release();
            System.out.println(Thread.currentThread().getName()+"释放机器！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SemaphoreTest semaphoreTest=new SemaphoreTest();
        for(int i=0;i<8;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    semaphoreTest.work();
                }
            },"t"+i).start();
        }
    }




}
