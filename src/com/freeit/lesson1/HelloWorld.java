package com.freeit.lesson1;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 21.06.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter some number");
        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        boolean compare = number % 10 != number / 10 % 10
//                && number / 10 % 10 != number / 100 % 10
//                && number / 100 % 10 != number / 1000 % 10
//                && number % 10 != number / 100 % 10
//                && number % 10 != number / 1000 % 10
//                && number / 10 % 10 != number / 1000 % 10;
//        System.out.println(compare);

        String numberForCompare = scanner.nextLine();
        boolean resultCompare = true;
        for (int i = 0; i < numberForCompare.length() - 1; i++) {
            if (numberForCompare.substring(i + 1).contains(String.valueOf(numberForCompare.charAt(i)))) {
                resultCompare = false;
                break;
            }
        }
        if (resultCompare) {
            System.out.printf("В числе %s все числа разные", numberForCompare);
        } else {
            System.out.printf("В числе %s не все числа разные", numberForCompare);
        }
    }
}