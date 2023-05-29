package com.example.conpress;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/29 9:43
 */
public class tozip {

    public static void main(String[] args) throws IOException {

        File src = new File("C:\\Users\\Fly\\Desktop\\aaa");
        File dest = new File(src.getParent(), src.getName() + ".zip");

        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(dest));

        tozip(src,zipOutputStream,src.getName());

        zipOutputStream.close();

    }

    public static void tozip(File src,ZipOutputStream out,String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                ZipEntry zipEntry = new ZipEntry(name + "\\" + file.getName());
                out.putNextEntry(zipEntry);
                FileInputStream fileInputStream = new FileInputStream(file);
                int b;
                while((b = fileInputStream.read()) != -1){
                    out.write(b);
                }

                fileInputStream.close();
                out.closeEntry();
            }else{
                tozip(file,out,name + "\\" + file.getName());
            }
        }

    }

}
