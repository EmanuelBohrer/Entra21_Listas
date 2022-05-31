package lista_sete_real;

import java.util.Scanner;

public class exer_13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int cont = 5;
		int[] A = new int[cont];
		int[] B = new int[A.length];
		int t=1;

		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Informe o valor da posição "+i+" :");
			A[i]=read.nextInt();
		}
		t = cont-1;
		for(int i=0; i<B.length; i++) {
			B[t]=A[i];
			t-=1;
			
		}
		
		System.out.println("Vetor A");
		System.out.println(" ");
		for(int i=0; i<A.length; i++) {
			System.out.println(A[i]);
		}
		
		System.out.println("Vetor B");
		System.out.println(" ");
		for(int i=0; i<B.length; i++) {
			System.out.println(B[i]);
		}
		
		

		read.close();
	}

}
