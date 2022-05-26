package lista_cinco;

import java.util.Scanner;

public class Atv_17 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			int dia;
			
			System.out.println("Insira o dia da semana : ");
			dia = read.nextInt();
			
			switch(dia) {
			case 1:
				System.out.println("Primeiro dia da semana : Segunda - Feira!");
				break;
			case 2:
				System.out.println("Segundo dia da semana : Terça - Feira!");
				break;
			case 3:
				System.out.println("Terceiro dia da semana : Quarta - Feira!");
				break;
			case 4:
				System.out.println("Quarto dia da semana : Quinta - Feira!");
				break;
			case 5:
				System.out.println("Quinto dia da semana, e o melhor : Sexta - Feira!");
				break;
			case 6:
				System.out.println("Sexto dia da semana : Sábado!");
				break;
			case 7:
				System.out.println("Sétimo dia da semana : Domingo!");
				break;
				
			default:
				System.out.println("Você não digitou um dia válido!");
				break;
				
			}

			read.close();
	}

}
