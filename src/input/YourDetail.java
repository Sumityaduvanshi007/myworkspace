package input;

import java.util.Scanner;

public class YourDetail {
	public static void main(String[] args) {

//	  for (int i = 1; i <=10; i++) {
//		  for (int sum =2; sum <=10; sum++) {
//			 System.out.printf("%5d",sum*i); 
//		  }
//		  System.out.println();
//	}
		String A = "input data";
		Scanner scr = new Scanner(System.in);
		do {
			do {
				System.out.println("input Name");
				String name = scr.next();
				System.out.println("input Age");
				String age = scr.next();
				System.out.println("input Number");
				String number = scr.next();
				System.out.println("input City ");
				String city = scr.next();

				System.out.println(name);

				System.out.println("Age = " + age);
				System.out.println("Number = " + number);
				System.out.println("City = " + city);
				System.out.println("do you want to check another person?(yes/no)");
				A = scr.next();
			} while (A.contains("y"));
			if (A.equalsIgnoreCase("no")) {
				System.out.println("thank you!");
				break;
			}
			System.out.println("you have enter the invalid input(enter yes /no)");
			A = scr.next();
		} while (A.equalsIgnoreCase("y"));
		System.out.println("Thanks");
	}
}