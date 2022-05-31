package lista_sete_real;

import java.util.Scanner;

public class exer_9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int valorI=0;
		
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Insira a idade na posição do vetor A  "+i+":");
			vetorA[i]=read.nextInt();
			if(vetorA[i]>35) {
				valorI++;
				
			}
			
		}
		
		System.out.println("Vetor A");
		System.out.println(" ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		System.out.println(" ");
		System.out.println("Quantidade de idades maiores que 35 : "+valorI);


		read.close();
	}

}
