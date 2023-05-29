package com.example.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/26 10:24
 */
public class fileInputStream {

    public static void main(String[] args) throws IOException {

        System.currentTimeMillis();

        FileInputStream stream = new FileInputStream("a.txt");

        int c;
        String str = "";
        while ((c = stream.read()) != -1){
            str += (char) c;
        }
        System.out.println(str);
        stream.close();

    }

}
