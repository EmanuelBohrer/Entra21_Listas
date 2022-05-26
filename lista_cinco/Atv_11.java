package lista_cinco;

import java.util.Scanner;

public class Atv_11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		float opt1,opt2,resul;
		
		System.out.println("Insira o tipo de operação que você deseja:");
		System.out.println("Soma (S), Menos(M), Multiplicar (P), Dividir (D)");
		char esc = read.next().charAt(0);
		
		switch(esc) {
		case 'S':
			System.out.println("Insira os valores para a soma.");
			System.out.println("Valor 1 : ");
			opt1 = read.nextInt();
			System.out.println("Valor 2 : ");
			opt2 = read.nextInt();
			resul = opt1+opt2;
			System.out.println("Resultado da soma: "+resul);
			break;
			
		case 'M':
			System.out.println("Insira os valores para a subtração.");
			System.out.println("Valor 1 : ");
			opt1 = read.nextInt();
			System.out.println("Valor 2 : ");
			opt2 = read.nextInt();
			resul = opt1-opt2;
			break;
			
		case 'P':
			System.out.println("Insira os valores para a multiplicação.");
			System.out.println("Valor 1 : ");
			opt1 = read.nextInt();
			System.out.println("Valor 2 : ");
			opt2 = read.nextInt();
			resul = opt1*opt2;
			break;
			
		case 'D':
			System.out.println("Insira os valores para a divisão.");
			System.out.println("Valor 1 : ");
			opt1 = read.nextInt();
			System.out.println("Valor 2 : ");
			opt2 = read.nextInt();
			resul = opt1/opt2;
			break;
		
		default:
			System.out.println("Sigla não encontrada.");
		}
		

		read.close();
	}

}
