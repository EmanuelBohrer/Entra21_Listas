package lista_cinco;

import java.util.Scanner;

public class Atv_18 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			
			
			System.out.println("Insira a letra : ");
			char op = read.next().charAt(0);
			op = Character.toLowerCase(op);
			
			
			switch(op) {
			
			case 'A','E','I','O','U':
				
				System.out.println("A letra "+op+" é uma vogal!");
			break;
			default:
				System.out.println("A letra "+op+" é uma consoante.");
				break;
				
			}

			read.close();
	}

}
