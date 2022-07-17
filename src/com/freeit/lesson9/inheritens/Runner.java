package com.freeit.lesson9.inheritens;

/**
 * Created by Artem Peshko on 17.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {
        Truck truck = new Truck("Renault", "Magnum", 2022, 2500);

        truck.signal();

        System.out.println(truck);
    }
}
