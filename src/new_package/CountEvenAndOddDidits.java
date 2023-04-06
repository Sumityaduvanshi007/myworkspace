package new_package;

import java.util.Scanner;

public class CountEvenAndOddDidits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
    int even_Count=0;
    int odd_Count=0;
    while(num>0) {
    	int r=num%10;
    	if(r%2==0) {
    		even_Count++;	
    	}
    	else {
    		odd_Count++;
    	
    	}
    	num=num/10;
    }
    System.out.println("The number of even count "
    		+ ""+even_Count+"\nThe number of odd count "
    				+ ""+odd_Count);
    
	}

}
