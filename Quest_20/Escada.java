package Quest_20;

import java.util.Scanner;

public class Escada {
    private double angulo;
    private double altura;

    public Escada(double angulo, double altura) {
        this.angulo = angulo;
        this.altura = altura;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularMedida() {
        return altura / Math.sin(Math.toRadians(angulo));
    }
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Digite o ângulo formado pela escada (em graus): ");
		        double angulo = input.nextDouble();

		        System.out.print("Digite a altura da parede onde está a ponta da escada (em metros): ");
		        double altura = input.nextDouble();

		        Escada escada = new Escada(angulo, altura);

		        double medida = escada.calcularMedida();

		        System.out.printf("A medida da escada é: %.2f metros\n", medida);
		    }


	}
