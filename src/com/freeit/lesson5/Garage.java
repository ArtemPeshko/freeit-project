package com.freeit.lesson5;

/**
 * Created by Artem Peshko on 02.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Garage {
 //   https://t.me/+XGefuqLQT5hjYzAy
    public int openTime;
    public int closeTime;
    public String name;

    public Garage() {
    }

    public Garage(int openTime, int closeTime, String name) {
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.name = name;
    }

    public void changeOil() {
        System.out.println("Oil changed");
    }

    public void repairEngine() {
        System.out.println("Engine had been repaired");
    }

    @Override
    public String toString() {
        return "Garage{" +
                "openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", name='" + name + '\'' +
                '}';
    }
}
