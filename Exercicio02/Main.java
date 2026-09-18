public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Raquel", 1000.00);

        conta.exibirSaldo();

        System.out.println();

        conta.depositar(500.00);

        conta.sacar(200.00);

        System.out.println();

        conta.exibirSaldo();
    }
}
