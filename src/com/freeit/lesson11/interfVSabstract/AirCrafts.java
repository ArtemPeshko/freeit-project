package com.freeit.lesson11.interfVSabstract;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Artem Peshko on 24.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public interface AirCrafts {

    void takeoff();

    void landing();

    int getMaxWeight();

    int getCurrentSpeed();

    default Map.Entry<Double, Double> getGPSCoords() {
        return new AbstractMap.SimpleEntry<>(new Random().nextDouble(), new Random().nextDouble());
    }

}
