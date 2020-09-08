package cn.ctgu.firstdemo.classloader;

public class LoadDemo {
    private  String name="aaa";
    public  static int age=1;

    static {
        System.out.println("static before"+age);
        age=2;
        System.out.println("static after"+age);
    }
    {
        System.out.println("ptong before "+age);
        age=5;
        System.out.println("ptong after "+age);
    }

    public LoadDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public LoadDemo(){
        System.out.println("init  a before ===>"+age);
        age = 3;
        System.out.println("init  a after ===>"+age);
    }
}