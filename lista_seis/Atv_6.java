package lista_seis;

import java.util.Scanner;

public class Atv_6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float chico=1.50f;
		float ze = 1.10f;
		int anos=0;
		
		while(ze<chico) {
			ze+=0.03f;
			chico+=0.02f;
			++anos;
		}
		System.out.println("Zé ira levar aproximadamente : "+anos+" anos para ultrapassar chico.");

		read.close();
	}

}
