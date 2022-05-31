package lista_sete_real;

import java.util.Scanner;

public class exer_11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int cont = 10;
		int[] A = new int[cont];
		int palin=0;
		
		for(int i=0; i<A.length; i++) {
			System.out.println("Informe o valor do vetor na posição "+i+" : ");
			A[i]=read.nextInt();
			if(A[i]==A[A.length - (i+1)]) {
				palin++;
				
			}
		}
		
		System.out.println("Vetor A");
		System.out.println(" ");
		for(int i=0; i<A.length; i++) {
			System.out.println(A[i]);
		}
		if(palin==(A.length/2)) {
			System.out.println("É um palindromo.");
		}else {
			System.out.println("Não é um palindromo.");
		}
			
		read.close();
	}

}
