package lista_sete_real;

public class exer_18 {

	public static void main(String[] args) {
		
		
		int[]vetorX = new int[10];
		int contador = 100;
		int validaPrimos = 0;
		int quantidadePrimos = 0;
		
		while(quantidadePrimos<10) {
			contador++;
			validaPrimos = 0;
			
			for(int i=1; i<= contador; i++) {
				if(contador%i==0) {
					validaPrimos++;
				}
				if(validaPrimos==3) {
					continue;
				}
			}
			if (validaPrimos==2) {
				vetorX[quantidadePrimos]=contador;
				quantidadePrimos++;
				
			}
		}
		
		for(int i=0; i<vetorX.length; i++) {
			System.out.println("Números primos : "+vetorX[i]);
		}
		
		
		
		
	}

}
