package square;

import java.util.Scanner;

public class squaretest {

	public static void main(String[] args) {
		Scanner get= new Scanner(System.in);
		System.out.print("pleas enter num:");
		int n=get.nextInt();
	    int mod=0;
	    
	    for(int i = 0; i<n*n; i++){
	           if (mod % n == 0){
	    System.out.println("");
	    	    }
	           System.out.print("*");
	           mod++;
	  }
	}
}


