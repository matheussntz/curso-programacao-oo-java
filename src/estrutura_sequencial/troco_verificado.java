package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoProduto, quantidade, pgto, troco, resto;
		
		System.out.print("Preço unitário do produto: ");
		precoProduto = sc.nextDouble(); 
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextDouble();
		System.out.print("Dinheiro recebido: ");
		pgto = sc.nextDouble();
		
		if (pgto > (precoProduto * quantidade)) {
			troco = pgto - precoProduto * quantidade;
			System.out.printf("TROCO = %.2f%n", troco);	
		}
		else {
			resto = precoProduto * quantidade - pgto;
			System.out.printf("Dinheiro insuficiente, faltam : R$ %.2f", resto);
		}
		
		
		
		sc.close();
	}

}
