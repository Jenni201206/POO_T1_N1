package Quest_5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);
		        
		        System.out.print("Digite o salário do funcionário: ");
		        double salario = input.nextDouble();
		        
		        System.out.print("Digite o percentual de aumento: ");
		        double percentualAumento = input.nextDouble();
		        
		        double valorAumento = salario * (percentualAumento / 100);
		        double novoSalario = salario + valorAumento;
		        
		        System.out.printf("O valor do aumento é R$ %.2f\n", valorAumento);
		        System.out.printf("O novo salário é R$ %.2f\n", novoSalario);
		        
		        input.close();
		    }
	}