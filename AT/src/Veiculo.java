public class Veiculo {
    String placa;
    String modelo;
    int anoF;
    double Km;

    Veiculo(String p, String m, int a, double q) {
        placa = p;
        modelo = m;
        anoF = a;
        Km = q;
    }
    void Viagem(double km) {
        if (km > 0) {
            Km+= km;
            System.out.printf("\nViagem registrada. KM adicionada: %.2f km\n", km);
        } else {
            System.out.println("\nA KM registrada deve ser positiva.");
        }
    }
    void exibirDetalhes() {
        System.out.println("\n====================");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoF);
        System.out.printf("KM: %.2f km\n", Km);
        System.out.println("====================");
    }
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("OCU-0800", "corsa classic", 2015, 40000);
        Veiculo veiculo2 = new Veiculo("CUU-1234", "ferrari", 2000, 3000);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
        veiculo1.Viagem(1500.509);
        veiculo2.Viagem(500.0);
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}
