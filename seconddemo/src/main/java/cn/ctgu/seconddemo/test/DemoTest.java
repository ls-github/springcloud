package cn.ctgu.seconddemo.test;

public class DemoTest {
    private String name;

    public DemoTest(String name){
        this.name=name;

    }

    @Override
    public boolean equals(Object obj) {
      if(this==obj){
          return true;
      }
      if(obj instanceof DemoTest){
          return  ((DemoTest) obj).name.equals(this.name);
      }
      return false;
    }

    public static void main(String[] args) {
//        DemoTest d1=new DemoTest("lisi");
//        DemoTest d2=new DemoTest("lisi");
//        System.out.println(d1.equals(d2));
//        String s=new String("aa");
//
//        s="bbb";
//        System.out.println(s);
        String ss="s1"+"s2";
        System.out.println(ss);
        StringBuilder sb=new StringBuilder("zhangsan");
        System.out.println(sb.toString());
//        StringBuffer
        StringBuilder sss=new StringBuilder();
        sb.append("aa");
        System.out.println(sss);

    }
}
