package lista_cinco;

import java.util.Scanner;

public class Atv_15 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			float qnt,resul,resul2,total,posit;
			String beef;
			int opt;
			
			System.out.println("Bem vindo a Churrascaria do Jonas, insira o tipo da carne:");
			beef = read.next();
			
			if(beef.equalsIgnoreCase("file")) {
				System.out.println("Quantidade de carne : ");
				qnt = read.nextFloat();
				if(qnt<5) {
					
					resul = qnt*4.9f;
					System.out.println("O valor pago será: R$"+resul);
					System.out.println("Opção de pagamento - Cartão (1) Dinheiro(2): ");
					opt = read.nextInt();
					
					if(opt==1) {
						resul2= resul*0.05f;
						System.out.println("Ganhou desconto de :"+resul2);
						total = resul2 -resul;
						posit = total*-1;
						System.out.println("Total a ser pago : R$"+Math.round(posit));
						
					}else if(opt==2) {
						System.out.println("Foi pago :R$"+resul);
					}else {
						System.out.println("Opção inválida.");
					}
					
				}else if(qnt>=5) {
					
					resul = qnt*5.8f;
					System.out.println("O valor a ser pago será R$:"+resul);
					System.out.println("Opção de pagamento - Cartão (1) Dinheiro(2): ");
					opt=read.nextInt();
					if(opt==1) {
						resul2=resul*0.05f;
						System.out.println("Ganhou desconto de : R$"+resul2);
						total = resul2 -resul;
						posit = total*-1;
						System.out.println("Total a ser pago : R$"+Math.round(posit));
					}else if(opt==2) {
						System.out.println("Foi pago: R$"+resul);
					}else {
						System.out.println("Opção Inválida.");
					}
					
				}
				
			}else if(beef.equalsIgnoreCase("alcatra")) {
				System.out.println("Quantidade de carne : ");
				qnt = read.nextFloat();
				if (qnt<5) {
					resul = qnt*5.9f;
					System.out.println("O valor pago será: R$"+resul);
					System.out.println("Opção de pagamento - Cartão (1) Dinheiro(2): ");
					opt = read.nextInt();
					
					if (opt==1) {
						resul2 = resul*0.05f;
						System.out.println("Com cartão há desconto de : R$"+resul2);
						total = resul2 -resul;
						posit = total*-1;
						System.out.println("Total a ser pago : R$"+Math.round(posit));
					}else if(opt==2) {
						System.out.println("A pagar :R$"+resul);
					}else {
						System.out.println("Opção inválida.");
					}
					
				}else if(qnt>=5) {
					resul = qnt*6.8f;
					System.out.println("O valor a ser pago será R$"+resul);
					System.out.println("Opção de pagamento - Cartão (1) Dinheiro(2): ");
					opt = read.nextInt();
					
					if (opt==1) {
						resul2=resul*0.05f;
						System.out.println("Com cartão há desconto de : R$"+resul2);
						total = resul2 -resul;
						posit = total*-1;
						System.out.println("Total a ser pago : R$"+Math.round(posit));
					}else if(opt==2) {
						System.out.println("A pagar : R$"+resul);
					}else {
						System.out.println("Opção inválida.");
					}
				}
			}else if(beef.equalsIgnoreCase("picanha")) {
				System.out.println("Quantidade de carne : ");
				qnt = read.nextFloat();
				if (qnt<5) {
					resul = qnt*6.9f;
					System.out.println("O valor a ser pago será : R$"+resul);
					System.out.println("Opção de pagamento - Cartão (1) Dinheiro(2): ");
					opt = read.nextInt();
					
					if (opt==1) {
						resul2 = resul*0.05f;
						System.out.println("Com cartão há desconto de  : R$"+resul2);
						total = resul2 -resul;
						posit = total*-1;
						System.out.println("Total a ser pago : R$"+Math.round(posit));
					}else if(opt==2) {
						System.out.println("Valor a ser pago : R$"+resul);
					}else {
						System.out.println("Opção inválida.");
					}
				}else if(qnt>=5) {
					resul = qnt*7.8f;
					System.out.println("O valor a ser pago será : R$"+resul);
					System.out.println("Opção de pagamento - Cartão (1) Dinheiro(2): ");
					opt = read.nextInt();
					
					if (opt==1) {
						resul2 = resul*0.05f;
						System.out.println("Com cartão há desconto de : R$"+resul2);
						total = resul2 -resul;
						posit = total*-1;
						System.out.println("Total a ser pago : R$"+Math.round(posit));
					}else if(opt==2) {
						System.out.println("O valor a ser pago será : R$"+resul);
					}else {
						System.out.println("Opção inválida.");
					}
					
				}
			}
			

			read.close();
	}

}
