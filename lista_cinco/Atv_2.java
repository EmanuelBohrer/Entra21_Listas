package lista_cinco;

import java.util.Scanner;

public class Atv_2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float var,var1;
		
		System.out.println("Insira o valor a ser pesquisado : ");
		var = read.nextFloat();
		
		if(var >=1) {
			System.out.println("Valor positivo.");
		}else if(var <=-1) {
			System.out.println("Valor negativo.");
		}else {
			System.out.println("Valor neutro.");
		}
		

		read.close();
	}

}
