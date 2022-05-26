package lista_extra_cinco;

import java.util.Scanner;

public class Questao_3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int ano;
		boolean biss;
		
		System.out.println("Insira um ano : ");
		ano = read.nextInt();
		
		if(ano%400==0) {
			biss = true;
			System.out.println("O ano é bissexto!");
		}else if(ano%4==0 && ano%100!=0) {
			biss = true;
			System.out.println("O ano é bissexto!");
		}else {
			biss = false;
			System.out.println("O ano não é bissexto!");
		}
		

		read.close();
	}

}
