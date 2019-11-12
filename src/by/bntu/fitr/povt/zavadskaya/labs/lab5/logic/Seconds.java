package by.bntu.fitr.povt.zavadskaya.labs.lab5.logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Seconds {

	public static int findSeconds() {
		GregorianCalendar date = new GregorianCalendar();
		return (date.get(Calendar.HOUR_OF_DAY) * 3600) + date.get(Calendar.MINUTE) * 60;

	}

}
