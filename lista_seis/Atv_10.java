package lista_seis;

import java.util.Scanner;

public class Atv_10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int quinto=1001; // quinto + 1
		int resul=0;
		int contador=0; // 5 para parar
		
		for(;quinto<50000; quinto++) {
			if(quinto%11==5) {
				contador++;
				if(contador==5) {
					System.out.println("Resultado : "+quinto);
				}
			}
			
		
		
		/*for(int i=0; i<5; i++) {
			resul = quinto%11; 
			quinto+=1; // 1001
			if(quinto%11==5) {
				contador++; 
				if(contador==5) {
					break;
				}
				
			}
			
			
		}
		System.out.println("Encontrei : "+resul);
		*/

		read.close();
	
		}
	}
	
}

