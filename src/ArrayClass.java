import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

import org.w3c.dom.html.HTMLIsIndexElement;

public class ArrayClass {
public static void main(String[] args) {
maximum() ;
//	 minimum();
// duplication();
// a(1);
//   b();
//   b(3);
//	duplicateString(8);
}
public static void maximum() {
	int []arr= {2,8,2,56,8,9,0};
	int tamp=arr[0];
		for (int j= 1; j < arr.length; j++) {
		if (tamp<arr[j]) {
			tamp=arr[j];
		}
	} 
		System.out.println("Maximum No.. "+tamp);	
}
public static void minimum() {
	int []arr= {9,3,5,4,8,2,6};
	int tamp=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (tamp>arr[i]) {
			tamp=arr[i];
		}
	}
	System.out.println("Minimum No.. "+tamp);	
}
public static void duplication() {
	int []arr= {1,2,2,4,5,6,6,8};
	int temp=1;
	int a=1;
	for (int i = 0; i < arr.length; i++) {
		temp=1;
		for (int j= i+1; j < arr.length; j++) {
		if (arr[i]==arr[j]) {
			temp++;
			a=arr[i];
		}
	} 
		if (temp==2) {	
			System.out.println("Duplication No.. "+a);	
		}
	}
}
public static void a() {
	int []arr= {1,8,5,4,6,7};
	int num=0;
	for (int i = 0; i < arr.length; i++) {
		
//		System.out.println(arr[i]);
	}
}
public static void b() {
String []arr= {"Sumit","Vivek","Vinay","Aman","Rahul"};
String name="sumit";
for (int i = 0; i < arr.length; i++) {
	if (name.equalsIgnoreCase(arr[i])) {
		break;
	}
}
     char hr[]=name.toCharArray();
     for (int i = hr.length-1; i >=0 ; i--) {
    	 if (hr[i]==hr[hr.length-1]) {
			hr[i]=(char)(hr[i]-32);
		}
		System.out.print(hr[i]);
	}System.out.println();
}
 public static void b(int a) {
	 String []arr= {"Sumit"," Vivek","Vivek","Vinay","Aman","Rahul"};
		int temp=1;
		String s="";  
		for (int i = 0; i < arr.length; i++) {
			temp=1;
			for (int j= i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				temp++;
				s=arr[i];
			} 
		} 
		}
			if (temp==2) {
			}
				 char hr[]=s.toCharArray();
			     for (int i = hr.length-1; i >=0 ; i--) {
			    	 if (hr[i]==hr[hr.length-1]) {
						hr[i]=(char)(hr[i]-32);
					}
					System.out.print(hr[i]);
				}	
 }
 public static void a(int a) {
//	 String name= " My Love ";
//  char hr[]=name.toCharArray();
//		     for (int i = hr.length-1; i >=0 ; i--) {
//		    	
//				System.out.print(hr[i]);
//		}
	 int[] num = {7,5,4,6,9,3,2,8,1};
	 for (int i = 0; i < num.length; i++) { 
			System.out.println(num[i]+"="+num[i]%2);
		}
	
	}
 public static void duplicateString () {
	 String word= "Hi I ma Sumit Yadav".toLowerCase();
		String  []arr = word.split(" ");
		int temp=1;
		String s="";
		for (int i = 0; i < arr.length; i++) {
			s+=arr[i]; 
		}
		char[]arr2 = s.toCharArray();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i+1; j <arr2.length; j++) {
				if (arr2[i]==arr2[j]) {
					temp++;
			}
			}
			if (temp==2) {
				System.out.println("duplicateString = "+arr2[i]);
			}
			temp=1;
		}
 }
 public static void duplicateString (int a) {
	 Set<Character> data=new LinkedHashSet<Character>();
	 String name= "Hi I ma Sumit Yadav".toLowerCase();
	 for (int i = 0; i < name.length(); i++) {
	char ch=name.charAt(i);
	data.add(ch);
	}
	 Iterator<Character> it= data.iterator();
	 while (it.hasNext()) {
    System.out.print(it.next());		
	}
 }
}

