package com.freeit.lesson9.inheritens;

/**
 * Created by Artem Peshko on 17.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Truck extends Car{

    private int weight;

    public Truck(String name, String model, int year, int weight) {
        super(name, model, year);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                '}' + super.toString();
    }
}
