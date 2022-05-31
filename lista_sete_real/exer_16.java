package lista_sete_real;

import java.util.Scanner;

public class exer_16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		int[] A = new int[5];
		int[] B = new int[A.length];
		int n=1;
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Insira o valor do vetor na posição "+i+" :");
			A[i] = read.nextInt();
		}
		
		for(int i=0; i<A.length; i++){
			if(A[i]>0) {
				B[n]=A[i];
				n+=1;
			}
		}
		System.out.println("Vetor sem os Nulos :");
		for(int i=1; i<n; i++) {
			System.out.println(B[i]);
		}

		read.close();
	}

}
