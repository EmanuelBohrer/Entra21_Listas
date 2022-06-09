package groyer_matriz;

import java.util.Scanner;

public class exer_5 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String [][][] matriz = new String [12][31][8];
		
		int dia;
		int n=0;
		int hora;
		int mes;
		
		
		while(n!=-1) {
			System.out.println("==== Menu Simples =====");
			System.out.println("1 - Adicionar um registro.");
			System.out.println("2 - Ver compromissos.");
			System.out.println("3 - Sair do programa.");
			
			System.out.println("Escolha : ");
			n = read.nextInt();
			
			
			if(n==1) {
				System.out.println("Insira o mês : ");
				mes = read.nextInt();
				System.out.println("Insira o dia : ");
				dia = read.nextInt();
				System.out.println("Insira a hora : ");
				hora = read.nextInt();
				if(hora>8) {
					System.out.println("Hora inválida, digite novamente!");
					System.out.println("Insira a hora : ");
					hora = read.nextInt();
				}else {
					System.out.println("Insira o compromisso : ");
					matriz[mes][dia-1][hora] = read.next();
				}
				
			}
			if(n==2) {
				System.out.println("Insira o mês :");
				mes = read.nextInt();
				System.out.println("Insira o dia :");
				dia = read.nextInt();
				System.out.println("Insira a hora : ");
				hora = read.nextInt();
				if(matriz[mes][dia-1][hora]== null) {
					System.out.println("Sem compromisos!");
				}else {
					System.out.println("No dia "+dia+" na hora "+hora+" do mês "+mes+" você tem marcado : "+matriz[mes][dia-1][hora]);
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

