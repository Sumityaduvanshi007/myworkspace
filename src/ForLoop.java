
public class ForLoop {

	public static void main(String[] args) {	
		for (int i =1; i<=5; i++) {
			for (int j=1; j<=i; j++) {			
			System.out.print("");	                                                      					
			for (int k =i; k<5; k++) {
			System.out.print(" ");
			}
			System.out.println();	
		}
		for (int i1=1; i1<=5; i1++) {
			for (int j =5; j>i1; j--) {
			System.out.print(" ");	
			}
			for (int k =1; k <=i1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	int sum=0;
	int num=153;
	for(int i1=0;num>0;i1++) {
		int r=num%10;
		sum+=r*r*r;
		num=num/10;
	}
	System.out.println(sum);		
	}
}
}