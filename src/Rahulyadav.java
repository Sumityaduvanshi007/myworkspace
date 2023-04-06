import java.util.Scanner;
public class Rahulyadav {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		String yes_no="";
		do{
		String rs=reverseString();
		System.out.println(rs);
		System.out.println("Do you want to enter another string?  (yes or no)");
		yes_no=sc1.next();
		}while(yes_no.equalsIgnoreCase("yes"));
		if (yes_no.equalsIgnoreCase("no"))System.out.println("Thankyou !!");
		else System.out.println("entered wrong Statement.");
	}	
	public static String reverseString() {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter a String to reverse!");
	String str=sc.nextLine();
	String sum="";
	for(int i= str.length()-1;i>=0;i--) {
		char ch= str.charAt(i);
		sum= sum+ch;
	}
	return sum;
	}
}
