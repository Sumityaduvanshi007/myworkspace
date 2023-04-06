package Discussion;

public class Rinku_2d_Array {

	public static void main(String[] args) {
    int a[][]=new int[3][3];
    a[0][0]=1;
    a[0][1]=2;
    a[0][2]=3;
    a[1][0]=4;
    a[1][1]=5;
    a[1][2]=6;
    a[2][0]=7;
    a[2][1]=8;
    a[2][2]=9;
    for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
       System.err.print(a[i][j]+" ");			
		}
		System.err.println();
	}
    
	}

}
