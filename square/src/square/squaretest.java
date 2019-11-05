package square;

import java.util.Scanner;

public class squaretest {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("please enter num:");
		int n=scan.nextInt();
		System.out.print("please enter the sympol:");
		String sympol = scan.next();
	    int m=0;
	    
	    for(int i = 0; i<n*n; i++){
	           if (m % n == 0){
	    System.out.println("");
	    	    }
	           System.out.print(sympol);
	           m++;
	  }
	}
}


