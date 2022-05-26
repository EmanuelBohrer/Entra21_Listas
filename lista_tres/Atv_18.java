package lista_tres;

public class Atv_18 {

	public static void main(String[] args) {
		
		float compra1 = 32.87f;
	    float venda1 = 33.92f;
	    float percent = 0.02f;
	    int quant = 1000;
	    float totalC;
	    float totalV;
	    float totalDespCompra;
	    float totalDespVenda;
	    float totLucroVenda;
	    float totLucroCompra;
	    float totLucro;
	    
	    //Valores Comprados e Valores Vendidos
	    totalC = compra1 * quant;
	    totalV = venda1 * quant;
		
	    //Valor pago ao Corretor
	    totalDespCompra = totalC * percent;
	    totalDespVenda = totalV * percent;
	    
	    //Valor das despesas da Venda
	    totLucroVenda = totalV- totalDespVenda;
	    totLucroCompra = totalC + totalDespCompra;
	    
	    //Lucro ou nao
	    totLucro = totLucroVenda - totLucroCompra;
	    
	    System.out.println("Valor total da compra : "+ totalC);
	    System.out.println("Valor total da comissão de compra : "+totalDespCompra);
	    System.out.println("Valor da quantia que ele vendeu : "+totalV);
	    System.out.println("Valor da comissão da venda : "+totalDespVenda);
	    System.out.println("Lucro ou prejuizo : "+totLucro);

	}

}
