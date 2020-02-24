package Estruturado;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int anoNascimento = in.nextInt(), mesNascimento = in.nextInt(), diaNascimento = in.nextInt();

		int anoAtual = in.nextInt(), mesAtual = in.nextInt(), diaAtual = in.nextInt();

		int ano = 0, dia = 0, mes = 0;

		if (mesNascimento > mesAtual) {
			mes = (mesAtual - mesNascimento) + 12;
			ano = -1;
			

		}

		if (diaNascimento > diaAtual) {
			dia = (diaAtual - diaNascimento) + 30;
			mes = -1;
			

		}
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(dia);

	}
}
