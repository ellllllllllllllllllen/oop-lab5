package by.bntu.fitr.povt.zavadskaya.labs.lab5.logic;

public class Squares {

	public static int findQuantity(int a, int b, int c) {
		int count = 0;
		int rectangleArea = b * c;
		int squareArea = a * a;
		if (a <= b && a <= c) {
			while (squareArea <= rectangleArea) {
				count += 1;
				rectangleArea -= squareArea;
			}
		}
		return count;
	}

	public static int findArea(int a, int b, int c) {

		int rectangleArea = b * c;
		int squareArea = a * a;
		if (a <= b && a <= c) {
			while (squareArea <= rectangleArea) {
				rectangleArea -= squareArea;
			}
		}
		return rectangleArea;
	}
}
