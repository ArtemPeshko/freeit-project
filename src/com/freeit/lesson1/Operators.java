package com.freeit.lesson1;

/**
 * Created by Artem Peshko on 21.06.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Operators {
    public static void main(String[] args) {
        // 1- arithmetical
        /**
         * + - overrided for rows
         * - - not overrided at all
         * /
         * *
         * */
//        int result1 = 4 + 1;
//        int res2 = 4 - 1;
//        int result2 = 6;
//        result2 *= 6;
//        result2 = ++result2;
//        System.out.println(result2);


//        System.out.println(f);
//        f/=2;
//        System.out.println(f);
//        System.out.println(b);
//        System.out.println(a / c);
//        System.out.println(a / f);

        // %
//        System.out.println(a % b);


        // Comparison
        /*

          >
          <
          ==
          >=
          <=
          !=

          */

//        int a = 10;
//        int b = 20;
//        boolean bool = false;
//
//        if (bool != false) {
//            System.out.println(true);
//        } else {
//            System.out.println(bool);
//        }


//        System.out.println(a != b);

        // Logical
        // || - or
        // && - and
        // ! - not
//        boolean q = true;
//        System.out.println(q);
//        System.out.println(!q);
//        int a = 10;
//        int b = 7;
//        int c = 2;
//        float f = 7.0f;
//        if (a > b || c < b || b == f) {
//            System.out.println("inside");
//        }
//
        int a = 5;
        int b = a++;
        System.out.println(b); // b присвоилось значение до инкремента
        System.out.println(a); // следующий вызов а увеличил его на 1
        System.out.println(b);
    }

}
