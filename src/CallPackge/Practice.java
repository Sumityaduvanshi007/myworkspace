package CallPackge;

public class Practice {
	static int a=12;
	int b=19;
	public void fun() {
		System.out.println(a+" "+b);
		++a; ++b;
	}
	
public static void main(String[] args) {
	Practice d=new Practice();
	d.fun();
	d.fun();
	d.fun();
	d.fun();
	d.fun();
	int c=20;
	System.out.println(c);
	
}

	
}
