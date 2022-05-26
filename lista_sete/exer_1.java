package lista_sete;

import java.util.Scanner;

public class exer_1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		
		for(int i=0; i< vetorA.length; i++) {
			System.out.println("Insira o valor da posição  "+i+":");
			vetorA[i] = read.nextInt();
			vetorB[i] = vetorA[i];
			
			
		}
		System.out.println("Vetor A");
		System.out.println("");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]+" ");
		}
		System.out.println("Vetor B");
		System.out.println("");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorB[i]+" ");
		}

		read.close();

	}

}
