package lista_cinco;

import java.util.Scanner;

public class Atv_13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n1,n2,n3,v;
		
		System.out.println("Insira o 1 lado do possível triangulo: ");
		n1 = read.nextInt();
		System.out.println("Insira o 2 lado do possível triangulo: ");
		n2 = read.nextInt();
		System.out.println("Insira o 3 lado do possível triangulo: ");
		n3 = read.nextInt();
		
		v = n1+n2;
		
		if(v<n3) {
			System.out.println("Com os valores atuais, é impossível a formação de um triângulo.");
		}else if(n1 == n2 && n2 == n3){
			System.out.println("É um triângulo equilátero. ");
			
		}else if(n1!= n2 && n1 != n3 && n3 != n2) {
			System.out.println("É um triangulo escaleno.");
		}else {
			System.out.println("É um triângulo isósceles.");
		}

		read.close();
	}

}
