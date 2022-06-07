package lista_oito;

import java.util.Random;

public class exer_3 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];

		
		//maior linha 5
		int posi = 0;
		int colu = 0;
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		//menor linha 5
				int posi2=0;
				int colu2=0;
				
		
		//------
		
		
		
		
		// maior coluna 7
		int posi3 = 0;
		int colu3 = 0;
		
		int maior2 = Integer.MIN_VALUE;
		int menor2 = Integer.MAX_VALUE;
		
		//menor coluna 7
				int posi4=0;
				int colu4=0;
				
		
		
		Random numRand = new Random();
		
		
		for(int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				matriz[i][j] = numRand.nextInt(10);
				if(matriz[4][j]> maior) {
					maior = matriz[4][j];
					posi = i;
					colu = j;
				}
				if(matriz[4][j]<menor) {
					menor = matriz[4][j];
					posi2 = i;
					colu2 = j;
				}
				if(matriz[i][6]> maior2) {
					maior2 = matriz[i][6];
					posi3 = i;
					colu3 = j;
				}
				if(matriz[i][6]<menor2) {
					menor2 = matriz[i][6];
					posi4 = i;
					colu4 = j;
				}
			}
		
	}
		System.out.println("");
		
		System.out.println("Matriz Utilizada");
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("====== Resultados do 1 pedido (Linha 5) ======");
		System.out.println("Maior valor da linha 5 : "+maior);
		System.out.println("Posição : "+posi);
		System.out.println("Coluna : "+colu);
		System.out.println("Menor valor da linha 5 : "+menor);
		System.out.println("Posição : "+posi2);
		System.out.println("Coluna : "+colu2);
		System.out.println();
		
		System.out.println("====== Resultados do 2 pedido (Coluna 7) ======");
		System.out.println("Maior valor da coluna 7 : "+maior2);
		System.out.println("Posição : "+posi3);
		System.out.println("Coluna : "+colu3);
		System.out.println("Menor valor da coluna 7 : "+menor2);
		System.out.println("Posição : "+posi4);
		System.out.println("Coluna : "+colu4);
		System.out.println();
		
		

	}
}