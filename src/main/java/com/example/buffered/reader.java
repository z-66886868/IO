package com.example.buffered;

import java.io.*;
import java.util.TreeSet;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/27 18:59
 */
public class reader {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c.txt"));

        String str;
        while((str = bufferedReader.readLine()) != null){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        bufferedReader.close();

    }

}
