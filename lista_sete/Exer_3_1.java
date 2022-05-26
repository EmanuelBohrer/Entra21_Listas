package lista_sete;

import java.util.Scanner;

public class Exer_3_1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double[]valores = new double[6];
		double[]vetor2 = new double[valores.length];
		double menorV = 9999;
		double maiorV= 0;
		
	
		for(int i=0; i<valores.length; i++) {
			System.out.println("Insira o valor do vetor A  da posição "+i+":");
			valores[i]=read.nextInt();
			if(valores[i]<menorV) {
				menorV=valores[i];
				
			}
			if(valores[i]>maiorV) {
				maiorV=valores[i];
			}
		
		}
		
		for( int i = 0; i < valores.length; i++) {
			
			if(valores[i]==menorV) {
				System.out.println(valores[i]+" Menor valor!");
				continue;
			}
			if(valores[i]==maiorV) {
				System.out.println(valores[i]+" Maior valor!");
				continue;
			}else {
				System.out.println(valores[i]);
			}
			
		}

		
		

		read.close();
	}

}
