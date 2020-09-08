package cn.ctgu.firstdemo.thread;

public class DeadLock implements Runnable{
    private boolean flag;//决定线程走向的标记

//obj 死锁一定要请求共享资源
    private static Object obj1=new Object();
    private static Object obj2=new Object();

    public DeadLock(boolean flag){
        this.flag=flag;
    }

    @Override
    public void run() {
        if (flag){
            synchronized (obj1){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"拿到资源obj1，等待obj2");
                synchronized (obj2){
                    System.out.println(Thread.currentThread().getName()+"拿到资源obj1,obj2");
                }
            }
        }else{
            synchronized (obj2){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"拿到资源obj2，等待obj1");
                synchronized (obj1){
                    System.out.println(Thread.currentThread().getName()+"拿到资源obj1,obj2");
                }
            }

        }

    }

    public static void main(String[] args) {
        new Thread(new DeadLock(true),"t1").start();
        new Thread(new DeadLock(false),"t2").start();
    }
}
