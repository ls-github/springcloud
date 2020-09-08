package cn.ctgu.firstdemo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadImplCallable implements Callable<Object> {
    private int number;

    public ThreadImplCallable(int number){
        this.number=number;
    }

    @Override
    public Object call() throws Exception {
        System.out.println("thread start");
        return number==0 ?"suceess":"error";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Object> futureTask = new FutureTask<Object>(new ThreadImplCallable(2));
        new Thread(futureTask).start();
        System.out.println("main");
        //获取
        System.out.println(futureTask.get());

    }

}
