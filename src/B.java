import java.util.Scanner;

import graphql.language.AstSorter;

public class B extends Parent {
	public B(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// m();
		m3();
//		m4();

		// Digital Sum //
//		int sum=0;
//		int num=153;
//		for(int i=0;num>0;i++) {
//			int r=num%10;
//			sum=sum+r;
//			num=num/10;
//		}
//		System.out.println(sum);
//		}
//	
//	//Armstrong Number //
//	public static void m() {
//	int sum=0;
//	int num=153;
//	for(int i=0;num>0;i++) {
//		int r=num%10;
//		sum+=r*r*r;
//		num=num/10;
//	}
//	System.out.println(sum);
	}

	// palindrom //
	public static void m3() {
		String name = "naman";
		String[] split = name.split("");
		String temp = "";
		for (int i = split.length - 1; i >= 0; i--) {
			temp += split[i];
		}
		System.out.println(temp);
		if (temp.equals(name)) {
			System.out.println("This is palindrom");
		} else {
			System.out.println("Not palindrom");
		}

	}
 
	public static void m4() {
		String name = "Sumit Yaduvanshi ";
		String[] split = name.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i]);
			System.out.println(" ");
		}
	}

	public static void m3(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();

	}
}