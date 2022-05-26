package lista_dois;

import java.util.Scanner;

public class Atv_9 {

	public static void main(String[] args) {
		int pessoas;
		float vcarne,vceva,total;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de membros na festa : ");
		pessoas = read.nextInt();
		
		vcarne = (float) (0.5*18*pessoas);
		vceva = (float) (6*1.7*pessoas);
		total = vcarne+vceva;
		
		System.out.println("Valor gasto com carne : "+vcarne+" reais.");
		System.out.println("Valor gasto com cerveja : "+vceva+" reais.");
		System.out.println("O valor total será de : "+total+" reais.");
		
		read.close();
		

	}

}
