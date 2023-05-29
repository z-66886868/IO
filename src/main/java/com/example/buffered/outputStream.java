package com.example.buffered;

import java.io.*;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/27 18:35
 */
public class outputStream {

    public static void main(String[] args) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));

        int read;
        while((read = bis.read()) != -1){
            bos.write(read);
        }

        bos.close();
        bis.close();


    }

}
