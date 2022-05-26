package lista_seis;

public class Atv_3 {

	public static void main(String[] args) {
		int x= 1000;
		int y = 2000;
		for(int i=x; i<y; i++) {
			if(i%11==5) {
				System.out.println("Número divisivel foi : "+i);
			}
		}
	}

}
