package Estruturado;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		double salario=0;
		
		salario=in.nextDouble();
		
//		System.out.println("Seu novo salário vai ser de "+((salario*15)/100)+salario);
		
		System.out.println((salario*0.15)+salario);
		
	}

}
