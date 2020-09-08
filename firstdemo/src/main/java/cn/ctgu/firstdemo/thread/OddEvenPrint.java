package cn.ctgu.firstdemo.thread;

public class OddEvenPrint {
    private int number = 0;
    private Object obj = new Object();

    //奇线程 打印奇数
    public void printOdd() {
        while (number < 10) {
            synchronized (obj) {
                if (number % 2 != 0) {
                    number++;
                    System.out.println(Thread.currentThread().getName() + "打印" + number);
                    obj.notify();
                } else {
                    try {
                        this.obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }


        }
    }

    //偶线程 打印偶数
    public synchronized void printEven() {
        while (number < 10) {
            synchronized (obj) {
                if (number % 2 == 0) {
                    number++;
                    System.out.println(Thread.currentThread().getName() + "打印" + number);
                    obj.notify();
                } else {
                    try {
                        this.obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }


        }
    }

    public static void main(String[] args) {
        OddEvenPrint oddEvenPrint = new OddEvenPrint();
        new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenPrint.printEven();
            }
        }, "even thread:").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenPrint.printOdd();
            }
        }, "odd thread:").start();

    }


}
