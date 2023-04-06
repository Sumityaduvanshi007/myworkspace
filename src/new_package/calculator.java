package new_package;

import java.util.Scanner;

public class calculator {
	

	public static void add(double a,double b) {

	}
	public static void main(String[] args) {
		
	}
	public static void main() {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter a Number:");
		double num=sc.nextDouble();
		System.out.println("Enter a :");
		String s=sc.next();
		switch(s) {
		case "+":{
			 num=sc.nextDouble();
			 System.out.println("Enter a Namber");
			 add(num, num);
			break;
		}
		case"-":{
			 num=sc.nextDouble();
			 System.out.println("Enter a Namber");
			 add(num, num);
			break;
		}
		case"*":{
			 num=sc.nextDouble();
			 System.out.println("Enter a Namber");
			 add(num, num);
			break;
		}
		case"/":{
			 num=sc.nextDouble();
			 System.out.println("Enter a Namber");
			 add(num, num);
			break;
		}
		}
	}
}
