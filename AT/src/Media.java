import java.util.Scanner;

public class Media {
    static class Aluno {
        String nome;
        String matricula;
        double N1;
        double N2;
        double N3;

        double calcularMedia() {
            return (N1 + N2 + N3) / 3;
        }
        void verificarAprovacao() {
            double media = calcularMedia();
            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno:");
        aluno.nome = scanner.nextLine();
        System.out.println("Digite o número da matrícula:");
        aluno.matricula = scanner.nextLine();
        System.out.println("==============");
        System.out.println("Digite a Nota 1:");
        aluno.N1 = scanner.nextDouble();
        System.out.println("Digite a Nota 2:");
        aluno.N2 = scanner.nextDouble();
        System.out.println("Digite a Nota 3:");
        aluno.N3 = scanner.nextDouble();
        System.out.println("==============");

        double media = aluno.calcularMedia();
        System.out.println("A média das notas " + aluno.N1 + ", " + aluno.N2 +
                ", " + aluno.N3 + " é " + media + ".");
        System.out.println("\n==============");
        aluno.verificarAprovacao();
        System.out.println("==============");
    }
}