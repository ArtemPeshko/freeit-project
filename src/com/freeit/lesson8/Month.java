package com.freeit.lesson8;

import java.util.Arrays;

/**
 * Created by Artem Peshko on 12.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public enum Month {
    JANUARY(1, "������", new Thread(() -> {
        System.out.println("������...");
        for (int i = 0; i < 4; i++) {
            System.out.println("���� ����");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    FEBRUARY(2, "�������", new Thread(() -> {
        System.out.println("�������...");
        for (int i = 0; i < 4; i++) {
            System.out.println("���� ����");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    MARCH(3, "����", new Thread(() -> {
        System.out.println("����...");
        for (int i = 0; i < 4; i++) {
            System.out.println("����� ��������");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    APRIL(4, "������", new Thread(() -> {
        System.out.println("������...");
        for (int i = 0; i < 4; i++) {
            System.out.println("����� ����������");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    MAY(5, "���", new Thread(() -> {
        System.out.println("���...");
        for (int i = 0; i < 4; i++) {
            System.out.println("������ ����, �� ��� �����");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    JUNE(6, "����", new Thread(() -> {
        System.out.println("����...");
        for (int i = 0; i < 4; i++) {
            System.out.println("������");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    JULY(7, "����", new Thread(() -> {
        System.out.println("����...");
        for (int i = 0; i < 4; i++) {
            System.out.println("�������..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    AUGUST(8, "������", new Thread(() -> {
        System.out.println("������...");
        for (int i = 0; i < 4; i++) {
            System.out.println("���� ������");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    SEPTEMBER(9, "��������", new Thread(() -> {
        System.out.println("��������...");
        for (int i = 0; i < 4; i++) {
            System.out.println("���� � �����");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    OCTOBER(10, "�������", new Thread(() -> {
        System.out.println("�������...");
        for (int i = 0; i < 4; i++) {
            System.out.println("������ ���������");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    NOVEMBER(11, "������", new Thread(() -> {
        System.out.println("������...");
        for (int i = 0; i < 4; i++) {
            System.out.println("������ �����");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    DECEMBER(12, "�������", new Thread(() -> {
        System.out.println("�������...");
        for (int i = 0; i < 4; i++) {
            System.out.println("���� ����");
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
