package com.example.io;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Fly
 * @version 1.0
 * @date 2023/5/26 11:29
 */
public class DateTime {

    public static void main(String[] args) {


        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(date);
        System.out.println(format);

    }

}
