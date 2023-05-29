package com.example.transfrom;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/28 13:12
 */
public class reader {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("a.txt", Charset.forName("UTF-8"));
        FileWriter fileWriter = new FileWriter("b.txt", Charset.forName("GBK"));

        int b;
        while ((b = fileReader.read()) != -1){
            fileWriter.write(b);
        }

        fileWriter.close();
        fileReader.close();


    }

}
