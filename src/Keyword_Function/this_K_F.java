package Keyword_Function;

public class this_K_F extends Super_K_F {
  int s;
  public void m1(int s) {
	  super.mm();
	  
	 this. s=s;
	  System.out.println(s);
  }
  public void m2() {
	  System.out.println(s);
  }
  public void m3(int b) { 
	  super.p1(b);
	  s=b;
	  System.out.println(b);
  }
  public static void main(String[] args) {
	  this_K_F Fk=new this_K_F();
	  Fk.m1(12);
	  Fk.m2();
	  Fk.m3(9);
}
} 
