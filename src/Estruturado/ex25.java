package Estruturado;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int HoraInicial, MinutoInicial, HoraFinal, MinutoFinal;

		HoraInicial = in.nextInt();
		MinutoInicial = in.nextInt();
		HoraFinal = in.nextInt();
		MinutoFinal = in.nextInt();

		int HoraJogada = 0, MinutoJogada = 0;

		/*
		 * if (HoraInicial > 23 || HoraInicial < 0 || MinutoInicial < 0 ||
		 * MinutoInicial > 60 || HoraFinal < 0 || HoraFinal > 23 || MinutoFinal
		 * < 0 || MinutoFinal > 60) { System.out.println("Valor inválido"); }
		 */

		if (HoraInicial > HoraFinal) {

			HoraJogada = HoraFinal - HoraInicial + 24;
		} else if (HoraInicial < HoraFinal) {

			HoraJogada = HoraFinal - HoraInicial;
		}
		if (MinutoInicial > MinutoFinal) {
			HoraJogada = -1;
			MinutoJogada = MinutoInicial - MinutoFinal + 60;
		} else if (MinutoInicial < MinutoFinal) {

			MinutoJogada = MinutoFinal - MinutoInicial;
		}

		System.out.println(HoraJogada);
		System.out.println(MinutoJogada);
	}

}
