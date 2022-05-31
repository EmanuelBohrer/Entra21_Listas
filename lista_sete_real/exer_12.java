package lista_sete_real;

import java.util.Scanner;

public class exer_12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int cont = 5;
		int[] A = new int[cont];
		boolean par=false;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Insira o valor do vetor da posição "+i+" :");
			A[i]=read.nextInt();
			if(A[i]%2==0) {
				par = true;
			}else {
				par = false;
			}
		}
		
		System.out.println("Vetor A");
		System.out.println(" ");
		for(int i=0; i<A.length; i++) {
			System.out.println(A[i]);
		}
		if(par==true) {
			System.out.println("Vetor inteiramente composto por pares!");
		}else if (par==false) {
			System.out.println("O vetor teve um impar!");
		}
		

		read.close();
	}

}
