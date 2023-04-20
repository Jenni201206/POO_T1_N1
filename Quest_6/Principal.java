package Quest_6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salarioBase, gratificacao, imposto, salario;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o salário base: ");
		salarioBase = input.nextDouble();
		gratificacao = salarioBase * 0.05;
		imposto = salarioBase * 0.07;
		salario = salarioBase + gratificacao - imposto;
		System.out.printf("Seu salario base é %.2f"
				+ "\nVocê pagará de imposto R$%.2f"
				+ "\nReceberá gratificação de R$%.2f"
				+ "\nO salário será R$%.2f", salarioBase, imposto, gratificacao, salario);
		input.close();
	}
}