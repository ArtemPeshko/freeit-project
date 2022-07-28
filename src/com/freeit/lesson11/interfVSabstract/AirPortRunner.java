package com.freeit.lesson11.interfVSabstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Artem Peshko on 24.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class AirPortRunner {
    public static void main(String[] args) {
        final Random random = new Random();
        List<AirCrafts> airCrafts = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int type = random.nextInt(AirCraftType.values().length);
            AirCrafts ac = switch (type) {
                case 0 -> new Aerostat(2000, 100, 100, 10);
                case 1 -> new Dirigible(300, 500, 100);
                case 2 -> new Boeing();
                default -> new Aerostat(1000, 100, 100, 10);
            };
            airCrafts.add(ac);
        }

        for (AirCrafts airCraft : airCrafts) {
            airCraft.takeoff();
        }
        System.out.println("all aircrafts already взлетели");
        for (AirCrafts airCraft : airCrafts) {

            System.out.println("Max weight " + airCraft.getMaxWeight());
            System.out.println("Current speed " + airCraft.getCurrentSpeed());
            System.out.println("Current GPS coords " + airCraft.getGPSCoords());

        }
    }
}
