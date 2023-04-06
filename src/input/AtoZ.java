package input;

import java.util.Scanner;

public class AtoZ {
public static void main(String[] args) {
	int s;
	String a="";
			
	Scanner scr= new Scanner(System.in);
	do {
	System.out.println("input number");
	s=scr.nextInt();
	if(s%2==0){
	System.out.println("it's even no..");
	}	
	else if(s%2==1){
	System.out.println("it's odd no..");
	}
	else {
		System.out.println("You Entered somthing wrong please try again");
	}
	System.out.println("do you check another number ?()yes/no)");
a=scr.next();
}
	while(a.equalsIgnoreCase("yes"));
	System.out.println("thank you");

}}