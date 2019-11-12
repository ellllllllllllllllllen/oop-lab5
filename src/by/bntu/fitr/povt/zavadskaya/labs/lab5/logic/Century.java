package by.bntu.fitr.povt.zavadskaya.labs.lab5.logic;

public class Century {

	public static int findCentury(int year) {
		if (year % 10 >= 1) {
			year = (year / 100) + 1;
			return year;
		} else
			return year / 100;
	}
}
