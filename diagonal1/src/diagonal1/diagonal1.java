package diagonal1;

import java.util.Scanner;

public class diagonal1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("please enter num of rows:");
		int r = scan.nextInt();
		System.out.print("please enter the sympol:");
		String  sympol= scan.next();
		String space = "  " ;
		for (int i = 0; i < r; i++) {

			System.out.println(sympol);
			sympol =space+sympol;
		

	}

}
}
