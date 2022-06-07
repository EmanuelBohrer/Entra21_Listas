package lista_oito;

import java.util.Random;
import java.util.Scanner;

public class exer_1 {

	public static void main(String[] args) {
		
		
		
		Scanner read = new Scanner(System.in);
		
		int[][] matriz = new int[4][4];
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		int posi = 0;
		int colu = 0;
		
		int posi2=0;
		int colu2=0;
		
		
		Random numRand = new Random();
		
		for(int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				matriz[i][j] = numRand.nextInt(10);
				if(matriz[i][j]>maior) {
					maior = matriz[i][j];
					posi = i;
					colu = j;
				}
				if (matriz[i][j]<menor) {
					menor = matriz[i][j];
					posi2 = i;
					colu2 = j;
				}
			}
		}
		System.out.println("Matriz Utilizada");
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("Valor Maior");
		System.out.println("============================");
		System.out.println("Maior valor recebido : "+maior);
		System.out.println("Linha do maior valor : "+posi);
		System.out.println("Coluna do maior valor : "+colu);
		
		System.out.println("");
		System.out.println("Valor Menor");
		System.out.println("============================");
		System.out.println("Menor valor recebido : "+menor);
		System.out.println("Linha do menor valor : "+posi2);
		System.out.println("Coluna do menor valor : "+colu2);

		read.close();
	}

}
