package MyPackge;

public class CallClass {
	
	
	static int i=5;
	
	
	public void m1(int a,int b) {
		int c=a+b;
		i=16;
		System.out.println(c);
		System.out.println(i);
	}
	public static void main(String[]args) {
		i=10;
		CallClass a=new CallClass();
		a.m1(12,10);i=11;
		
		System.out.println(i);
	}
	
}

