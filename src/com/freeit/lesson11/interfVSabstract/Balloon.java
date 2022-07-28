package com.freeit.lesson11.interfVSabstract;

/**
 * Created by Artem Peshko on 24.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public abstract class Balloon implements AirCrafts {

    private final int balloonVolume;
    private final int maxHigh;
    private int maxPassengers;

    protected Balloon(int balloonVolume, int maxHigh) {
        this.balloonVolume = balloonVolume;
        this.maxHigh = maxHigh;
    }

    protected Balloon(int balloonVolume, int maxHigh, int maxPassengers) {
        this(balloonVolume, maxHigh);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
