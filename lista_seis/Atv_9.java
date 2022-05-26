package lista_seis;

import java.util.Scanner;

public class Atv_9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num,primo;
		int resul=0;
		int contador=0;
		int contador2=0;
		
		
		System.out.println("Insira o número a ser verificado : ");
		num = read.nextInt();
		
		for(int i=1; i<=num; i++ ) {
			resul=0;
			resul = num%i;
			if(resul==0) {
				contador++;
			}else if(resul==1) {
				
			}
		}
		if(contador==2) {
			System.out.println("É primo.");
		}else if(contador!=2) {
			System.out.println("Não é primo.");
		}
		
		

	}
}

