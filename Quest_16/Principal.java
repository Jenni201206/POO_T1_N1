package Quest_16;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        double valorHoraTrabalhada = salarioMinimo / 2;
        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        double imposto = salarioBruto * 0.03;
        double salarioFinal = salarioBruto - imposto;
        System.out.println("O valor das horas trabalhadas é: " +valorHoraTrabalhada);
        System.out.println("o salário bruto é: " +salarioBruto);
        System.out.println("o imposto é: " +imposto);
        System.out.println("O salário a receber é: " + salarioFinal);

        sc.close();
    }
}