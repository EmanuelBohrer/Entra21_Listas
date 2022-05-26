 package lista_cinco;

import java.util.Scanner;

public class Atv_1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float var1,resul;
		
		System.out.println("Insira o valor a ser pesquisado : ");
		var1 = read.nextFloat();
		
		resul = var1 % 2;
		
		if (resul == 0) {
			System.out.println("Valor é par. ");
		}else {
			System.out.println("Valor impar.");
		}
		
		
		

		read.close();

	}

}
