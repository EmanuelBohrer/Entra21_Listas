package lista_sete;

import java.util.Scanner;

public class exer_2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		int[] vetorC = new int[8];
		int[] vetorD = new int[vetorC.length];
		
		
		for(int i =0; i< vetorC.length; i++) {
			System.out.println("Insira o valor da posição "+i+" :");
			vetorC[i] = read.nextInt();
			vetorD[i] = vetorC[i]*2;

			
		}
		System.out.println("Vetor C");
		System.out.println("");
		for(int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]+" ");
		}
		System.out.println("Vetor D");
		System.out.println("");
		for(int i=0; i<vetorD.length; i++) {
			System.out.println(vetorD[i]+" ");
		}

		read.close();
	}

}
