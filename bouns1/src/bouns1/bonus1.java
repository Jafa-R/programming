package bouns1;

import java.util.Arrays;
import java.util.Scanner;

public class bonus1 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("please enter your number:");
		String str = sca.next();
		String[] values = str.split(",");
		for (int i = 0; i < values.length; i++) {
			String num = values[i];
			String num1 = values[i + 1];
			int n = Integer.parseInt(num);
			int n1 = Integer.parseInt(num1);
			int sum = n + n1;
			int sub=0;
			if (n>n1){
			 sub = n - n1;
			}
			if (n1>n){
				sub=n1-n;
			}
			
			int sub2=0;
			if(sum>sub){
				sub2=sum-sub;
			}if(sub>sum){
				sub2=sub-sum;
			}
			int fainal=sub2;
			int last[]=new int [values.length];
			for (int j=0;j<=i;j++){
				last[i]=fainal;
				System.out.println(last);
			}
			}			
		}
	
	}

