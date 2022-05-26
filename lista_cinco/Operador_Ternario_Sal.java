package lista_cinco;

public class Operador_Ternario_Sal {

	public static void main(String[] args) {
		float salario = 1000f;
		float bonus;
		float newsal;
		
		
		bonus = (float) ((salario > 1000) ? (salario *0.10) : (salario *0.15));
		newsal = bonus+salario;
		System.out.println("Seu salário vai ser : R$"+newsal);
	}

}
