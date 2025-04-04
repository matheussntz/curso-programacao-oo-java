package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Distancia percorrida: ");
		double distancia = sc.nextDouble();
		System.out.print("Combustível gasto: ");
		double gasolina = sc.nextDouble();
		
		double consumo = distancia / gasolina;
		
		System.out.printf("Consumo medio = %.3f", consumo);
		
		
		
		
		sc.close();

	}

}
