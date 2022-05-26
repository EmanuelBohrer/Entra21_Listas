package lista_cinco;

import java.util.Scanner;

public class Atv_5 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			int opt;
			
			System.out.println("Insira o código do nadador : ");
			opt = read.nextInt();
			
			switch(opt) {
			case 1,2,3,4:
				System.out.println("Código digitado: "+opt+" | Classificação inexistente.");
			
			case 5,6,7:
				System.out.println("Código digitado: "+opt+" | Classificação Infantil A ");
			break;
			
			case 8,9,10:
				System.out.println("Código digitado: "+opt+" | Classificação Juvenil B ");
			break;
			
			
			case 11,12,13:
				System.out.println("Código digitado: "+opt+" | Classificação Juvenil A ");
			break;
			
			
			case 14,15,16,17:
				System.out.println("Código digitado: "+opt+" | Classificação Juvenil B");
			break;
			
			default:
				System.out.println("Código digitado: "+opt+" | Clasificação Adulto");
			
			}
				

			read.close();
	}

}
