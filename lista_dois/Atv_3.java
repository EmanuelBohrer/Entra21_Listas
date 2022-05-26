package lista_dois;

import java.util.Scanner;

public class Atv_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		float tc,tf;
		
		System.out.println("Insira a temperatura em graus celsius : ");
		tc = read.nextFloat();
		
		tf = (1.8f*tc)+32f;
		
		System.out.println("Em temperatura fahrenheit é : "+tf);
		
		read.close();

	}

}
