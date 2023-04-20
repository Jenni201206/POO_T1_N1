package Quest_9;

import java.util.Scanner;

public class Triangulo {
	
	public double base;
	public double altura;
	public double area;

	public Triangulo() {
		base=0;
		altura=0;
		area=0;
	}
	
	public void calcArea() {
		area=(base*altura)/2;
	}
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a base e a altura do triângulo: ");
		double base = input.nextDouble();
		double altura = input.nextDouble();
		
		Triangulo meuTriangulo = new Triangulo();
		meuTriangulo.base = base;
		meuTriangulo.altura = altura;
		meuTriangulo.calcArea();
		
		System.out.println("A base do triângulo é: " +base);
		System.out.println("A altura do triângulo é: " +altura);
		System.out.println("A area do triângulo é: " + meuTriangulo.area);
		
		input.close();
	}		
}