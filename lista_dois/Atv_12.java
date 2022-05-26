package lista_dois;

import java.util.Scanner;

public class Atv_12 {

	public static void main(String[] args) {
		int pacote,foto_avulsa;
		float total;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de fotos avulsas para revelar : ");
		foto_avulsa = read.nextInt();
		
		System.out.println("Insira a quantidade de pacotes de fotos (Lembrando que, 100 fotos em cada pacote.) : ");
		pacote = read.nextInt();
		
		total = (pacote*44f) + (foto_avulsa*0.70f);
		
		System.out.println("A quantidade de pacotes foi : "+pacote);
		System.out.println("A quantidade de fotos avulsas foi : "+foto_avulsa);
		System.out.println("O valor total pelas fotos será de : "+total);
		
		
		read.close();
	}

}
