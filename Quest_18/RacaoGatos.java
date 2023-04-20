package Quest_18;

import java.util.Scanner;

public class RacaoGatos {
	private double pesoSaco;
	private double qtdGato1;
	private double qtdGato2;

public RacaoGatos(double pesoSaco, double qtdGato1, double qtdGato2) {
	 this.pesoSaco = pesoSaco;
	 this.qtdGato1 = qtdGato1 / 1000;
	 this.qtdGato2 = qtdGato2 / 1000;
	    }
 
 public double calcularRacaoRestante(int dias) {
     double totalRacao = pesoSaco;
     totalRacao -= (qtdGato1 + qtdGato2) * dias;
     return totalRacao;
	    }
  
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

	 System.out.print("Digite o peso do saco de ração (em quilos): ");
	 double pesoSaco = input.nextDouble();

	 System.out.print("Digite a quantidade de ração fornecida para o gato 1 (em gramas): ");
	 double qtdGato1 = input.nextDouble();

	 System.out.print("Digite a quantidade de ração fornecida para o gato 2 (em gramas): ");
	 double qtdGato2 = input.nextDouble();

	 RacaoGatos racao = new RacaoGatos(pesoSaco, qtdGato1, qtdGato2);

	 double racaoRestante = racao.calcularRacaoRestante(5);

	 System.out.printf("Restarão %.2f kg de ração no saco após 5 dias.\n", racaoRestante);
		    }
		}
