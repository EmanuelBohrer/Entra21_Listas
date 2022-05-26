package lista_cinco;

import java.util.Scanner;

public class Atv_7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float grana,nov;
		String metodo;
		
		System.out.println("Insira o total pago : ");
		grana = read.nextFloat();
		
		System.out.println("Insira o método de pagamento : ");
		metodo = read.next();
		
		if(metodo.equalsIgnoreCase("dinheiro") && grana >=100) {
			nov = 0.9f*grana;
			System.out.println("Valor a ser pago : "+nov);
		}else if(metodo.equalsIgnoreCase("cheque")){
			System.out.println("Pagamento : "+grana);
		}else {
			System.out.println("Pagamento : "+grana);
		}
		
		

		read.close();
	}

}
