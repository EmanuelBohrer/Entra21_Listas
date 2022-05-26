package lista_dois;

import java.util.Scanner;

public class Atv_10 {

	public static void main(String[] args) {
		int nfilhos,trhoras;
		float vhora,salario;
		String nome;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira seu nome : ");
		nome = read.next();
		
		System.out.println("Insira a quantidade de horas trampadas :  ");
		trhoras = read.nextInt();
		 
		System.out.println("Digte o valor da hora de trabalho : ");
		vhora = read.nextFloat();
		
		System.out.println("Quantos filhos : ");
		nfilhos = read.nextInt();
		
		salario = (float) ((vhora*trhoras) + (nfilhos*0.03*vhora*trhoras));
		
		System.out.println("Teu salário será : "+salario);
		
		read.close();
	}

}
