import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Compra {
    private static final String Estoque = "estoque.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("================");
            System.out.println("1 - Inserir Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Sair");
            System.out.println("================");

            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                inserirProduto();
            } else if (opcao.equals("2")) {
                listarProdutos();
            } else if (opcao.equals("3")) {
                System.out.println("Saindo do sistema...");
                scanner.close();
                return;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private static void inserirProduto() {
        System.out.print("\nNome do Produto: ");
        String nome = scanner.nextLine();

        System.out.print("Quantidade em estoque: ");
        int quantidade;
        try {
            quantidade = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Quantidade inválida! Use apenas números.");
            return;
        }

        System.out.print("Preço: ");
        double preco;
        try {
            preco = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Preço inválido! Use números com ponto decimal.");
            return;
        }

        try (FileWriter fw = new FileWriter(Estoque, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            out.printf("%s,%d,%.2f%n", nome, quantidade, preco);
            System.out.println("\nProduto cadastrado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }

    private static void listarProdutos() {
        File arquivo = new File(Estoque);

        if (!arquivo.exists()) {
            System.out.println("\nNenhum produto cadastrado ainda.");
            return;
        }

        List<String> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(Estoque))) {
        String linha;
        linha = br.readLine();
        if (linha != null) {
         produtos.add(linha);
         linha = br.readLine();
         if (linha != null) {
          produtos.add(linha);
         linha = br.readLine();
         if (linha != null) {
          produtos.add(linha);

         }
  }
 }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }
        if (produtos.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado.");
            return;
        }
        System.out.println("\nLista de Produtos:");
        System.out.println("=======================");

        if (!produtos.isEmpty()) {
        Produto(produtos.get(0));
        if (produtos.size() > 1) {
        Produto(produtos.get(1));
        if (produtos.size() > 2) {
        Produto(produtos.get(2));

     }
    }
   }
        System.out.println("=======================");
        System.out.println("Enter para voltar ao menu");
        scanner.nextLine();
    }
    private static void Produto(String produto) {
        String[] dados = produto.split(",");
        System.out.printf("Produto: %s | Quantidade: %s | Preço: R$ %s%n",
                dados[0], dados[1], dados[2]);
    }
}