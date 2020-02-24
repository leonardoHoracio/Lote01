package Estruturado;

import java.util.Scanner;

public class ex10 {

	
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
			float v1,v2;
			
			v1=in.nextFloat();
			v2=in.nextFloat();
			
			System.out.println(v1);
			System.out.println(v2);
			v1=v1-v2;
	
			
			System.out.println("A diferença entre eles é de "+v1);
	}
}
