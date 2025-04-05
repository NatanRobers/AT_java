import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numerosSorteados = new int[6];
        System.out.println("Gerando números da loteria...");
        int popo = 0;
        while (popo < 6) {
         int num = random.nextInt(60) + 1;
        boolean repetido = false;
        int papa = 0;
        while (papa < popo) {
        if (numerosSorteados[papa] == num) {
            repetido = true;
            break;
        }
        papa++;
 }
     if (!repetido) {
        numerosSorteados[popo] = num;
        popo++;
         }
 }
        Arrays.sort(numerosSorteados);
        int[] Usuario = new int[6];
        System.out.println("\nDigite 6 números entre 1 e 60 (sem repetir):");
        int lulu = 0;
        while (lulu < 6) {
            System.out.print("Número " + (lulu + 1) + ": ");
            try {
                int num = Integer.parseInt(scanner.nextLine());

                if (num < 1 || num > 60) {
                    System.out.println("Deve ser entre 1 e 60.");
                    continue;
                }
                boolean repetido = false;
                int l = 0;
                while (l < lulu) {
                    if (Usuario[l] == num) {
                        repetido = true;
                        break;
                    }
                    l++;
                }
                if (repetido) {
                    System.out.println("Número repetido! Digite outro.");
                } else {
                    Usuario[lulu] = num;
                    lulu++;
                }
            } catch (NumberFormatException e) {
                System.out.println("digite um número válido, animal.");
            }
        }
        Arrays.sort(Usuario);
        int acertos = 0;
        int lolo = 0;
        while (lolo < 6) {
            int lala = 0;
            while (lala < 6) {
                if (Usuario[lolo] == numerosSorteados[lala]) {
                    acertos++;
                    break;
                }
                lala++;
            }
            lolo++;
        }
        System.out.println("\nNúmeros Aleatorios: " + Arrays.toString(numerosSorteados));
        System.out.println("Seus números: " + Arrays.toString(Usuario));
        System.out.println("\nVocê acertou " + acertos + " números.");

        scanner.close();
    }
}//devia ter escolido melhor os nomes