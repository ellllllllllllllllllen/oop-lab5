package by.bntu.fitr.povt.zavadskaya.labs.lab5.controler;

import by.bntu.fitr.povt.zavadskaya.labs.lab5.logic.Average;
import by.bntu.fitr.povt.zavadskaya.labs.lab5.logic.Century;
import by.bntu.fitr.povt.zavadskaya.labs.lab5.logic.DayNumber;
import by.bntu.fitr.povt.zavadskaya.labs.lab5.logic.Reversion;
import by.bntu.fitr.povt.zavadskaya.labs.lab5.logic.Seconds;
import by.bntu.fitr.povt.zavadskaya.labs.lab5.logic.Squares;
import by.bntu.fitr.povt.zavadskaya.labs.lab5.logic.Sum;
import by.bntu.fitr.povt.zavadskaya.labs.lab5.view.Input;
import by.bntu.fitr.povt.zavadskaya.labs.lab5.view.Output;

public class Main {

	public static void main(String[] args) {
		System.out.print("—ounting the number of seconds elapsed since the beginning of the day.\n");
		Output.output(Seconds.findSeconds());

		int number = Input.input("\nEnter a four digit number: ");

		System.out.print("\nSum: ");
		Output.output(Sum.findSum(number));

		System.out.print("\nArithmetic mean: ");
		Output.output(Average.findArithmetic(number));
		System.out.print("\nGeometric mean: ");
		Output.output(Average.findGeometric(number));

		System.out.print("\nReversion: ");
		Output.output(Reversion.findReversion(number));

		System.out.println("\n—alculation of the day number of the year.");
		Output.output(DayNumber.findNumber(Input.input("Input day: "), Input.input("Input month: ")));

		System.out.println("\n—ounting the number of squares in a rectangle.");
		Output.output(Squares.findQuantity(Input.input("Input the length of the side of the square: "),
				Input.input("Input the length of the first side of the rectangle: "),
				Input.input("Input the length of the second side of the rectangle: ")));

		System.out.println("\nCalculation of the unallocated area of a rectangle.");
		Output.output(Squares.findArea(Input.input("Input the length of the side of the square: "),
				Input.input("Input the length of the first side of the rectangle: "),
				Input.input("Input the length of the second side of the rectangle: ")));

		Output.output(Century.findCentury(Input.input("\nEnter the year to determine the century: ")));
	}

}
