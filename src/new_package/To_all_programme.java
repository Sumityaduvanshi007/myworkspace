package new_package;

import com.google.common.base.FinalizablePhantomReference;

public class To_all_programme {

	public static final void main(String[] args) {
		CountWordNumber();
		main();
	}
	public static void CountWordNumber() {
		String name = "SumitYaduvanshi".toLowerCase();

		for (char i = 'a'; i <= 'z'; i++) {
			int count = 0;
			for (int j = 0; j <= name.length() - 1; j++) {
				if (i == name.charAt(j)) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(i + "-" + count);
			}
		}
	}
	public static void main() {
		String name = "Hey I am Sumit";
		String[] as = name.split(" ");
		for (int i = 0; i < as.length; i++) {
			char[] arr = as[i].toCharArray();
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[j]);
			}
			System.out.print(" ");
		}
}
}
