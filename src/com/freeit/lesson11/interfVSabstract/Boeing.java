package com.freeit.lesson11.interfVSabstract;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Artem Peshko on 24.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Boeing extends AirPlane{

    @Override
    public void extendFlaps() {
        System.out.println("Flaps extended");
    }

    @Override
    public void sendSosMessage() {
        System.out.println("Please help!");
    }

    @Override
    public void takeoff() {
        System.out.println("WOOOOOOOOOOH");
    }

    @Override
    public void landing() {
        System.out.println("success");
    }

    @Override
    public int getMaxWeight() {
        return new Random().nextInt(2000) + 2000;
    }

    @Override
    public int getCurrentSpeed() {
        return new Random().nextInt(700) + 500;
    }

    @Override
    public Map.Entry<Double, Double> getGPSCoords() {
        return new AbstractMap.SimpleEntry<>(new Random().nextDouble() * 1000, new Random().nextDouble() * 1000);
    }
}
