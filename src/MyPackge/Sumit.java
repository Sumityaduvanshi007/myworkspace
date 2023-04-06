package MyPackge;
public class Sumit {
	 static int a=10;
	 int b=20;
	 Sumit(){ //c 
	  System.out.println("my first constructor");
	 }
	 Sumit(int f){
	  int c=25;
	  
	 System.out.println(c);
	 System.out.println(f);
	 }
	 public void m1() {
		 System.out.println();
	 }
	 static{
	  System.out.println("Hii i am constructor");
	  a = 400;
	  System.out.println(a);
	 }
	 { 
	 System.out.println("my first instance block"+" = "+a);
	 m1();
	 System.out.println("00"+b);
	 }
	   public static void main (String[]args){
	    
		   Sumit q =  new Sumit();//obj
		   q.b=22;
	   Sumit xyz=new Sumit();
	   xyz.a =266;	    
	    Sumit x=new Sumit(xyz.b);
	 }

}
