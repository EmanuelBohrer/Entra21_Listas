package lista_cinco;

import java.util.Scanner;

public class Atv_10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int valorc,valorp,troco;
		
		int notaU,notaD,notaC;
		
		System.out.println("Insira o  valor da compra : ");
		valorc = read.nextInt();
		
		System.out.println("Insira o valor do pagamento : ");
		valorp = read.nextInt();
		
		troco = (valorc-valorp)*-1;
		
		
		System.out.println("Valor troco : "+troco);
		
		if(valorp < valorc) {
			System.out.println("Situação : Pagamento Negado");
		}else {
			
			notaC = troco/100;
			troco%=100;
			
			notaD = troco/10;
			troco%=10;
			
			notaU = troco/1;
			troco%=1;
			
			System.out.println("Receberá em notas de um :"+notaU+" em notas de dez: "+notaD+" em notas de cem:"+notaC);
			
		}
		

		read.close();
	}

}
