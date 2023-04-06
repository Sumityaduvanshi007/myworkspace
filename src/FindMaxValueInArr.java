
public class FindMaxValueInArr {
public static void main(String[] args) {
	
	int []arr = {34,53,53,55,34};
	int temp = arr[0];
	for (int i = 0 ; i <arr.length;i++) {
		for (int j = i+1 ; j<arr.length;j++) {
			if (arr[i]<arr[j]) {
				temp=arr[j];
			}
			
		}
	}
	System.out.println(temp);
	
}
}
