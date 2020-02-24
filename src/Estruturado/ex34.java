package Estruturado;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int fatorial = in.nextInt();

		double r = fatorial;
		double soma=0;

		for (double j = 0; j < fatorial; j++) {

			for (double i = 1; i < fatorial; i++) {

				r *= i;

			}
			
			System.out.println("valor do fatorial "+r);
			
			soma+=(1/r);
			
			
			System.out.println(soma);
			
		}

	}
}
