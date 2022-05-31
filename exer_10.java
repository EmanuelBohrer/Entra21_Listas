package lista_sete_real;

import java.util.Scanner;

public class exer_10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		int total=2;
		int soma=0;
		int media=0;
		int[] nota1 = new int[5];
		int [] nota2 = new int[5];
		int [] result = new int[5];
		
		
		for (int i=0; i<total; i++) {
			System.out.println("Informe a 1 nota do aluno : ");
			nota1[i]=read.nextInt();
			System.out.println("Informe a 2 nota do aluno : ");
			nota2[i]=read.nextInt();
			System.out.println(" ");
			System.out.println("Notas do aluno : ");
			System.out.println("Primeira nota :"+nota1[i]);
			System.out.println("Segunda nota :"+nota2[i]);
			System.out.println(" ");
			media=nota1[i]+nota2[i];
			result[i]=media/2;
			System.out.println("Média do aluno : ");
			for (int t=0; t<result.length; t++) {
				System.out.println(result[i]);
				break;
			}
			
			if(result[i]>=7) {
				System.out.println("Aprovado!");
			}else {
				System.out.println("Reprovado.");
			}
			
		}
		


		read.close();
	}

}
