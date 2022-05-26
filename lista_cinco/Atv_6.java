package lista_cinco;

import java.util.Scanner;

public class Atv_6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float peso,altura,imc;
		
		System.out.println("Insira seu peso : ");
		peso = read.nextFloat();
		
		System.out.println("Insira sua altura : ");
		altura = read.nextFloat();
		
		imc = peso/(altura*altura);
		System.out.println("Seu IMC é de : "+imc);
		System.out.println("");
		System.out.println("");
		if (imc<=18.5) {
			System.out.println("Você está abaixo do peso.");
		}else if(imc >= 18.5 && imc < 25){
			System.out.println("Você está com o peso normal.");
		}else if(imc >= 25 && imc <30) {
			System.out.println("Você está acima do peso..");
		}else {
			System.out.println("Você infelizmente está obeso.");
		}
		
		

		read.close();
	}

}
