package com.freeit.lesson6;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
//        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm");
//        System.out.println(sdf.format(new Date()));
//        System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.UK));
//        System.out.println(calendar.get(Calendar.YEAR));

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        ld = ld.plusDays(5);
        System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now();
        int dayOfYear = ldt.getDayOfYear();
        System.out.println(dayOfYear);
    }
}
