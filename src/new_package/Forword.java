package new_package;

public class Forword {

	public static void main(String[] args) {
		main();
		main(1);
	}

	public static void main(int a) {
		String name = "yusuf";
		char[] cha = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			int as = (int) cha[i];
			as--;
			System.out.print((char) as);

		}
	}

	public static void main() {
		String name = "yusuf";
		char[] cha = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			System.out.print(++cha[i]);

		}
		System.out.println();
	}
}
