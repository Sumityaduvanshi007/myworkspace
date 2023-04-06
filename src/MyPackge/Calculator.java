package MyPackge;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String operator;
	Scanner sc=new Scanner(System.in);
		Double a=sc.nextDouble();
		
		operator=sc.next();
		 
		double b=sc.nextDouble();
		
		
		switch (operator) {
		case "+": {
		System.out.println(a+b);	
		break;
		}
		
		case "-": {
			System.out.println(a-b);	
			break;
			}
			
		case "/": {
			System.out.println(a/b);	
			break;
			}
			
		case "*": {
			System.out.println(a*b);	
			break;
			}
			
		
		default:
		System.out.println("you hava entered wrong operator");
		}
		
		
	}
	
	
}
