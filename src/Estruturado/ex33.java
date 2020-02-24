package Estruturado;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println();
		double z;
		
		z=1/2;
		System.out.println(z);
		
		double n = in.nextDouble();
		double r = 0;
		for (double i = 2; i <= n; i++) {
		
			  r+=1/i; System.out.println(" 1 / "+i);
			  System.out.println(r);
			  }
			 
		
		
	
	}
}