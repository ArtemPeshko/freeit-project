package com.freeit.lesson17.exceptions.guesswhat;

@SuppressWarnings("unused")
public class Ugadajka5 {
	public static void main(String[] args) {
        System.err.println("#1.in");
        f();
        System.err.println("#1.out");
    }
    public static void f() {
        System.err.println(".   #2.in");
        g();
        System.err.println(".   #2.out");
    }
    public static void g() {
        System.err.println(".   .   #3.in");
        try {
            h();
        } catch (Exception e) {
            System.err.println(".   .   #3.CATCH");
        }
        System.err.println(".   .   #3.out");
    }
    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error();
        }
        System.err.println(".   .   .   #4.out");
    }
}
