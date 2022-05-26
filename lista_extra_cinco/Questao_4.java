package lista_extra_cinco;

import java.util.Scanner;

public class Questao_4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int var=0;
		String caso;
		
		System.out.println("Bem vindo ao interrogatório. Vamos iniciar as perguntas. Responda apenas com Sim e Não");
		System.out.println("======================================================================================");
		System.out.println("A) Você telefonou para a vítima? (Sim) ou (Não)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("Hm... entendo.");
		}
		System.out.println("B) Você esteve no local do crime? (Sim) ou (Não)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("Sei.. continue.");
		}
		System.out.println("C) Você morava perto da vítima? (Sim) ou (Não)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("Não? Hm..");
		}
		System.out.println("D) Você devia a vítima? (Sim) ou (Não)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("Pagava sempre em dia então..");
		}
		System.out.println("E) Já trabalhou com a vítima? (Sim) ou (Não)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("Entendo.");
		}
		
		if(var==2) {
			System.out.println("Com os dados atuais, posso dizer.. você é Suspeito!");
			System.out.println("Questões positivas : "+var);
		}else if(var>=3 && var<=4) {
			System.out.println("Com base no que falamos hoje.. posso dizer que você é Cumplice!");
			System.out.println("Questões positivas : "+var);
		}else {
			System.out.println("Não me resta dúvidas! Você é o ASSASSINO!");
			System.out.println("Questões positivas : "+var);
		}
		

		read.close();
	}

}
