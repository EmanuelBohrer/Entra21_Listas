package lista_sete_real;

import java.util.Scanner;

public class exer_8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int menor=0;
		int igual=0;
		int maior=0;
		int media=0;
		int cont=0;
		
		
		for(int i=0; i<vetorA.length; i++) {
			cont++;
			System.out.println("Insira o valor do vetor A  da posição "+i+":");
			vetorA[i]=read.nextInt();
			if(vetorA[i]<15) {
				menor+=vetorA[i];
			}else if(vetorA[i]==15) {
				igual++;
			}else if(vetorA[i]>15) {
				maior+=vetorA[i];
			}
		}

		
		
		System.out.println("Vetor A");
		System.out.println(" ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
		media = maior/cont;
		System.out.println("A) Soma dos elementos menores que 15 : "+menor);
		System.out.println("B) Elementos do vetor que são iguais a 15: "+igual);
		System.out.println("C) Média dos elementos armazenados que são superiores a 15 : "+media);



		read.close();
	}

}
