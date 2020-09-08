package cn.ctgu.firstdemo.io;

import java.io.*;

public class FileIOStream {

    public static void main(String[] args) throws IOException {

        InputStream inputStream=new FileInputStream("e:\\aa.txt");
        OutputStream outputStream=new FileOutputStream("e:\\bb.txt");


        System.out.println(inputStream);
//        int len;
//        while((len=inputStream.read())!=-1){
//            System.out.println(len);
//            outputStream.write(len);
//        }


        int len;
        byte [] buff=new byte[3];
        while ((len=inputStream.read(buff))!=-1){
            System.out.println(len);
            outputStream.write(buff,0,len);
        }




    }



}
