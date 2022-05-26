package lista_cinco;

import java.util.Scanner;

public class Atv_8 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);

			String fuel;
			float pay,pay2;
			
			System.out.println("Insira o tipo de combustivel : ");
			fuel = read.nextLine();
			
			System.out.println("Insira quantos litros você irá colocar : ");
			pay = read.nextFloat();
			
			if(fuel.equalsIgnoreCase("gasolina")) {
				
				pay2=pay*2.53f;
				System.out.println("Total a ser pago pela gasolina: "+pay2);
			}else if(fuel.equalsIgnoreCase("etanol") && pay>30) {
				pay2= pay*2.09f;
				System.out.println("Total a ser pago pelo Etanol: "+Math.round(pay2));
				System.out.println("Parabéns, ganhou uma troca de oleo!");
			}else if(fuel.equalsIgnoreCase("diesel")) {
				pay2=pay*1.92f;
				System.out.println("Total a ser pago pelo diesel: "+pay2);
			}else if(fuel.equalsIgnoreCase("etanol")) {
				pay2=pay*2.09f;
				System.out.println("Total pelo etanol: "+pay2);
			}
			
			read.close();
	}

}
