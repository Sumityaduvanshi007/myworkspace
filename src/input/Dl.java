package input;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class Dl {

	public static void main(String[] args) {
		int N;
		Scanner scr = new Scanner(System.in);
		String x=" ";
		do {
			System.out.println("Enter your birth");
			N=scr.nextInt();
			int a=2022-N;
			if (a>18) {
				if(a<60) {
					System.out.println("you are elidible for driving linces");
				}else {
					System.out.println("you are senior citizen ");
				}
			}
			else  {
				System.out.println("you are not eligible for DL");
			}
			System.out.println("do you want to check another person?(yes/no)");
			x=scr.next();
		}while(x.equalsIgnoreCase("Y"));
		System.out.println("thanks");
	}
}
	
	

