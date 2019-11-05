package triangle;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("please enter num of rows:");
		int r = scan.nextInt();
		System.out.print("please enter the sympol:");
		String sympol = scan.next();
		String space = sympol;
		for (int i = 0; i < r; i++) {

			System.out.println(sympol);
			sympol = space + sympol;
		}
	}

}
