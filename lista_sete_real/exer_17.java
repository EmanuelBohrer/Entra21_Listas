package lista_sete_real;

import java.util.Scanner;

public class exer_17 {
	
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n=3;
		String clientes[]= new String[n];
		int[] dvd = new int [n];
		int locar;
		
		
		for(int i=0; i<n; i++) {
			System.out.println("Insira o nome do cliente n°"+i+" :");
			clientes[i] = read.next();
			System.out.println("Insira a quantidade de filmes que o cliente n°"+i+" locou em 2022 :");
			dvd[i] = read.nextInt();
		}
		
		System.out.println("Total da Locadora");
		System.out.println(" ");
		for(int i=0; i<n; i++) {
			locar=0;
			locar=dvd[i]/10;
			if(locar==0) {
				System.out.println("O(a) cliente "+clientes[i]+" não terá locações grátis..");
				System.out.println("------------------------------------------------------------------------");
				
			}else {
				System.out.println("O(a) cliente "+clientes[i]+" terá disponivel "+locar+" locações grátis!");
				System.out.println("------------------------------------------------------------------------");
			}
			
			
		}

		read.close();
	}

}
