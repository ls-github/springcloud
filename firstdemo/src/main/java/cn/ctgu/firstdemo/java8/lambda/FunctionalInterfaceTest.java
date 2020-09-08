package cn.ctgu.firstdemo.java8.lambda;

public class FunctionalInterfaceTest {

    public void testFunctionalInterface(MyFunctionalInterface myFunctionalInterface,String message){
        myFunctionalInterface.sayHello(message);
    }

    public static void main(String[] args) throws InterruptedException {

        String mess="wangwu";

        FunctionalInterfaceTest functionalInterfaceTest=new FunctionalInterfaceTest();

        functionalInterfaceTest.testFunctionalInterface(new MyFunctionalInterface() {
            @Override
            public void sayHello(String message) {
                System.out.println("hello "+mess);
            }
        },"zhangsan");

        functionalInterfaceTest.testFunctionalInterface(m-> System.out.println("hi "+m),mess);


//        Thread t=new Thread(()-> System.out.println("this is"+Thread.currentThread().getName()),"t1");
//        t.start();
//        t.join();
//        System.out.println("main");


        MyFunctionalInterface myFunctionalInterface=new MyFunctionalInterface() {
            @Override
            public void sayHello(String message) {
                System.out.println("hello "+message);
            }
        };
        myFunctionalInterface.sayHello("zhangsan");

        MyFunctionalInterface myFunctionalInterface1=message -> System.out.println("hi "+message);
        myFunctionalInterface1.sayHello("zhangsan");




    }
}
