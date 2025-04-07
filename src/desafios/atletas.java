package desafios;

import java.util.Locale;
import java.util.Scanner;

public class atletas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de atletas? ");
		int N = sc.nextInt();
		
		double somaPeso = 0;
		String atletaMaisAlto = "nome";
		double homens = 0;
		double mulheres = 0;
		double alturaMulheres = 0;
		double maisAlto = 0;
		
		for (int i = 1; i <= N; i++) {
			System.out.printf("Digite os dados do atleta numero %d:\n", i);
			sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Sexo:");
			char sexo = sc.next().charAt(0);
			
			while (sexo != 'F' && sexo != 'M' ) {
				System.out.print("Valor invalido! Favor digitar F ou M:");
				sexo = sc.next().charAt(0);
			}
			
			System.out.print("Altura:");
			double altura = sc.nextDouble();
			
			
			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo:");
				altura = sc.nextDouble();
			}
			
			System.out.print("Peso:");
			double peso = sc.nextDouble();
			
			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo:");
				peso = sc.nextDouble();
			}
			
			somaPeso += peso;

			
			if (altura > maisAlto) {
				maisAlto = altura;
				atletaMaisAlto = nome;
			}

			if (sexo == 'M') {
				homens += 1;				
			}
			else {
				mulheres += 1;
				alturaMulheres += altura;
			}
			
		}
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		double mediaPeso = somaPeso / N;
		System.out.printf("Peso médio dos atletas: %.2f\n", mediaPeso);
		System.out.printf("Atleta mais alto: %s\n", atletaMaisAlto);
		double porcentHomens = homens / N * 100;
		System.out.printf("Porcentagem de homens: %.1f%%\n", porcentHomens);		
		if (mulheres != 0) {
			double mediaAlturaMulheres = alturaMulheres / mulheres;
			System.out.printf("Altura média das mulheres: %.2f", mediaAlturaMulheres);
		}
		else {
			System.out.print("Não há mulheres cadastradas");
		}
		
		
		sc.close();

	}

}
