package lista_oito;

import java.util.Scanner;

public class exer_4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String [][] matriz = new String [31][24];
		int dia;
		
		int n=0;
		int hora;
		
		
		while(n!=-1) {
			System.out.println("==== Menu Simples =====");
			System.out.println("1 - Adicionar um registro.");
			System.out.println("2 - Ver compromissos.");
			System.out.println("3 - Sair do programa.");
			
			System.out.println("Escolha : ");
			n = read.nextInt();
			
			
			if(n==1) {
				System.out.println("Insira o dia : ");
				dia = read.nextInt();
				System.out.println("Insira a hora : ");
				hora = read.nextInt();
				System.out.println("Insira o compromisso : ");
				matriz[dia-1][hora] = read.next();
			}
			if(n==2) {
				System.out.println("Insira o dia :");
				dia = read.nextInt();
				System.out.println("Insira a hora : ");
				hora = read.nextInt();
				if(matriz[dia-1][hora]== null) {
					System.out.println("Sem compromisos!");
				}else {
					System.out.println("No dia "+dia+" na hora "+hora+" você tem marcado : "+matriz[dia-1][hora]);
				}
			}
			if(n==3) {
				System.out.println("Agenda fechando!");
				break;
			}
		
	}
		read.close();
	}
}




