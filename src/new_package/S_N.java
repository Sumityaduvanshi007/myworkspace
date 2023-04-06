package new_package;

import java.util.Scanner;

public class S_N {

	public static void main(String[] args) {
		// main();
//		main(2);
		// ReverseNumber();
		Reverse();
	}

	public static void main(int a) {
		String name = "sumityaduvanshi";
		int count = 0;
		int comp = 0;
		int campa = 0;
		char[] cha = name.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			for (int j = i + 1; j < cha.length; j++) {
				comp = cha[i];
				campa = cha[j];
				if (comp > campa) {
					campa = 0;

					count++;
				}

			}
			char val = (char) comp;

			System.out.println(val + "--" + count);
			count = 0;
		}
	}

	public static void main() {
		String name = "sumityaduvanshi";
		for (int i = 0; i < name.length(); i = i + 2) {
			char ch = name.charAt(i);
			System.out.print(ch);
		}
	}

	public static void ReverseNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse Number is:" + rev);
	}

	public static void Reverse() {
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
}