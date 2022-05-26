package lista_cinco;

import java.util.Scanner;

public class Atv_9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float preco,box;
		
		
		System.out.println("===========================================");
		System.out.println("= Feira da fruta, digite a sigla da       =");
		System.out.println("= fruta desejada, tendo em mente que são: =");
		System.out.println("=   Laranja (O) Limão (L) Morango (M)     =");
		System.out.println("===========================================");
		System.out.println("");
		System.out.println("Insira a sigla : ");
		char sig = read.next().charAt(0);
		System.out.println("");
		System.out.println("Insira o valor a ser pago unitariamente : ");
		preco = read.nextFloat();
		
		switch(sig) {
		case 'O':
			box = preco*60;
			System.out.println("Valor total da caixa de Laranjas: R$"+box);
			System.out.println("Valor unitário : R$"+preco);
			break;
		case 'L':
			box = preco*80;
			System.out.println("Valor total da caixa de Limões: R$"+box);
			System.out.println("Valor unitário : R$"+preco);
			break;
		case 'M':
			box = preco*20;
			System.out.println("Valor total da vaixa de morangos : R$"+box);
			System.out.println("Valor unitário : R$"+preco);
			break;
		default:
			System.out.println("Sigla não encontrada.");
		}
		
		
		read.close();
	}

}
