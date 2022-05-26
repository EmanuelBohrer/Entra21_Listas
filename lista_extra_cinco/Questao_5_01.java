package lista_extra_cinco;

import java.util.Scanner;

public class Questao_5_01 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			float salB,salLi,valH,ir,inss,fgts,total;
			int hr;
			
			System.out.println("Insira as horas trabalhadas : ");
			hr = read.nextInt();
			
			
			System.out.println("Insira o valor da hora : ");
			valH = read.nextFloat();
			
			salB= hr*valH;
			
			if(salB <=900 ) {
				inss =salB*0.10f;
				fgts = salB*0.11f;
				salLi = salB-inss;
				total = inss;
				
				System.out.println("===========Tabela de Salário============");
				System.out.println("Salário Bruto : R$"+salB);
				System.out.println("(-) INSS (1O%) : R$"+inss);
				System.out.println("FGTS Fundo de Garantia (11%) : R$"+fgts);
				System.out.println("Total de descontos : R$"+total);
				System.out.println("Salário Líquido : R$"+salLi);
				System.out.println("=========================================");
				
			}else if(salB>900 && salB<=1500 ) {
				ir = salB*0.05f;
				inss =salB*0.10f;
				fgts = salB*0.11f;
				total =inss+ir;
				salLi = salB-total;
				
				System.out.println("===========Tabela de Salário============");
				System.out.println("Salário Bruto : R$"+salB);
				System.out.println("(-) IR (5%) : R$"+ir);
				System.out.println("(-) INSS (1O%) : R$"+inss);
				System.out.println("FGTS Fundo de Garantia (11%) : R$"+fgts);
				System.out.println("Total de descontos : R$"+total);
				System.out.println("Salário Líquido : R$"+salLi);
				System.out.println("=========================================");
				
			}else if(salB>1500 && salB <=2500 ) {
				ir = salB*0.10f;
				inss =salB*0.10f;
				fgts = salB*0.11f;
				total =inss+ir;
				salLi = salB-total;
				
				System.out.println("===========Tabela de Salário============");
				System.out.println("Salário Bruto : R$"+salB);
				System.out.println("(-) IR (10%) : R$"+ir);
				System.out.println("(-) INSS (1O%) : R$"+inss);
				System.out.println("FGTS Fundo de Garantia (11%) : R$"+fgts);
				System.out.println("Total de descontos : R$"+total);
				System.out.println("Salário Líquido : R$"+salLi);
				System.out.println("=========================================");
				
			}else if (salB>=2500) {
				ir = salB*0.20f;
				inss =salB*0.10f;
				fgts = salB*0.11f;
				total =inss+ir;
				salLi = salB-total;
				
				System.out.println("===========Tabela de Salário============");
				System.out.println("Salário Bruto : R$"+salB);
				System.out.println("(-) IR (20%) : R$"+ir);
				System.out.println("(-) INSS (1O%) : R$"+inss);
				System.out.println("FGTS Fundo de Garantia (11%) : R$"+fgts);
				System.out.println("Total de descontos : R$"+total);
				System.out.println("Salário Líquido : R$"+salLi);
				System.out.println("=========================================");
			}
			
			

			read.close();
	}

}
