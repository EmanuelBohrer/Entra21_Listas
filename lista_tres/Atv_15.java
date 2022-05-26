package lista_tres;

import java.util.Scanner;

public class Atv_15 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);

			float receita,despesas,percent,lucro;
			
			System.out.println("Insira o valor da receita : ");
			receita = read.nextFloat();
			
			System.out.println("Insira o valor das despesas : ");
			despesas = read.nextFloat();
			
			lucro = receita-despesas;
			
			percent = (lucro/receita)*100f;
			
			System.out.println("O lucro foi de : "+lucro);
			System.out.println("O percentual de despesas foi de : "+percent);
			
			
			
			read.close();
	}

}
