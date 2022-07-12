package com.freeit.lesson8;

import java.util.Arrays;

/**
 * Created by Artem Peshko on 12.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public enum Month {
    JANUARY(1, "Январь", new Thread(() -> {
        System.out.println("январь...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Снег идет");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    FEBRUARY(2, "Февраль", new Thread(() -> {
        System.out.println("февраль...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Снег идет");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    MARCH(3, "Март", new Thread(() -> {
        System.out.println("март...");
        for (int i = 0; i < 4; i++) {
            System.out.println("трава зеленеет");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    APRIL(4, "Апрель", new Thread(() -> {
        System.out.println("апрель...");
        for (int i = 0; i < 4; i++) {
            System.out.println("трава позеленела");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    MAY(5, "Май", new Thread(() -> {
        System.out.println("май...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Закрой окно, не май месяц");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    JUNE(6, "Июнь", new Thread(() -> {
        System.out.println("июнь...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Отпуск");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    JULY(7, "Июль", new Thread(() -> {
        System.out.println("июль...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Черника..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    AUGUST(8, "Август", new Thread(() -> {
        System.out.println("Август...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Сбор урожая");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    SEPTEMBER(9, "Сентябрь", new Thread(() -> {
        System.out.println("Сентябрь...");
        for (int i = 0; i < 4; i++) {
            System.out.println("дети в школу");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    OCTOBER(10, "Октябрь", new Thread(() -> {
        System.out.println("Октябрь...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Листья пожелтели");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    NOVEMBER(11, "Ноябрь", new Thread(() -> {
        System.out.println("Ноябрь...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Листья опали");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    DECEMBER(12, "Декабрь", new Thread(() -> {
        System.out.println("декабрь...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Снег идет");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }));

    private final int ordinal;
    private final String description;
    private final Thread thread ;

    Month(int ordinal, String description, Thread thread) {
        this.ordinal = ordinal;
        this.description = description;
        this.thread = thread;
    }

    public static Month getMonthByOrdinal(int ordinal) {
        return Arrays.stream(Month.values())
                .filter(index -> index.ordinal == ordinal)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No found month by ordinal " + ordinal));
    }

    public void runTasks() {
        thread.start();
    }
}
