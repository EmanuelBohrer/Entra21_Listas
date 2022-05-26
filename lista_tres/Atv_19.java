package lista_tres;

import java.util.Scanner;

public class Atv_19 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);

			float horas,minutos,segundos;
			
			System.out.println("Insira as horas : ");
			horas = read.nextFloat();
			
			minutos = (horas*60f);
			segundos = (minutos*60f);
			
			System.out.println("Valor em horas : "+horas+"| Valor em minutos : "+minutos+"| Valor em segundos : "+segundos);
			
			
			
			read.close();
	}

}
