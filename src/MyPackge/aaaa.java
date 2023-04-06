package MyPackge;

public class aaaa {
	static int a = 5;
	int z = 10;
	public  void m2() {
		System.out.println(a);
		
	}
  public static void main(String[] args) {
	System.out.println("hello main ");aaaa p = new aaaa();
	System.out.println("hello main 2");
	System.out.println(p.z );
			
}
  static {
	  System.out.println("hii static");
	  m3();
  }
  {
	  System.out.println("i am non static ");
  }
  aaaa(){
	  System.out.println("i am constant");
  }
  aaaa(int b ){
	  System.out.println("i am b constructore");
  }
  public static void m3() {
	  System.out.println(a);
	  aaaa q= new aaaa(6);
	
}
}
