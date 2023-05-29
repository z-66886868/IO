package com.example.transfrom;

import java.io.*;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/28 13:25
 */
public class test {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( new FileInputStream("c.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt")));

        String str;
        while((str = bufferedReader.readLine()) != null){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        bufferedReader.close();

    }

}
