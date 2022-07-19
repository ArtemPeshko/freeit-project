package com.freeit.lesson6;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Artem Peshko on 05.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class ArraysEx {
    public static void main(String[] args) {

        int[] arr = new int[3];
        int arr1[] = new int[3];
        int[] arr2 = {1, 3, 5, 67, 23, 56, 11, 8, 9, 2, 3, 4, 5};

        String s = Arrays.toString(arr2);
        System.out.println(s);

        Arrays.sort(arr2);
        String res = Arrays.toString(arr2);
        System.out.println(res);
    }
}
