package com.freeit.lesson11.interfVSabstract;

import java.util.Random;

/**
 * Created by Artem Peshko on 24.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Aerostat extends Balloon{

    private int counterWeight;

    public Aerostat(int balloonVolume, int maxHigh, int counterWeight) {
        super(balloonVolume, maxHigh);
        this.counterWeight = counterWeight;
    }

    public Aerostat(int balloonVolume, int maxHigh, int counterWeight, int maxPassengers) {
        super(balloonVolume, maxHigh, maxPassengers);
        this.counterWeight = counterWeight;
    }

    @Override
    public void takeoff() {
        System.out.println("heating...");
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong");
            }
            System.out.println("Взлетаем " + i);
        }
        System.out.println("Взлетели");
    }

    @Override
    public void landing() {
        System.out.println("God save us...");
    }

    @Override
    public int getMaxWeight() {
        return new Random().nextInt(100) + 100;
    }

    @Override
    public int getCurrentSpeed() {
        return new Random().nextInt(20) + 20;
    }

    public void getCounterWeight() {
        System.out.println(100);
    }
}
