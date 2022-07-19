package com.freeit.lesson8;

import java.util.StringTokenizer;

/**
 * Created by Artem Peshko on 12.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class StringTokenizerEx {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and " +
                "typesetting industry. Lorem Ipsum has been the industry's " +
                "standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type " +
                "specimen book. It has survived not only five centuries, " +
                "but also the leap into electronic typesetting, remaining " +
                "essentially unchanged. It was popularised in the 1960s with " +
                "the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus " +
                "PageMaker including versions of Lorem Ipsum.";

        StringTokenizer stringTokenizer = new StringTokenizer(text, " ,.");
        int countTokens = stringTokenizer.countTokens();
        System.out.println(countTokens);

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
