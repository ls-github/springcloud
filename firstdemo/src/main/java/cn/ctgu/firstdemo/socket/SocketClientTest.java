package cn.ctgu.firstdemo.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",8888);
        socket.getOutputStream().write("hello".getBytes());
    }
}
