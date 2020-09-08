package cn.ctgu.firstdemo.iiiii;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void test() {

    }

    @Override
    public void defaultTest() {
        System.out.println("重写 defaultTest");
    }

    static void staticTest() {
        System.out.println("impl  staticTest  的静态方法");
    }

    public static void main(String[] args) {
        MyInterface.staticTest();

        MyInterfaceImpl.staticTest();
//        MyInterface myInterface=new MyInterfaceImpl();
//        myInterface.defaultTest();
    }



}
