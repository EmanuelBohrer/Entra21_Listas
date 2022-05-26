package lista_cinco;

import java.util.Scanner;

public class Atv_16 {

	public static void main(String[] args) {
		int resul,n1,n2;
		
		
		Scanner read = new Scanner(System.in);
		System.out.println("Calculadora - Opções atuais : Soma (+) Subtração (-) Multiplicação (*) Divisão(/)!");
		System.out.println("Insira o tipo da operação com seu caractere: ");
		char opt = read.next().charAt(0);
		
		
		// Opção Adição
		if(opt == '+') {
			System.out.println("Insira o 1 valor : ");
			n1 = read.nextInt();
			System.out.println("Insira o 2 valor : ");
			n2 = read.nextInt();
			resul = n1+n2;
			System.out.println("O resultado da soma de: "+n1+" + "+n2+" foi de : "+resul);
			if(resul>0) {
				System.out.println("O resultado foi positivo!");
			}else {
				System.out.println("O resultado foi negativo!");
			}
			if(resul%2==0) {
				System.out.println("É par!");
			}else {
				System.out.println("É impar!");
			}
			
			//Opção Subtração
		}else if(opt=='-') {
			System.out.println("Insira o 1 valor : ");
			n1 = read.nextInt();
			System.out.println("Insira o 2 valor : ");
			n2 = read.nextInt();
			resul =n1-n2;
			System.out.println("O resultado da subtração de: "+n1+" - "+n2+" foi de : "+resul);
			if(resul>0) {
				System.out.println("O resultado foi positivo!");
			}else {
				System.out.println("O resultado foi negativo!");
			}
			if(resul%2==0) {
				System.out.println("É par!");
			}else {
				System.out.println("É impar!");
			}

			
			//Opção Multiplicação
		}else if(opt=='*') {
			System.out.println("Insira o 1 valor : ");
			n1 = read.nextInt();
			System.out.println("Insira o 2 valor : ");
			n2 = read.nextInt();
			resul = n1*n2;
			System.out.println("O resultado da multiplicação de: "+n1+" * "+n2+" foi de : "+resul);
			if(resul>0) {
				System.out.println("O resultado foi positivo!");
			}else {
				System.out.println("O resultado foi negativo!");
			}
			if(resul%2==0) {
				System.out.println("É par!");
			}else {
				System.out.println("É impar!");
			}
			
			
			//Opção Divisão
		}else if(opt=='/') {
			System.out.println("Insira o 1 valor : ");
			n1 = read.nextInt();
			System.out.println("Insira o 2 valor : ");
			n2 = read.nextInt();
			resul = n1*n2;
			System.out.println("O resultado da divisão de: "+n1+" / "+n2+" foi de : "+resul);
			if(resul>0) {
				System.out.println("O resultado foi positivo!");
			}else {
				System.out.println("O resultado foi negativo!");
			}
			if(resul%2==0) {
				System.out.println("É par!");
			}else {
				System.out.println("É impar!");
			}
		
			
			//Opção Inválida
		}else {
			System.out.println("Operação desconhecida!");
		}
		

		read.close();
	}

}
