package cn.ctgu.firstdemo.socket;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        byte[] buffer=new byte[1024];
//        ServerSocket serverSocket=new ServerSocket(8888);
//        System.out.println("wait conn");
//        Socket socket=serverSocket.accept();
//        System.out.println("conn sucess");
//        socket.getInputStream().read(buffer);
//        System.out.println("message:"+buffer.toString());
        byte [] bytes=new byte[80*1024*1024];
//        System.out.println(bytes);
        System.out.println("min103  xxx");
//        Thread.sleep(Integer.MAX_VALUE);

    }
}
