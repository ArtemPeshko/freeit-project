package com.freeit.lesson10.implementation;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class TvRemoteRunner {
    public static void main(String[] args) {
        TvRemote remote = new SamsungTvRemote();
        TvRemote remote1 = new LgTvRemote();

        TvRemote[] remotes = new TvRemote[10];
        remotes[0] = remote;
        remotes[1] = remote1;
    }
}
