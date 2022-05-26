package lista_seis;

import java.util.Scanner;

public class Atv_12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num=1;
		int resul=0;
		int i=0;
		
		for(;i<64; i++) {
			num = num*2;
			System.out.println("Grãos pagos : "+num);
		}
		System.out.println("Grãos pagos  (Final): "+num);

		read.close();
	}

}
