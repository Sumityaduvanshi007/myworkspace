package MyPackge;

public class Asd {
public static void main(String[] args) {
	int i=7;
	while(i>=0) {
		int j=0;
		while(j<=i) {
			System.out.print(" ");
		j++;
		}
		int k=7;
		while(k>=i) {
			System.out.print("*");
			k--;
		}
		i--;
		System.out.println();
	}
}
}
