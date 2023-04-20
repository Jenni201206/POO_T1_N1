package Quest_24;

import java.util.Scanner;

public class ConversorHoraMinutos {
	private double horaDigitada;

	public void setHoraDigitada(double horaDigitada) {
		this.horaDigitada = horaDigitada;
	    }

	    public int converterParaMinutos() {
	        int hora = (int) horaDigitada;
	        int minutos = (int) ((horaDigitada - hora) * 100 + 0.5);
	        int totalMinutos = hora * 60 + minutos;
	        return totalMinutos;
	    }

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        ConversorHoraMinutos conversor = new ConversorHoraMinutos();

		        System.out.print("Digite a hora (formato HH.MM): ");
		        double horaDigitada = input.nextDouble();

		        conversor.setHoraDigitada(horaDigitada);
		        int totalMinutos = conversor.converterParaMinutos();

		        System.out.printf("A hora digitada equivale a %d minutos\n", totalMinutos);
		    }
		}