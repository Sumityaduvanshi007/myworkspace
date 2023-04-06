import java.util.Iterator;
import java.util.Scanner;

public class RinkuSir {
public static void main(String[] args) {
	methodOne();
	myMethod();
	 main();
//	Method();
	myString();
	
}
	public static void main1 () {
	String s1="hello";
	String s2="hello";
	StringBuilder s3=new StringBuilder("hello");
	String s4=new String("hello");
	String a=s1+"hii";
	s3.append("hii");
  System.out.println(s3);
	if(s3.equals(s1)) {
		System.out.println("good");
	} 
}
public static void myMethod() {  
	String name= "I Love My India ";
	String[] split=name.split(" ");
    for (int i = split.length-1; i >=0; i--) {
		String naam=split[i];
		if(naam.equals("Love")) {
			char[]a=naam.toCharArray();
			for (int j = a.length-1; j >=0 ; j--) {
				System.out.print(a[j]);
	}	
		System.out.print(" ");
	}else {
		System.out.print(naam);
		System.out.print(" ");
	}
	}
}

public static void methodOne() {
	String name= "I Love My India ";
	String[] split=name.split(" ");
	for (int i = 0; i < split.length; i++) {
		String naam=split[i];
		if(naam.equals("Love")) {
		char[]a=naam.toCharArray();
		for (int j = a.length-1; j >=0 ; j--) {
			System.out.print(a[j]);
}	
		System.out.print(" ");
		}
	else if(naam.equals("India")) {
	char[]b = naam.toCharArray();
	for (int x = b.length-1; x >=0 ; x--) {
		System.out.print(b[x]);	
	} 
}
else {
	System.out.print(split[i]+" ");
}
}
}
public static void main() {
	int[] ab=new int[12];
	ab[0]=1;
	ab[1]=2;
	ab[2]=3;
	ab[3]=4;
	ab[4]=5;
	ab[5]=1;
	ab[6]=2;
	ab[7]=3;
	ab[8]=4;
	ab[9]=5;
	ab[10]=7;
	ab[11]=8;
//	int a =ab.length;
//	System.out.println(a);
	for (int i = 0; i < ab.length; i++) {
		int j = ab[i];
		
	}
}













public static void myString() {
	System.out.println("Input Name: ");
	Scanner scr = new Scanner(System.in);
	String name= scr.nextLine();
	String []split = name.split("");
	int size =split.length;
	System.out.println(size+" size");
	 char[] str = name.toCharArray();
	int count = 0 ;
	System.out.println(str.length);
	for (int i = 0; i < str.length; i++) {
		count++;
	}
	if(count>=5) {
    for (int i = str.length-1; i >=0; i--) {
    	System.out.print(str[i]);
    }
	}else {
	System.out.println("Your charector is less then 5 charector sorry");

	}
}}



	






