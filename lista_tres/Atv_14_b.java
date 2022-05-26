package lista_tres;

import java.util.Scanner;

public class Atv_14_b {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float a,b,c;
		
		a=30;
		b=20;
		c= a+b;
		System.out.println("Valor de C : "+c);
		b=10;
		
		System.out.println("Valor de B : "+b+" Valor de C : "+c);
		c=a+b;
		System.out.println("Valor de A : "+a+" Valor de B : "+b+" Valor de C = "+c);
		
		
		
		read.close();

	}

}
