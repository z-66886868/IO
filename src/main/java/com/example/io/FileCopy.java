package com.example.io;

import java.io.*;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/26 11:13
 */
public class FileCopy {

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("a.txt");
            outputStream = new FileOutputStream("b.txt");
            byte[] bytes = new byte[1024 * 1024 * 5];
            int len;
            while ((len = inputStream.read(bytes)) != -1 ){
                outputStream.write(bytes,0,len);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
