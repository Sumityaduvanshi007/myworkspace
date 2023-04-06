package CallPackge;

public class String_Buffer {
public static void main(String[] args) {
	
	String str ="ram";
	     str  ="shyam";
	System.out.println(str);
	
	
	
	
	
	StringBuffer sb = new StringBuffer ("Sarita Yadav "); 
	System.out.println(sb.append("From EVS Center "));
	System.out.println(sb.append("Sumit Yaduvanshi"));
	System.out.println(sb.delete(6, 13));
	System.out.println(sb.indexOf("Yadav"));
	System.out.println(sb.insert(8, "Bhadohi"));
	System.out.println(sb.substring(8, 16));
	System.out.println(sb.replace(0,0,"Har Har Mahadev"));
	System.out.println(sb.reverse());
}
}
