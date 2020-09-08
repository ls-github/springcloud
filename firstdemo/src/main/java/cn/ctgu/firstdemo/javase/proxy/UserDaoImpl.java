package cn.ctgu.firstdemo.javase.proxy;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("add user");
    }
}
