package input;

import java.util.Scanner;

public class Signal {
public static void main(String[] args) {
	String S="input simbal";
	String g= "green";
			String r="red";	
			String y="yeiiow";
			Scanner scr = new Scanner(System.in);
			do {
	System.out.println("in put simble");
	 g= scr.next();
		System.out.println("green  go");
		System.out.println("in put simble");
		 r= scr.next();
		System.out.println("red stop");
		System.out.println("in put simble");
		 y= scr.next();
		System.out.println("yellow reddy");
		System.out.println("do you want to check another simble?(yes/no)");
		S=scr.next();
	}while(S.contains("yes"));
	System.out.println("Thanks");

}
}
