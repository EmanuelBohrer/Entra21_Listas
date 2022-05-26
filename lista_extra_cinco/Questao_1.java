package lista_extra_cinco;

import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float ind;
		
		System.out.println("Qual o índice de poluição hoje? : ");
		ind = read.nextFloat();
		
		if (ind >0.25 && ind<=0.3) {
			System.out.println("Aviso : As indústrias do grupo 1 devem suspender suas atividades.");
			
		}else if(ind>=0.4) {
			System.out.println("Aviso : As indústrias do grupo 1 e 2 devem suspender suas atividades.");
		}else if(ind<=0.25) {
			System.out.println("Aviso : Nível de poluição ok.");
		}else {
			System.out.println("Aviso : As industrias de todos os grupos devem suspender suas atividades. ");
		}

		read.close();
	}

}
