package com.freeit.lesson5;

/**
 * Created by Artem Peshko on 02.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {
        Garage garage = new Garage(8, 8, "freeit garage");

        System.out.println(garage);
        
        Garage toliksGarage = new Garage();

        System.out.println(toliksGarage);
    }
}
