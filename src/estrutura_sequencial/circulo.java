package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, area;
		
		System.out.print("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("AREA = %.3f", area);

		
		sc.close();
	}

}
