package lista_seis;

import java.util.Scanner;

public class Atv_02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int	carteira = 0;
		int numMulta =0;
		int reg;
		float maior=0;
		float soma=0;
		float val=0;
		float cnhM=0;
		float granaD=0;
		
		
		System.out.println("Insira a quantidade de registros para computar : ");
		reg = read.nextInt();
		
		soma1:
		for(int contador = 0; contador <reg; contador++) {
			soma =0;
			System.out.println("Insira o número da carteira : ");
			carteira = read.nextInt(); //5 // 6
			System.out.println("Insira o número de multas : ");
			numMulta = read.nextInt();//2 //3
			if(numMulta> maior) {
				maior = numMulta;
				cnhM = carteira;
			}
			calc:
			for(int contador2 = 0; contador2 <numMulta; contador2++) {
				System.out.println("Insira o valor da multa : ");
				val = read.nextFloat();
				soma +=val;
				granaD += val;
				
				
				
				if(contador2==numMulta) {
					break calc;
				}

			}
			System.out.println("O motorista de carteira : "+carteira+" teve de multas : "+numMulta+" terá que pagar : R$"+soma);

		}
		System.out.println("O maior número de multas foi : "+maior+" do motorista de código : "+cnhM+" terá que pagar : R$"+soma);
		System.out.println("Total de Arrecadação : R$"+granaD);
		read.close();
		
	}

}
