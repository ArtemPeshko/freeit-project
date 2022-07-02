package com.freeit.lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Artem Peshko on 30.06.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Arrays {
    public static void main(String[] args) {
//        String[] students = new String[6];
//
//        students[0] = "Artem";
//        students[1] = "Stanislav";
//        students[2] = "Olga";
//        students[3] = "Katya";
//        students[4] = "Maria";
//        students[5] = "Oleg";
//
//        for (int i = 0; i < students.length; i++) {
//            if (i % 2 == 0) {
//                students[i] = "goodbye";
//            }
//            System.out.println(students[i]);
//        }

//        int[][] arrays = new int[4][];
//
      Random random = new Random();
//
//        for (int i = 0; i < arrays.length; i++) {
//            arrays[i] = new int[random.nextInt(10) + 1];
//            for (int j = 0; j < arrays[i].length; j++) {
//                arrays[i][j] = random.nextInt(10) + 1;
//                System.out.print(arrays[i][j] + "   ");
//            }
//            System.out.println();
//        }

        int i1 = random.nextInt(10) + 3;
        int[][] arraysInt = new int[3][3];

        for (int i = 0; i < arraysInt.length; i++) {
            for (int j = 0; j < arraysInt[i].length; j++) {
                arraysInt[i][j] = i1;
                System.out.print(arraysInt[i][j] + "  ");
            }
            System.out.println();
        }
    }
}