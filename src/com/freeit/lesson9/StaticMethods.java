package com.freeit.lesson9;

/**
 * Created by Artem Peshko on 17.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class StaticMethods {
    public static void main(String[] args) {
        Person artem = new Person("Artem");
        artem.printIdAndName();
        Person sveta = new Person("Sveta");
        sveta.printIdAndName();
        Person oleg = new Person("Oleg");
        oleg.printIdAndName();

    }
}

class Person {
    private String name;
    private int id;

    public static int getCounter() {
        return counter;
    }

    private static int counter = 1;

    public Person(String name) {
        this.name = name;
        id = counter++;
    }

    public void printIdAndName() {
        System.out.printf("id: %d, name: %s \n", id, name);
    }
}