package com.freeit.lesson17.exceptions.guesswhat;

@SuppressWarnings("unused")
public class Ugadajka2_2 {
	public static void main(String[] args) {
		try {
			System.err.println(" 0");//вывели 0
						try {
							System.err.println(" 1");// вывели 1
								if (true) {
									throw new RuntimeException(); // возникло исключение и мы его выбросили
								}
								System.err.println(" 2");
							} catch (RuntimeException e) {// словили исключение
								System.err.println(" 3");//
							} finally {
								System.err.println(" 4");//
							}
				System.err.println(" 5");//
			} catch (Exception e) {
				System.err.println(" 6");
			} finally {
				System.err.println(" 7");//
			}
		System.err.println(" 8");//
	}
}
