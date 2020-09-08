package cn.ctgu.firstdemo.thread;

import java.util.concurrent.CountDownLatch;

public class CoachPlayers {
    private  CountDownLatch countDownLatch=new CountDownLatch(3);

    public void playerReady(){
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread()+"准备完毕！");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //教练 进行训练
    public void coachTrain(){
        try {
            countDownLatch.await();
            System.out.println("运动员准备就绪，开始训练！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        final CoachPlayers coachPlayers=new CoachPlayers();
        new Thread(new Runnable() {
            @Override
            public void run() {
                coachPlayers.playerReady();
            }
        },"sport1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                coachPlayers.playerReady();
            }
        },"sport2").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                coachPlayers.playerReady();
            }
        },"sport3").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                coachPlayers.coachTrain();
            }
        },"coach").start();
    }
}
