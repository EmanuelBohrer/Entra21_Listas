package lista_seis;

import java.util.Scanner;

public class Atv_11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		 
		int num;
		int resul;
		
		System.out.println("Insira o número : ");
		num = read.nextInt();
		
		int i = 1;
		for(; i<11; i++) {
			resul = 0;
			resul = num*i;
			System.out.println(num+"x"+i+" : "+resul);
		}
		
		
		

		read.close();
	}

}
