package lista_seis;

import java.util.Scanner;

public class Atv_7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num=1,contador=0;
		
		System.out.println("Insira um numero : ");
		num = read.nextInt();
		
		while(num!=0) {
			if(num>100 && num<200) {
				contador++;
			}
			System.out.println("Insira outro valor :");
			num = read.nextInt();
			
			
			
		}
		System.out.println("Entre o intervalo de 100 e 200 foi digitado : "+contador+" valores.");


		read.close();
	}

}
