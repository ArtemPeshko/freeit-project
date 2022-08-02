package com.freeit.lesson13;

import com.freeit.lesson13.annatation.IsSecretPhone;
import com.freeit.lesson13.annatation.PhoneGenerallyReady;

/**
 * Created by Artem Peshko on 02.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
@IsSecretPhone
public class Telephone {

    public static final String IS_BLOCKED_PHONE = "Phone is blocked";

    private String model;
    private boolean isBlocked = true;

    public Telephone(String model) {
        this.model = model;
    }

    public void ring() {
        System.out.println("RING RING RING");
    }

    public void blockPhone() {
        if (!isBlocked) {
            isBlocked = true;
            System.out.println(IS_BLOCKED_PHONE);
        } else {
            System.out.println("Phone is already blocked");
        }
    }

    public void takePhoto() {
        if (!isBlocked) {
            System.out.println("CHEEEESE...");
        } else {
            System.out.println(IS_BLOCKED_PHONE);
        }
    }

    @PhoneGenerallyReady(status = true)
    private void unblock() {
        isBlocked = false;
        System.out.println("Phone is unblocked");
    }
}
