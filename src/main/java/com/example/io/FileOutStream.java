package com.example.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/26 9:41
 */
public class FileOutStream {

    public static void main(String[] args) throws IOException {

        FileOutputStream stream = new FileOutputStream("e.txt",true);

        String str = "abc";
        byte[] bytes = str.getBytes();
        stream.write(bytes);
        String wrap = "\r\n";
        byte[] bytes1 = wrap.getBytes();
        stream.write(bytes1);
        stream.write(bytes);

        stream.close();

    }

}
