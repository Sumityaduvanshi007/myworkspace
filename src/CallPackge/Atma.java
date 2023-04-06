package CallPackge;

public class Atma {
	static int x=45;
	int b=64;
	{
		System.out.println("it is the non static block");
		System.out.println("it is the staic variable x"+x);
		System.out.println("it is the non static varible b"+b);
	}
	static {
		System.out.println("it is the static block ");
		System.out.println("x="+x);
		Atma h=new Atma();
		System.out.println("b"+h.b);
	  System.out.println("static "+" = "+x);
		
		
	}
	Atma(){
		System.out.println("it is the constructor without ");
		System.out.println("x"+x);
		System.out.println("b"+b);
		
	}
	Atma(int j,int f){
	System.out.println("it is the ");	
	}
	public static void main(String[] args) {
		m2();
		Atma a=new Atma();
	}
public static void m2() {
	
}
}
