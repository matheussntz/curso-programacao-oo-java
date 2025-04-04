package desafios;

import java.util.Locale;
import java.util.Scanner;

public class imposto {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Renda anual com salário: ");
		double rendaAnual = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		double rendaServicos = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double rendaCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		double gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double gastosEducacao = sc.nextDouble();

		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");

		double salarioMensal = rendaAnual / 12;
		double impostoSalario;

		if (salarioMensal < 3000) {
			impostoSalario = 0;
		} 
		else if (salarioMensal >= 3000 && salarioMensal <= 5000) {
			impostoSalario = rendaAnual * 0.10;
		} 
		else {
			impostoSalario = rendaAnual * 0.20;
		}

		System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);

		double impostoServicos = rendaServicos * 0.15;

		System.out.printf("Imposto sobre serviços: %.2f\n", impostoServicos);

		double impostoCapital = rendaCapital * 0.20;

		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);
		System.out.println();
		System.out.println("DEDUÇÕES:");

		double impostoTotal = impostoSalario + impostoServicos + impostoCapital;
		double maximoDedutivel = impostoTotal * 0.3;
		double gastosDedutiveis = gastosMedicos + gastosEducacao;

		System.out.printf("Máximo dedutível: %.2f\n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f\n", gastosDedutiveis);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", impostoTotal);

		double abatimento = gastosDedutiveis;

		if (abatimento > maximoDedutivel) {
			abatimento = maximoDedutivel;
		}

		System.out.printf("Abatimento: %.2f\n", abatimento);

		double impostoDevido = impostoTotal - abatimento;

		System.out.printf("Imposto devido: %.2f\n", impostoDevido);

		sc.close();
	}
}
