package cn.ctgu.firstdemo.pattern.single;

public class SingleDesign {
    private static volatile SingleDesign singleDesign;

    private SingleDesign(){
    }

    private void sayHello(){
        System.out.println("hello");
    }


    private static  SingleDesign getSingleDesign() throws InterruptedException {
        if(singleDesign==null){
            synchronized(SingleDesign.class){
                if(singleDesign==null){
                    Thread.sleep(1);
                    singleDesign=new SingleDesign();
                }
            }
        }
        return singleDesign;

    }

    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        SingleDesign.getSingleDesign().sayHello();
//                        System.out.println(SingleDesign.getSingleDesign());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
