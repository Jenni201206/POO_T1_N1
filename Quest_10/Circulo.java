package Quest_10;

import java.util.Scanner;

import Quest_9.Triangulo;

public class Circulo {
	
	public double pi;
	public double raio;
	public double area;
	
	public Circulo() {
		pi= Math.PI;  // 3.14;
		raio=0;
		area=0;
	}
	
	public void calcArea() {
		area=pi*raio*raio;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o raio do circulo: ");
		double raio = input.nextDouble();
		
		Circulo meuCirculo = new Circulo();
		meuCirculo.raio = raio;
		meuCirculo.calcArea();
		
		System.out.println("O raio do circulo é: " +raio);
		System.out.println("pi é igual a :"+meuCirculo.pi);
		System.out.println("A area do circulo é: " + meuCirculo.area);
		
		
		

	}

}
