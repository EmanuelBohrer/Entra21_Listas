package lista_cinco;

public class Operador_IF_Sal {

	public static void main(String[] args) {
		// TODO Concepts of operator ternary - Doing with IF
		
		float salar = 1000;
		float bonus;
		float salarnew;
		
		if(salar > 1000) {
			bonus= (float) (salar * 0.10);
			salarnew = salar + bonus;
		}else {
			bonus= (float) (salar*0.15);
			salarnew= salar + bonus;
		}
		
		System.out.println("Salário novo : "+salarnew);
		
		
		
		

	}

}
