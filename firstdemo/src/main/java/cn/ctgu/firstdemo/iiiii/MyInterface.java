package cn.ctgu.firstdemo.iiiii;

public interface MyInterface {

    public void test();

    default void defaultTest() {
        System.out.println("defaultTest 方法");
    }
    //还可以写静态方法
    static void staticTest() {
        System.out.println("staticTest  的静态方法");
    }
}
