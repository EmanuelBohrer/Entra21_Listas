package lista_dois;

import java.util.Scanner;

public class Atv_11 {

	public static void main(String[] args) {
		int tulipas,rosas;
		float total;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de tulipas : ");
		tulipas = read.nextInt();
		
		System.out.println("Insira a quantidade de rosas : ");
		rosas = read.nextInt();
		
		total = (tulipas*4.2f) + (rosas*2.8f);
		
		System.out.println("O valor total para a compra em reais é : "+total);
		
		read.close();
		
		

	}

}
