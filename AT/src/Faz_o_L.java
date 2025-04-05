import java.util.Scanner;

public class Faz_o_L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal: ");
        double salarioMensal = scanner.nextDouble();
        double salarioA = salarioMensal * 12;
        double imposto = calcularI(salarioA);
        double salarioL = salarioA - imposto;

        System.out.printf("\nNome: %s\n", nome);
        System.out.printf("Salário Anual: R$ %.2f\n", salarioA);
        System.out.printf("Imposto a Pagar: R$ %.2f\n", imposto);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioL);
        scanner.close();
    }

    public static double calcularI(double salarioA) {
        if (salarioA <= 22847.76) {
            return 0.0;
        } else if (salarioA <= 33919.80) {
            return salarioA * 0.075;
        } else if (salarioA <= 45012.60) {
            return salarioA * 0.15;
        } else {
            return salarioA * 0.275;
        }
    }
}
