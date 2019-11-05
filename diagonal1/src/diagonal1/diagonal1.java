package diagonal1;

import java.util.Scanner;

public class diagonal1 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.print("please enter num:");
		int n = get.nextInt();
		System.out.print("please enter the sympol:");
		String a = get.next();
		String s = "   ";
		for (int i = 0; i < n; i++) {

			System.out.println(a);
			a =s+a;
		

	}

}
}
