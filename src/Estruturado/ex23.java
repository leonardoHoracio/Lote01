package Estruturado;

import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n1, n2, n3, n4;

		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		n4 = in.nextInt();

		if (n4 < n1) {

			System.out.println(n4);
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}

		else if (n4 > n1 && n4 < n2) {
			System.out.println(n1);
			System.out.println(n4);
			System.out.println(n2);
			System.out.println(n3);

		} else if (n4 > n2 && n4 < n3) {

			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n4);
			System.out.println(n3);

		} else if (n4 > n3) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);

		}
	}

}
