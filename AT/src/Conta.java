public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado.%n", valor);
        } else {
            System.out.println("O valor deve ser positivo!");
        }
        System.out.println("======================");
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado.%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
        System.out.println("======================");
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s%n", titular);
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
        System.out.println("======================");
    }

    public static void main(String[] args) {
        Conta conta = new Conta("Natan Robers", 1000000); // pai ta rico
        conta.exibirSaldo();
        conta.depositar(5000);
        conta.sacar(30000);
        conta.sacar(150000);
        conta.exibirSaldo();
    }
}