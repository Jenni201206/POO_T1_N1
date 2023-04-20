package Quest_19;
import java.util.Scanner;

public class Escada {
    private double alturaDegrau;

    public Escada(double alturaDegrau) {
        this.alturaDegrau = alturaDegrau;
    }

    public int contaDegraus(double alturaDesejada) {
        return (int) Math.ceil(alturaDesejada / alturaDegrau);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura de cada degrau em cm: ");
        double alturaDegrau = sc.nextDouble();

        System.out.print("Digite a altura que deseja alcançar em cm: ");
        double alturaDesejada = sc.nextDouble();

        Escada escada = new Escada(alturaDegrau);
        int numDegraus = escada.contaDegraus(alturaDesejada);

        System.out.println("Você precisará subir " + numDegraus + " degraus para alcançar a altura desejada.");

        sc.close();
    }
}
