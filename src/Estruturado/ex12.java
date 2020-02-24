package Estruturado;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int anoNascimento, anoAtual;
		
		anoNascimento=in.nextInt();
		anoAtual=in.nextInt();
		
		anoAtual=anoAtual-anoNascimento;
		
		System.out.println("Você vai ter "+(anoAtual+17));
		

	}
}
