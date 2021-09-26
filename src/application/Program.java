package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Value 1: ");
		int number1 = sc.nextInt();
		
		System.out.print("Value 2: ");
		int number2 = sc.nextInt();
		
		System.out.println(number1 + number2);
		
		
		sc.close();

	}

}
