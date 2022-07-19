package com.freeit.lesson9.inheritance;

/**
 * Created by Artem Peshko on 17.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Animal {
    public Animal(String environment) {
        this.environment = environment;
    }

    private String environment;

    @Override
    public String toString() {
        return "Animal{" +
                "environment='" + environment + '\'' +
                '}';
    }
}