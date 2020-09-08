package cn.ctgu.firstdemo.thread.wait;

public class WaitThread {
    private static int count=0;

    public static void main(String[] args) throws InterruptedException {

        Object obj=new Object();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                if(count==0){
                    System.out.println(Thread.currentThread().getName()+" 等待ing");
                    synchronized (obj){
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }


                }
                System.out.println(Thread.currentThread().getName()+" get 包子 ");
            }
        });
        t1.start();


        Thread.sleep(1000);
        count=1;
        System.out.println(Thread.currentThread().getName()+"生产 包子");
        synchronized (obj){
            obj.notifyAll();
        }








    }
}
