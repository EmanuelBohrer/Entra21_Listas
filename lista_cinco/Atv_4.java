package lista_cinco;

import java.util.Scanner;

public class Atv_4 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			int opt;
			
			
			System.out.println("Insira sua opção em códigos : ");
			opt = read.nextInt();
			
			
			if(opt == 1) {
				System.out.println("Código 1 : Alimento não perecível.");
			}else if(opt == 2 || opt == 3 || opt == 4) {
				System.out.println("Código digitado : "+opt+"  | Alimento perecível.");
			}else if(opt ==5 || opt== 6) {
				System.out.println("Código digitado : "+opt+" Vestuário");
			}else if(opt==7) {
				System.out.println("Código 7 : Higiene Pessoal.");
			}else if(opt>= 8 && opt <=15) {
				System.out.println("Código digitado : "+opt+" | Limpeza e utensilos domésticos.");
			}else {
				System.out.println("Código informado inválido, tente novamente.");
			}
			

			read.close();
	}

}

