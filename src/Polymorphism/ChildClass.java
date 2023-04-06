package Polymorphism;

public class ChildClass extends ParentClass{
	
	public void m1() {
		System.out.println("Hii m1");
	}
	public String m2() {
		System.out.println("Hii m2");
		return null;
	}
	public Integer m3() {
		System.out.println("Hii m3");
		return  0;
	}
public static void main(String[] args) {
	ParentClass pc=new ChildClass();
	pc.m1();
	pc.m2();
	pc.m3();
}
}
