package CallPackge;

public class Anupama {
 static int a=20;
 int b=21;
 {
	 System.out.println("Hii"+a+b);
	 System.out.println("static");
	 System.out.println("it is the non static block");
		System.out.println("it is the staic variable a"+"="+a);
		System.out.println("it is the non static varible b"+"="+b);
	 
 } 
 
 static {
	 System.out.println("it is the static block ");
		System.out.println("x="+a);
		Anupama x=new  Anupama();
		System.out.println("b"+x.b);
	  System.out.println("static "+" = "+a);
		
 }
 public static void main(String[] args) {
	 Anupama x=new  Anupama();
	System.out.println("Hii bro "+a);
}
}
