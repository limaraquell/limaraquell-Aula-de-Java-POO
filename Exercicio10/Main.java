public class Main {

    public static void main(String[] args) {

        Endereco enderecoCarlos = new Endereco(
            "Rua das Palmeiras",
            100,
            "São Paulo"
        );

        Endereco enderecoMaria = new Endereco(
            "Rua das Flores",
            200,
            "Campinas"
        );

        Desenvolvedor desenvolvedor = new Desenvolvedor(
            "Carlos",
            5000.00,
            enderecoCarlos,
            "Java"
        );

        Gerente gerente = new Gerente(
            "Maria",
            8000.00,
            enderecoMaria,
            "Tecnologia"
        );

        System.out.println("=== DESENVOLVEDOR ===");
        desenvolvedor.exibirDados();
        System.out.println("Linguagem: Java");
        desenvolvedor.programar();

        System.out.println();

        System.out.println("=== GERENTE ===");
        gerente.exibirDados();
        System.out.println("Departamento: Tecnologia");
        gerente.gerenciarEquipe();
    }
}
