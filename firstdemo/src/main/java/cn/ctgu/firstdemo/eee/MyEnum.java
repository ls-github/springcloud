package cn.ctgu.firstdemo.eee;

public enum MyEnum {

    MAN("zhangsan",20),WOMAN("huahua",18);

    private final String name;
    private final int age;

    MyEnum(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
