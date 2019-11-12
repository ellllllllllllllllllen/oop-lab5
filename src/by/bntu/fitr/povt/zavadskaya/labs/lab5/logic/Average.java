package by.bntu.fitr.povt.zavadskaya.labs.lab5.logic;

public class Average {

	public static int findArithmetic(int number) {
		return ((number % 10) * (((number % 100) - (number % 10)) / 10) * (((number % 1000) - (number % 100)) / 100)
				* (((number % 10000) - (number % 1000)) / 1000)) / 4;
	}

	public static int findGeometric(int number) {
		return (int) Math.pow(((number % 10) * (((number % 100) - (number % 10)) / 10)
				* (((number % 1000) - (number % 100)) / 100) * (((number % 10000) - (number % 1000)) / 1000)), 1 / 4);
	}
}
