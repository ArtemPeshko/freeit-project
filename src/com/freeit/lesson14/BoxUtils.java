package com.freeit.lesson14;

import java.util.Arrays;

/**
 * Created by Artem Peshko on 09.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class BoxUtils {
    public static void allCreatedBox(Box<?>[] box) {
        Arrays.asList(box).forEach(System.out::println);
    }
}
