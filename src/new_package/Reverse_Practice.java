package new_package;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class Reverse_Practice {

	public static void main(String[] args) {
		String name = "Hey I am satish ";
		String[] obj = name.split(" ");

		for (int i = 0; i <= obj.length - 1; i++) {

			char[] bj = obj[i].toCharArray();

			for (int j = bj.length - 1; j >= 0; j--) {

				System.out.print(bj[j]);
			}
			System.out.print(" ");
		}
	}

}
