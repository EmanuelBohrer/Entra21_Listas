package lista_dois;

import java.util.Scanner;

public class Atv_5 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			float peso,valor;
			
			System.out.println("Insira o peso do seu prato em gramas : ");
			peso = read.nextFloat();
			
			valor = (peso-230f)*0.02f;
			
			System.out.println("O valor a ser pago é de : "+valor);
			
			read.close();
	}

}
