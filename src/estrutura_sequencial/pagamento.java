package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();
		
		double pagamento = horasTrabalhadas * valorHora;
		
		System.out.printf("O pagamento para %s deve ser R$ %.2f", nome, pagamento);
		
		
		
		
		sc.close();

	}

}
