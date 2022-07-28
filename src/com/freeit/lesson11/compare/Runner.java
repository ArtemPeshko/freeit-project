package com.freeit.lesson11.compare;

import java.util.*;

/**
 * Created by Artem Peshko on 24.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            String uuid = UUID.randomUUID().toString();
            users.add(new User(uuid.charAt(i + 1) +
                    "_user" + uuid.substring(0, new Random().nextInt(uuid.length()))));
        }
        for (User user : users) {
            System.out.println(user.getName());
        }

        System.out.println("****************SORTING LIST***************************");
        Collections.sort(users, (User a, User b) -> a.getName().length() - b.getName().length());

        for (User user : users) {
            System.out.println(user.getName());
        }


    }
}
