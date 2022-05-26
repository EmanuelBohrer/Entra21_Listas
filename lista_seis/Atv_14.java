package lista_seis;

import java.util.Scanner;

public class Atv_14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int cd,cole=0;
		String nome;
		float val=0;
		float med;
		float granatotal=0;
		
		System.out.println("Qual o nome da banda que você coleciona? : ");
		nome = read.next();
		
		System.out.println("Quantos CD's você tem da banda? : ");
		cd = read.nextInt();
		
		for(int contador=0; contador<cd; contador++) {
			System.out.println("Insira o valor dos CD's : ");
			val = read.nextFloat();
			cole +=val;
			granatotal+=val;
			
		}
		med = cole/cd;
		System.out.println("O colecionador da banda "+nome+ " gastou em total : R$"+granatotal+" em seus CD'S!");
		System.out.println("Sua média gasta é de : R$"+med);
		
		
		

		read.close();
	}

}
