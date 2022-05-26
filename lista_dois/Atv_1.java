package lista_dois;

import java.util.Scanner;

public class Atv_1 {

	public static void main(String[] args) {
		float consumo,total;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira o consumo : ");
		consumo = read.nextFloat();
		
		total = consumo*1/60f*2.3f;
		
		System.out.println("O total a ser pago será de : "+total);
		
		read.close();
		

	}

}
