package com.freeit.lesson15.colls;


import com.freeit.lesson12.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Artem Peshko on 14.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class BaseCollection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2,6);
        list.set(2, 9);

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(2,6);
        linkedList.set(2, 9);


        System.out.println(list);
        System.out.println(linkedList);

    }
}
