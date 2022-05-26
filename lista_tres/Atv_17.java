package lista_tres;

import java.util.Scanner;

public class Atv_17 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int anos;
		float dias;
		
		System.out.println("Insira a idade em anos : ");
		anos = read.nextInt();
		
		dias = (anos*365.25f);
		System.out.println("Dias vividos : "+dias);
		
		

		read.close();
		
	}
	
}
