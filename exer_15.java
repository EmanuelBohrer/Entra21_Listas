package lista_sete_real;

import java.util.Scanner;



public class exer_15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[]vetorA = new int[5];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor do vetor na posição "+i+":");
			vetorA[i] = read.nextInt();
		}
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Posição "+i+" : "+vetorA[i]);
		
	
		System.out.println("Os divisores são : ");
		for(int t=1; t<=vetorA[i]; t++) {
			if(vetorA[i]%t==0) {
				System.out.println("Divisor : "+t);
			}
			
	}
}
		
		
		
		
		

		read.close();
	}

}
