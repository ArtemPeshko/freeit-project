package com.freeit.lesson14;

import com.freeit.lesson12.Car;

import java.util.ArrayList;

/**
 * Created by Artem Peshko on 09.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {

        Box<String> box = new Box<>(new String[10]);
        box.addToBox("Element 1");
        box.addToBox("Element 2");
        box.addToBox("Element 2");
        System.out.println(box.getFirst());

        Box<Number> boxInt = new Box<>(new Number[10]);
        boxInt.addToBox(1L);
        boxInt.addToBox(2L);

        Box<Object> boxObj = new Box<>(new Object[10]);
        boxObj.addToBox("Element");
        boxObj.addToBox(1);
        boxObj.addToBox(new Car(2022, "new"));

        System.out.println("First element in box " + boxObj.getFirst());

        BoxUtils.allCreatedBox(new Box[]{box, boxInt, boxObj});
    }
}
