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
//        System.out.println("������� ���� ���: ");
//        String name = scanner.nextLine();
//        System.out.println("������� ���� ������");
//        int day = scanner.nextInt();
//        System.out.println(isMale(name));
//        System.out.println("�� ������� ����: " + dayOfWeek(day));
        sayGoodBay();
    }

    private static String isMale(String name) {
        String[] letters = {"�", "�", "�", "�", "�", "�", "�", "�", "�", "�"};
        String letter = name.substring(name.length() - 1);
        if (Arrays.asList(letters).contains(letter)) {
            return "�������3";
        } else {
            return "�������3";
        }
    }

    private static void sayGoodBay() {
        System.out.println("�� �������");
    }

    private static String dayOfWeek(int day) {
        switch (day) {
            case 1 -> {
                return "�����������";
            }
            case 2 -> {
                return "�������";
            }
            case 3 -> {
                return "�����";
            }
            case 4 -> {
                return "�������";
            }
            case 5 -> {
                return "�������";
            }
            case 6 -> {
                return "�������";
            }
            case 7 -> {
                return "�����������";
            }
            default -> {
                return "��� ������ ���";
            }
        }
    }
}
