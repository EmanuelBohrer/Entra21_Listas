package lista_dois;


import java.util.Scanner;

public class Atv_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		float total;
		int folhas;
		
		System.out.println("Insira a quantidade de folhas usadas : ");
		folhas = read.nextInt();
		
		total  = 2f*folhas *0.08f;
		
		System.out.println("O valor a ser pago será : "+total);
		
		read.close();

	}

}
