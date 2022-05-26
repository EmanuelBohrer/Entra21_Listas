package lista_seis;

import java.util.Scanner;

public class Atv_17 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float a=80000;
		float b =200000;
		int anos=0;
		int aP;
		float bP;
		
		while(a<b) {
			a = a+a*0.03f;
			b = b+b*0.015f;
			anos++;
			
			
		}
		System.out.println("População A : "+a);
		System.out.println("População B : "+b);
		System.out.println("Levará : "+anos+" anos.");

		read.close();
	}

}
