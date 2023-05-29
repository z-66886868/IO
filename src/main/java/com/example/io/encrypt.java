package com.example.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/26 22:04
 */
public class encrypt {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("b.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("a.jpg");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1){
            byte[] xor = xor(bytes,len);
            fileOutputStream.write(xor,0,len);
        }

        fileOutputStream.close();
        inputStream.close();

    }

    public static byte[] xor(byte[] bytes,int len){
        for (int i = 0; i < len; i++) {
            bytes[i] = (byte) (bytes[i] ^ 10);
        }
        return bytes;
    }

}
