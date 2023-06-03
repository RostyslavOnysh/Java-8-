package org.Java8P3.optional.DateTimeAPI.whatIsBefore;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Main1 {
    public static void main(String[] args) {
        // java util DateTime API


        // How to get the `time` only ?
        // how to add some days to current date
        // how to format to specific format
        /*
        це проблеми з якими ми стикажмося використовуючи
        import java.util.Date;
        і потрібно користуватися додатковим класом
        import java.text.SimpleDateFormat;
         */
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(date));
    }
}
