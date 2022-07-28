package com.freeit.lesson6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Artem Peshko on 05.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class DateEx {
    public static void main(String[] args) {
        //1 ÿםגאנÿ 1970
//
//        Date date = new Date(91, 6, 5);
//        Date d = new Date();
//        long time = date.getTime();
//        long time1 = d.getTime();
//
//        Date dt = new Date(time1);
//
//        System.out.println("t1 > t " + (time1 > time));
//
//        System.out.println(date.after(d));
//        System.out.println(date.before(d));
//        System.out.println(dt);

//        GregorianCalendar calendar = new GregorianCalendar();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm", Locale.ROOT);
        String dateTimeFromUser = "12.01.2022 23:00";

        LocalDateTime ld = LocalDateTime.parse(dateTimeFromUser, dateTimeFormatter);
        System.out.println(ld);
        System.out.println(dateTimeFormatter.format(ld));
    }
}
