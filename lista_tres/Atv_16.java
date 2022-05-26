package lista_tres;

import java.util.Scanner;

public class Atv_16 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);

			
			float area,lquad;
			
			System.out.println("Insira o valor do lado do quadrado : ");
			lquad = read.nextFloat();
			area = (lquad)*(lquad);
			
			System.out.println("O valor do quadrado é : "+area);
			read.close();
	}

}
