package Quest_22;

import java.util.Scanner;

public class ContaDeEnergia {
	private double valorQuilowatt;
	private double quantidadeQuilowatts;

	public ContaDeEnergia(double salarioMinimo, double quantidadeQuilowatts) {
	        this.valorQuilowatt = salarioMinimo / 5;
	        this.quantidadeQuilowatts = quantidadeQuilowatts;
	    }

	    public double getValorQuilowatt() {
	        return valorQuilowatt;
	    }

	    public void setValorQuilowatt(double valorQuilowatt) {
	        this.valorQuilowatt = valorQuilowatt;
	    }

	    public double getQuantidadeQuilowatts() {
	        return quantidadeQuilowatts;
	    }

	    public void setQuantidadeQuilowatts(double quantidadeQuilowatts) {
	        this.quantidadeQuilowatts = quantidadeQuilowatts;
	    }

	    public double calcularValorConta() {
	        return quantidadeQuilowatts * valorQuilowatt;
	    }

	    public double calcularValorComDesconto() {
	        return calcularValorConta() * 0.85;
	    }

		public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

		    System.out.print("Digite o valor do salário mínimo: R$ ");
		    double salarioMinimo = input.nextDouble();

		    System.out.print("Digite a quantidade de quilowatts consumida: ");
		    double quantidadeQuilowatts = input.nextDouble();

		    ContaDeEnergia contaDeEnergia = new ContaDeEnergia(salarioMinimo, quantidadeQuilowatts);

		    double valorQuilowatt = contaDeEnergia.getValorQuilowatt();
		    double valorConta = contaDeEnergia.calcularValorConta();
		    double valorComDesconto = contaDeEnergia.calcularValorComDesconto();

		    System.out.printf("O valor em reais de cada quilowatt é: R$ %.2f\n", valorQuilowatt);
		    System.out.printf("O valor a ser pago pela residência é: R$ %.2f\n", valorConta);
		    System.out.printf("O valor a ser pago com desconto de 15%% é: R$ %.2f\n", valorComDesconto);
		    }
		}
