public class Bonus {

    static class Funcionario {
        String nome;
        double salarioBase;

        public Funcionario(String nome, double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
        }
        public double salario() {
            return salarioBase;
        }
        public void dados() {
            System.out.printf("%s (%s): Salário = R$%.2f%n",
                    nome, getClass().getSimpleName(), salario());
        }
    }
    static class Herdeiro extends Funcionario {
        public Herdeiro(String nome, double salarioBase) {
            super(nome, salarioBase);
        }
        public double salario() {
            return salarioBase * 1.20;
        }
    }
    static class Inutil extends Funcionario {
        public Inutil(String nome, double salarioBase) {
            super(nome, salarioBase);
        }
        public double salario() {
            return salarioBase * 0.90;
        }
    }
    public static void main(String[] args) {

        Herdeiro herdeiro = new Herdeiro("Natan Robers", 50000.00);
        Inutil inutil = new Inutil("Nayanda", 1200.00);
        System.out.println("=====================");
        herdeiro.dados();
        inutil.dados();
        System.out.println("=====================");
    }
}//herdeiro é o gerente e a inutil é o estagiario