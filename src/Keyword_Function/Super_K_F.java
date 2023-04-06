package Keyword_Function;

public class Super_K_F {
  int n;
  
  public void p1 (int n){
	 this.n=n;
	 System.out.println(this.n);
  }
  public void p2(){
	  System.out.println(n);
  }
  public void p3 (int a){
	  n=a;
	  System.out.println(a);
  }
  public static void main(String[] args) {
	 mm();
  }
  public static void mm() {
	  Super_K_F kf=new Super_K_F();
	  kf.p1(7);
	  kf.p3(2);
	  kf.p2();
  }
}

