package lista_dois;

import java.util.Scanner;

public class Atv_4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float total;
		int dias;
		
		System.out.println("Insira os dias em atraso : ");
		dias = read.nextInt();
		
		total = dias*2.5f;
		
		System.out.println("O valor a ser pago é : "+total);
		read.close();
		
		

	}

}
