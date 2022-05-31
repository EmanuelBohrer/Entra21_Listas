package lista_sete_real;

import java.util.Scanner;

public class exer_2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		
		for(int i =0; i< vetorA.length; i++) {
			System.out.println("Insira o valor da posição "+i+" :");
			vetorA[i] = read.nextInt();
			vetorB[i] = vetorA[i]*i;
			vetorC[i]=vetorA[i]%2;
		
			
		}
		
		System.out.println("Vetor A");
		System.out.println("");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]+" ");
		}
		System.out.println("Vetor B");
		System.out.println("");
		for(int i=0; i<vetorB.length; i++) {
			System.out.println(vetorB[i]+" ");
		}
		System.out.println("Vetor C");
		System.out.println("");
		for(int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]+" ");
		}

		read.close();
	}

}
