public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
            "Maria",
            "Desenvolvedora",
            5000.00
        );

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.printf("Salário: R$ %.2f%n", funcionario.getSalario());

        funcionario.aumentarSalario(10);

        System.out.printf("Novo salário: R$ %.2f%n", funcionario.getSalario());
    }
}
