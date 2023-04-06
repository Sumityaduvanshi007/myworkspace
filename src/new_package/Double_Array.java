package new_package;

public class Double_Array {

	public static void main(String[] args) {
String arr[][]=new String [4][3];
arr[0][0]="FirstName";
arr[0][1]="LastName";
arr[0][2]=" Age";
arr[1][0]="Vivek";
arr[1][1]="Yadav";
arr[1][2]="18";
arr[2][0]="Avishek";
arr[2][1]="Yadav";
arr[2][2]="18";
arr[3][0]="Sumit";
arr[3][1]="Yadav";
arr[3][2]="17";

for (String[] str : arr) {
	for (String st : str) {
		System.out.print(st+"            ");
	}
	System.out.println();
}

	}

}
