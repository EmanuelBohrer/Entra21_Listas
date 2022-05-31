package lista_sete_real;

import java.util.Scanner;

public class exer_14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[]vetorA = new int[10];
		int[]vetorB = new int[10];
		int[]vetorC = new int[20];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor do vetor da posição "+i+":");
			vetorA[i]= read.nextInt();
			vetorC[i]+=vetorA[i];

		}
		
		for (int i =0; i<vetorB.length; i++) {
			System.out.println("Insira o valor do vetor da posição "+i+":");
			vetorB[i]= read.nextInt();
			vetorC[10+i]=vetorB[i];

		}
		
		System.out.println("Vetor C");
		System.out.println(" ");
		for(int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
		read.close();
	}

}
