package com.freeit.lesson14;

import com.freeit.lesson12.Car;

/**
 * Created by Artem Peshko on 09.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Box <T> {

    private final T[] array;

    public Box(T[] array) {
        this.array = array;
    }

    public void addToBox (T s) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = s;
                return;
            }
        }
    }

    public T getFirst() {
        for (T s : array) {
            if (s != null) {
                return s;
            }
        }
        return null;
    }

    public T[] getAll(){
        return array;
    }
}
