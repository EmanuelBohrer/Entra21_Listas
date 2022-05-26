package lista_tres;

import java.util.Scanner;

public class Atv_14_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		float a,b,c;
		a=10;
		b=20;
		c=a;
		b=c;
		a=b;
		System.out.println("Valor de A : "+a+" Valor de B : "+b+" Valor de C = "+c);

		read.close();

	}

}
