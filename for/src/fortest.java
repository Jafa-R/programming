import java.util.Scanner;


public class fortest {

	public static void main(String[] args) {
		Scanner scannum = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = scannum.nextInt();
		System.out.println("Enter num2:");
		int num2 = scannum.nextInt();
		int sum=num1+num2;
		System.out.println("sum = "+sum);
		
	}

}