package triangle;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.print("please enter num:");
		int n = get.nextInt();
		String a = "*";
		for (int i = 0; i < n; i++) {

			System.out.println("" + a);
			a = '*' + a;
		}
	}

}
