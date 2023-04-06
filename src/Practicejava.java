import java.util.Scanner;

//import java.util.Scanner;
 public class Practicejava {
//public static void main (String []args) {
	//Scanner sc= new Scanner (System.in);
	//String yes_no="";
	//do {
		//System.out.println("Enter your no to print able");
		//int num=sc.nextInt();
		//for(int i=1;i<=10;i++) {
			//System.out.println(num+"x"+i+"="+num*i);
		//}
		//System.out.println("do you want to enter data again ");
		//yes_no=sc.next();
	//}while(yes_no.equalsIgnoreCase("Yes"));
//}
//}
public static void main(String[] args) {
	Scanner scr =new Scanner (System.in);
	String yes_no="";
	do {
		System.out.println("enter your no to print able ");
		int num = scr.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
		System.out.println("do you want to enter data again");
		yes_no= scr.next();
//		while(yes_no.equalsIgnoreCase("yes")) {
		
		}while(yes_no.equalsIgnoreCase("yes"));
	}
}	
