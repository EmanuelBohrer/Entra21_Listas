package lista_sete_real;

import java.util.Scanner;

public class exer_3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		float[] vetorC = new float[vetorA.length];
		
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Insira o valor do vetor A  da posição "+i+":");
			vetorA[i]=read.nextInt();
		}
		
		
		for(int i=0; i<vetorB.length; i++) {
			System.out.println("Insira o valor do vetor B da posição "+i+":");
			vetorB[i]=read.nextInt();
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
		
		for(int i=0; i<vetorC.length; i++) {
			vetorC[i]=vetorA[i]+vetorB[i];
		}
		
		System.out.println("Vetor C - Soma dos Vetores (A & B)");
		System.out.println("");
		for(int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]+" ");
		}
		
		for(int i=0; i<vetorC.length; i++) {
			vetorC[i]=vetorA[i]-vetorB[i];
		}
		
		System.out.println("Vetor C - Subtração dos Vetores (A & B)");
		System.out.println("");
		for(int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]+" ");
		}
		
		for(int i=0; i<vetorC.length; i++) {
			vetorC[i]=vetorA[i]*vetorB[i];
			
		}
		System.out.println("Vetor C - Multiplicação dos Vetores (A & B)");
		System.out.println("");
		for(int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]+" ");
		}
		
		for(int i=0; i<vetorC.length; i++) {
			vetorC[i]=(float) vetorA[i]/vetorB[i];
			
		}
		System.out.println("Vetor C - Divisão dos Vetores (A & B)");
		System.out.println("");
		for(int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]+" ");
		}
		
		
		
		

		read.close();
	}

}
