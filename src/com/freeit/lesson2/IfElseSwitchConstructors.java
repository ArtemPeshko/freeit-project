package com.freeit.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Artem Peshko on 23.06.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class IfElseSwitchConstructors {
    // if(true){}, if(){}else{}, if(){}else if(){}else{}

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите ваше имя: ");
//        String name = scanner.nextLine();
//        System.out.println("Введите день числом");
//        int day = scanner.nextInt();
//        System.out.println(isMale(name));
//        System.out.println("Вы выбрали день: " + dayOfWeek(day));
        sayGoodBay();
    }

    private static String isMale(String name) {
        String[] letters = {"а", "е", "ё", "и", "у", "ы", "э", "о", "ю", "я"};
        String letter = name.substring(name.length() - 1);
        if (Arrays.asList(letters).contains(letter)) {
            return "Женщина3";
        } else {
            return "Мужчина3";
        }
    }

    private static void sayGoodBay() {
        System.out.println("До встречи");
    }

    private static String dayOfWeek(int day) {
        switch (day) {
            case 1 -> {
                return "Понедельник";
            }
            case 2 -> {
                return "Вторник";
            }
            case 3 -> {
                return "Среда";
            }
            case 4 -> {
                return "Четверг";
            }
            case 5 -> {
                return "Пятница";
            }
            case 6 -> {
                return "Суббота";
            }
            case 7 -> {
                return "Воскресенье";
            }
            default -> {
                return "Нет такого дня";
            }
        }
    }
}
