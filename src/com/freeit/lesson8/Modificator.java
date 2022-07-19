package com.freeit.lesson8;

/**
 * Created by Artem Peshko on 12.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Modificator {
    private int priv = 0;
    private int prot = 0;
    public int publ = 0;
    int deflt = 0;

    private int[] array = {1, 2, 3, 4, 5,};

    private String print() {
        return "hello";
    }

    public int getPriv() {
        return priv;
    }

    public int[] getArray() {
        return array;
    }

    public void setPriv(int priv) {
        this.priv = priv;
    }
}
