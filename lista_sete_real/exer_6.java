package lista_sete_real;

import java.util.Scanner;

public class exer_6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[]vetorA = new int[5];
		int Impar=0;
		int opp=0;
		int media=0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Insira o valor do vetor A  da posição "+i+":");
			vetorA[i]=read.nextInt();
			if(vetorA[i]%2!=0) {
				Impar+=vetorA[i];
				opp++;
			}
		}
		
		System.out.println("Vetor A");
		System.out.println(" ");
		for(int i=0; i<vetorA.length; i++) {
		if(vetorA[i]%2!=0) {
			System.out.println(vetorA[i]+" Número Impar!");
			continue;
		}else {
			System.out.println(vetorA[i]);
		}
		
		media=Impar/opp;
		
		

		read.close();
	}
		System.out.println("A média aritmetrica simples dos ímpares é : "+media);

	}
}
