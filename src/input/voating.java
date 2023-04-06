package input;

import java.util.Scanner;

public class voating {
public static void main(String[] args) {
	int A;
	String q;
	Scanner scr = new Scanner(System.in);
	do {
	System.out.println("birth");
	A=scr.nextInt();
	int a=2022-A;
	
	if (a>18)
		System.out.println("you are eligible for votiing ");

	else  {
		System.out.println("you are not eligible for votiing ");
	}
		System.out.println("do you want to check another person?(yes/no)");
		q=scr.next();
	}while(q.equalsIgnoreCase("y"));
System.out.println("thanke");

}
}
