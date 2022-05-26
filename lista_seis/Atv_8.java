package lista_seis;

import java.util.Scanner;

public class Atv_8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int inicial;
		int fim;
		int soma=0;
		
		System.out.println("Insira o valor inferior : ");
		inicial = read.nextInt();
		
		System.out.println("Insira o valor superior : ");
		fim = read.nextInt();
		
		for(int i=inicial + 1; i<fim; i++) {
			if(i%2 ==0) {
				System.out.println("Números pares : "+i);
				soma+=i;

			}
		}
		System.out.println("O total da soma dos números foi : "+soma);
		
		read.close();
	}

}
