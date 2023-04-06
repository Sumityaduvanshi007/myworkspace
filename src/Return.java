
public class Return {

	public static void main(String[] args) {
String name ="i am going to school with my friends";
 String[]so =name.split(" ");
 for (int i = 0; i < so.length; i++) {
	if(i%2==0) {
		String sgl=so[i];
		char[]hd=sgl.toCharArray();	
		for (int j =  hd.length-1; j >= 0; j--) {
			System.out.print(hd[j]);
		}
		System.out.print(" ");
	}else 
		System.out.print(so[i]+" ");
	}
}
	}


