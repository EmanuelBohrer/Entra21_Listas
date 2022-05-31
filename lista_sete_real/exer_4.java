package lista_sete_real;

import java.util.Scanner;

public class exer_4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[]vetorA = new int[5];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Insira o valor do vetor A  da posição "+i+":");
			vetorA[i]=read.nextInt();
			
		}
		
		
		for( int i = 0; i < vetorA.length; i++) {
			
			if(vetorA[i]%2==0) {
				System.out.println(vetorA[i]+" Número par!");
				continue;
			}else {
				System.out.println(vetorA[i]);
			}
		}


		read.close();
	}

}
