package lista_seis;

import java.util.Scanner;

public class Atv_20 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num1;
		int num2;
		int resul=0;
		int sum=0;
		
		System.out.println("Insira um número inteiro: ");
		num1 = read.nextInt();
		
		System.out.println("Insira outro número inteiro : ");
		num2 = read.nextInt();
		int i=num1;
		for(; i<num2; ++i) {
			
			if(num1==i) {
				continue;
			}
			sum+= i;
			System.out.println("Intervalos : "+i);
			System.out.println("Total : "+sum);
			
			
		}

		read.close();
	}

}