package by.bntu.fitr.povt.zavadskaya.labs.lab5.logic;

public class Reversion {

	public static int findReversion(int number) {

		return (number % 10) * 1000 + ((number % 100) - (number % 10)) * 10 + ((number % 1000) - (number % 100)) / 10
				+ (number - (number % 1000)) / 1000;
	}
}
