package lista_cinco;

import java.util.Scanner;

public class Atv_12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float a,b,c,exer,real,tot;
		 
		System.out.println("Insira a 1 nota : ");
		a = read.nextFloat();
		System.out.println("Insira a 2 nota : ");
		b = read.nextFloat();
		System.out.println("Insira a 3 nota : ");
		c = read.nextFloat();
		System.out.println("Insira a média de exercicios :");
		exer = read.nextFloat();
		
		real = a+(b*2)+(c*3)+exer;
		tot = real/7;
		
		
		System.out.println("Média do alno : "+tot);
		
		if(tot>= 9) {
			System.out.println("Parabéns, segue com o conceito A.");
		}else if(tot >=7.5 && tot <9){
			
			System.out.println("Parabéns, segue com o conceito B.");
			
		}else if(tot >=6 && tot <7.5) {
			System.out.println("O conceito é o C.");
		}else if(tot <6) {
			System.out.println("Seu conceito está baixo, D.");
		}
		
		

		read.close();
	}

}
