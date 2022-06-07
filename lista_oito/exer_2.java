package lista_oito;

import java.util.Scanner;

public class exer_2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		
		int qtdPar=0;
		int qtdImpar=0;
		
		for(int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				System.out.println("Insira o valor da linha :"+i+" de coluna : "+j);
				matriz[i][j]= read.nextInt();
				if(matriz[i][j]%2==0) {
					qtdPar++;
				}
				if(matriz[i][j]%2!=0) {
					qtdImpar++;
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
		System.out.println("Quantidade de pares inseridos : "+qtdPar);
		System.out.println("Quantidade de impares inseridos : "+qtdImpar);
		read.close();
	}
}
	


