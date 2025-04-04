package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valorPago;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		valorPago = 50.0;
		
		if (minutos > 100) {
			valorPago += 2 * (minutos - 100); 
		}
		
		System.out.printf("Valor a pagar = R$ %.2f", valorPago);
		
		sc.close();
	}

}
