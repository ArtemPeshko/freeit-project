package com.freeit.lesson12;

/**
 * Created by Artem Peshko on 28.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {

        User user = new User() {
            @Override
            public void tell() {
                System.out.println("BLA_BLA_BLA");
            }
        };
        user.tell();


        UserInterf userInterf = new UserInterf() {
            @Override
            public void run() {
                System.out.println("running");
            }

            @Override
            public void eat() {
                System.out.println("eating");
            }
        };
        userInterf.run();
        userInterf.eat();
    }
}
