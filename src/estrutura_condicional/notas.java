package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double primeiraNota = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double segundaNota = sc.nextDouble();
		
		double notaFinal = primeiraNota + segundaNota;
		System.out.printf("NOTA FINAL = %.1f\n", notaFinal);
		
		if (notaFinal < 60.00) {
			System.out.print("REPROVADO");			
		}
		
		sc.close();

	}

}
