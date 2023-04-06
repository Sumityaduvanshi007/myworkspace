package input;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String z;
		do {
			System.out.println("Please enter a number to print table=");
			int a = scr.nextInt();
			for (int x = 1; x <= 10; x++) {
				System.out.println(a * x);
//	int x=1;
//	x++;
//System.out.println(a*x);
			}
			System.out.println("do you want to check another number?(yes/no)");
			z = scr.next();
		} while (z.equalsIgnoreCase("Y"));
		System.out.println("thanks");
	}

}
