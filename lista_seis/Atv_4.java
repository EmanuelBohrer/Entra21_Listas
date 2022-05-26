package lista_seis;

import java.util.Scanner;

public class Atv_4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int gen;
		float minAlt=0, maxAlt=0;
		int op=0;
		int i=0;
		float sum=0;
		int men=0;
		int woman=0;
		float Mmedia, mediaP, alt,porcentM;
		float sumW=0,sumM=0;
		
		
		System.out.println("Insira a quantidade de registros a ser feito : ");
		op = read.nextInt();
		
		for (i=0; i<op; i++) {
			System.out.println("Insira seu gênero : ");
			System.out.println("Opçãos possíveis : (0) Masculino (1) Feminino");
			System.out.println(":");
			gen = read.nextInt();
			if(gen==0) {
				System.out.println("Gênero escolhido : Masculino");
				System.out.println("Insira sua altura : ");
				alt = read.nextFloat();
				sum+=alt;
				men+=1;
				sumM +=alt;
				
				if(maxAlt<alt) {
					maxAlt = alt;
				}else if(minAlt< alt && maxAlt> minAlt) {
					minAlt = alt;
				}
				
				}
			
			if(gen==1) {
				System.out.println("Gênero escolhido : Feminino");
				System.out.println("Insira sua altura : ");
				alt = read.nextFloat();
				sum+=alt;
				woman+=1;
				sumW += alt;
					
				if(maxAlt<alt) {
				maxAlt = alt;
				}else if(minAlt<alt && maxAlt>minAlt) {
				minAlt = alt;
					}
				
			}
		}
		mediaP = sum/op;
		Mmedia = sumW/woman;
		porcentM = men/0.05f;
		
		System.out.println("A altura mais alta foi : "+maxAlt);
		System.out.println("A altura mais baixa foi : "+minAlt);
		System.out.println("O total de altura da população : "+mediaP);
		System.out.println("Média de altura entre mulheres : "+Mmedia);
		System.out.println("O percento de homens foi de : %"+porcentM);
		
		
		read.close();

		
	}

}
