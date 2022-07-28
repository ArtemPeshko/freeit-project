package com.freeit.lesson11.interfVSabstract;

import java.util.Random;

/**
 * Created by Artem Peshko on 24.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Dirigible extends Balloon{



    protected Dirigible(int balloonVolume, int maxHigh) {
        super(balloonVolume, maxHigh);
    }

    protected Dirigible(int balloonVolume, int maxHigh, int maxPassengers) {
        super(balloonVolume, maxHigh, maxPassengers);
    }

    @Override
    public void takeoff() {
        System.out.println("Взлетели");
    }

    @Override
    public void landing() {
        System.out.println("Приземлились");
    }

    @Override
    public int getMaxWeight() {
        return new Random().nextInt(800) + 700;
    }

    @Override
    public int getCurrentSpeed() {
        return new Random().nextInt(50) + 100;
    }
}
