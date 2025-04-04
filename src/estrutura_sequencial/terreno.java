package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class terreno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double largura, comprimento, valorM2, area, preco;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		valorM2 = sc.nextDouble();
		
		area = largura * comprimento;
		
		System.out.printf("Area do terreno = %.2f%n", area);
		
		preco = valorM2 * area;
		
		System.out.printf("Preco do terreno = %.2f%n", preco);
		
		sc.close();
		
		
	}

}
