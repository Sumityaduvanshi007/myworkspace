package CallPackge;

public class StaticFlowCtl {
 static int b=12;
  {  m1();
	  System.out.println("Hii bro");
	 
 }
  public void m1() {
	  System.out.println("m1");
	  System.out.println("j="+j);
	 
  }
  {
	  System.out.println("static block");
  }
  int j=10;
  public static void main(String[] args) {
	
	  StaticFlowCtl ab= new StaticFlowCtl();
	  ab.m1()
	  ;
}
}
