package input;
import java.util.Scanner;
public class Even_or_Odd {
public static void main(String[] args) {
	Scanner abc= new Scanner(System.in);
	String Y_N="";
	 
	do {
	System.out.println("You are enter any number and check even or odd");
	int x=abc.nextInt();
	
	if(x%2==0) {
		System.out.println("Even Number");
	}
	else{
		System.out.println("Odd Number");
	}
	System.out.println("Do you want to any other numeric check? (yes/no)");
	Y_N=abc.next();
	}while(Y_N.equalsIgnoreCase("yes"));
	System.out.println("Thank You!");
	
	
	
	
}
}
