package com.freeit.lesson12;

import java.util.Objects;

/**
 * Created by Artem Peshko on 28.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Car {
    private int year;
    private String model;
    private static int i = 5;
    private final static int x = 5;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public void call() {
        int x = 5;


        Engine car = new Engine();
        car.start();
    }
    class Engine {
        public void start() {
            System.out.println("Car model " + model + " year " + year + " is started!");
        }

        class Belts{
            public void routBelt() {
                System.out.println(model + year);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int hash = 9;
        hash = 31 * hash + year;
        hash = 31 * hash + (model == null ? 0 : model.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}