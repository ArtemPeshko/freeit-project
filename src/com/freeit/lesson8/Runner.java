package com.freeit.lesson8;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 12.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {
        Month[] values = Month.values();

        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите номер мес€ца: ");
        int i = sc.nextInt();
        Month monthByOrdinal = Month.getMonthByOrdinal(i);
        System.out.println(monthByOrdinal);
        monthByOrdinal.runTasks();
    }


}
