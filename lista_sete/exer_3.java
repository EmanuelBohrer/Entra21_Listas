package lista_sete;

import java.util.Scanner;

public class exer_3 {
	
	//Criar dois vetores inteiros com tamanho de 10 e imprimir o menor valor e o maior valor e fazer a soma dos dois vetores
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[]vetor1 = new int[5];
		int[]vetor2 = new int[vetor1.length];
		int menorvalue1=9999;
		int maiorvalue1=0;
		int menorvalue2=999;
		int maiorvalue2=0;
		int resul=0;
		int resul2=0;
		int total=0;
		int valorvetor1=0;
		int valorvetor2=0;
		int vetorM1=0,vetormenor1=0,vetorM2=0,vetormenor2=0;
		
		for(int i=0; i<vetor1.length; i++) {
			System.out.println("Insira o valor do vetor A  da posição "+i+":");
			vetor1[i]=read.nextInt();
			valorvetor1+=vetor1[i];
			if(vetor1[i]<menorvalue1) {
				menorvalue1=vetor1[i];
				vetormenor1=i;
				
			}
			if(vetor1[i]>maiorvalue1) {
				maiorvalue1=vetor1[i];
				vetorM1=i;
			}
			
		}System.out.println("Iniciando vetor B");
		
		for(int i=0; i<vetor2.length; i++) {
			System.out.println("Insira o valor do vetor B da posição "+i+":");
			vetor2[i]=read.nextInt();
			valorvetor2+=vetor2[i];
			if(vetor2[i]<menorvalue2) {
				menorvalue2=vetor2[i];
				vetormenor2=i;
			}
			if(vetor2[i]>maiorvalue2) {
				maiorvalue2=vetor2[i];
				vetorM2=i;
			}
		}
		
		for(int i=0; i<vetor1.length; i++) {
			resul+=vetor1[i];
			resul2+=vetor2[i];
					
		}
		
			
		total=resul+resul2;
		System.out.println("Vetor 1");
		System.out.println("");
		for(int i=0; i<vetor1.length; i++) {
			System.out.println(vetor1[i]+" ");
			
		}
		System.out.println("Menor valor do vetor A : "+menorvalue1+" na posição "+vetormenor1);
		System.out.println("Maior valor do vetor A : "+maiorvalue1+" na posição "+vetorM1);
		System.out.println("Soma do valor do vetor A : "+valorvetor1);
		
		
		
		
		
		System.out.println("Vetor 2");
		System.out.println("");
		for(int i=0; i<vetor2.length; i++) {
			System.out.println(vetor2[i]+" ");
		}
		System.out.println("Menor valor do vetor B : "+menorvalue2+" na posição "+vetormenor2);
		System.out.println("Maior valor do vetor B : "+maiorvalue2+" na posição "+vetorM2);
		System.out.println("Soma do valor do vetor B: "+valorvetor2);
		
		System.out.println("Resultado da soma dos vetores : "+total);
		
		

		read.close();
	}

}
