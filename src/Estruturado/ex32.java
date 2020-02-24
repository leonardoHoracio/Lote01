package Estruturado;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int fatorial=in.nextInt();
		int r=1;
		for(int i=fatorial;i>1;i--){
			
			r*=i;
			System.out.println(r);
			
		}
	}
}
