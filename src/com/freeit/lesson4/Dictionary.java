package com.freeit.lesson4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem Peshko on 01.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Dictionary {
    public static void main(String[] args) {
        countWithMap("������, ��� ����, �� ���");
    }

    public static void countLetters(String text){
        text = text.toLowerCase();

        int[] result = new int['�' - '�' + 1];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= '�' && ch <= '�'){
                result[ch - '�']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + '�') + " = " + result[i]);
        }
    }


    public static void countWithMap(String text) {
        Map<Character, Integer> map = new HashMap<>();
        text.chars().forEach(e -> map.put((char) e, map.getOrDefault((char) e, 0) + 1));
        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
