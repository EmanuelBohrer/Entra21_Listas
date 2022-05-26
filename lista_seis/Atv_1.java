package lista_seis;

import java.util.Scanner;

public class Atv_1 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			int som=0;
			int op=0;
			int prod=1;
			int real=0;
			
			while(op!=-1) {
				System.out.println("Insira um numero : ");
				op = read.nextInt();
				
				
				if(op%2==0) 
				{
					som +=op;
				}else if(op%2!=0){
					prod *= op;
					real=prod * -1;
				}else if(op==-1) {
					System.out.println("Programa encerrado!");
					break;
				}
				
			}
			System.out.println("Soma dos pares foi : "+som);
			System.out.println("Produto dos ímpares : "+real);

			read.close();
	}

}
