package lista_sete_real;

import java.util.Scanner;

public class exer_7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		float pImpar=0;
		float pPar=0;
		int sumImpar=0;
		int sumPar=0;
		int cont=0;
		float resulP=0;
		float resulI=0;
		
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Insira o valor do vetor A  da posição "+i+":");
			vetorA[i]=read.nextInt();
			cont++;
			if(vetorA[i]%2!=0) {
				sumImpar+=vetorA[i];
				pImpar++;
			}else if(vetorA[i]%2==0) {
				sumPar+=vetorA[i];
				pPar++;
			}
			
		}
		
		System.out.println("Vetor A");
		System.out.println(" ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
		resulI=(pImpar/cont)*100;
		resulP=(pPar/cont)*100;
		
		System.out.println("Porcentagem de impares : "+pImpar);
		System.out.println("Porcentagem de pares : "+pPar);

		
		
		
			read.close();
		
	}
	
}