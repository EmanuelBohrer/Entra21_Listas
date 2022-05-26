package lista_tres;

import java.util.Scanner;

public class Atv_14_f {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
			
		float x,y,z;
		
		x=1;
		y=2;
		z=y-x;
		System.out.println("Valor de Z : "+z);
		x=5;
		y=x+z;
		
		System.out.println("Valor de X : "+x+" Valor de Y: "+y+" Valor de Z :"+z);
		
		read.close();
	}

}
