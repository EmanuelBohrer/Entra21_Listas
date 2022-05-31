package lista_sete_real;

import java.util.Scanner;

public class exer_5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		

		int[]vetorA = new int[5];
		int sum=0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Insira o valor do vetor A  da posição "+i+":");
			vetorA[i]=read.nextInt();
			if(vetorA[i]%5==0) {
			sum+=vetorA[i];
			}
		}
		
		System.out.println("Vetor A");
		System.out.println(" ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
		System.out.println("Soma dos valores que são multiplos de cinco : "+sum);

		read.close();
	}

}
