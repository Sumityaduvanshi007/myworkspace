package new_package;

public class Reverse {
	public static void main(String[] args) {
//		main(2);
//		main();
//		name();
		main(" ");
		
	}

	public static void name() {

		String name = "Hey i am Sumit";
		String[] split = name.split("i");
		for (int i = 0; i < split.length; i++) {
			String naam = split[i];
			if (naam.equals("Hey")) {
				char[] a = naam.toCharArray();
				for (int j = a.length - 1; j >= 0; j--) {
					System.out.print(a[j]);
				}
				System.out.print(" ");
			} else if (naam.equals("Sumit")) {
				char[] b = naam.toCharArray();
				for (int x = b.length - 1; x >= 0; x--) {
					System.out.print(b[x]);
				}
			} else if (naam.equals("am")) {
				char[] c = naam.toCharArray();
				for (int s = c.length - 1; s >= 0; s--) {
					System.out.print(c[s]);
				}
				System.out.print(" ");
			} else {
				System.out.print(split[i] + " ");
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
System.err.println();
	}

	public static void main(int o) {
		String name = "Hey I am Sumit";
		String[] as = name.split(" ");
		for (int i = 0; i < as.length; i++) {
			String arr = as[i];
			for (int j = arr.length()- 1; j >= 0; j--) {
			System.out.print(arr.charAt(j));
			}
			System.out.print(" ");
		}
		System.err.println();
	}
	public static void main(String o) {
		String name = "Hey I am Sumit";
		String[] as = name.split("m");
		for (int i = 0; i < as.length; i++) {
			String arr = as[i];
			for (int j = arr.length()- 1; j >= 0; j--) {
			System.out.print(arr.charAt(j));
			}
			System.out.print(" ");
		}
		System.err.println();
	}
}
