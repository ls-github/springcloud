package cn.ctgu.firstdemo.thread;

public class MyThread extends  Thread{
    private int count=10;

    @Override
    public void run() {
        if(count>0){
            this.count--;
            System.out.println(this.getName()+"购票成功！还剩"+this.count);
        }else {
            System.out.println("购票失败!");
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
