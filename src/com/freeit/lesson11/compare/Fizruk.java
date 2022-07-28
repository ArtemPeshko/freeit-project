package com.freeit.lesson11.compare;

import java.util.Comparator;

/**
 * Created by Artem Peshko on 24.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Fizruk implements Comparator<User> {

    @Override
    public int compare(User user, User user1) {
        return user.getName().length() - user1.getName().length();
    }
}
