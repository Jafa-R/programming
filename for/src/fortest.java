import java.util.Scanner;


public class fortest {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = get.nextInt();
		int i=0;
		char a='*';
		int c=a*num1;
			if(i<num1){
				for (i=0;i<num1;i++){
				System.out.println(""+c);
			
			}
				
		}
		System.out.println("Enter num2:");
		int num2 = get.nextInt();
		int sum=num1+num2;
		System.out.println("sum = "+sum);
		
	}

}
