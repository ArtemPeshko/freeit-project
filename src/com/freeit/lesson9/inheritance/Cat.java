package com.freeit.lesson9.inheritance;

/**
 * Created by Artem Peshko on 17.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Cat extends Pet {
    private String name;

    public Cat(String environment, String breed, String name) {
        super(environment, breed);
        this.name = name;
    }

    public void piss() {
        System.out.println("pissing in boots..");
    }

    @Override
    public String toString() {
        return "Cat" + name + "\n" + super.toString();
    }
}
