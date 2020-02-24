package Estruturado;

import java.util.Scanner;

public class ex24 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double valor=in.nextDouble();
		
		if((valor%2==0) && (valor%3==0)){
			
			System.out.println(valor+" Divisivel");
		}
		
	}
}
