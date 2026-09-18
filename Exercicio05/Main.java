public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco(
            "Rua das Flores",
            100,
            "São Paulo"
        );

        Pessoa pessoa = new Pessoa(
            "João",
            25,
            endereco
        );

        pessoa.exibirDados();
    }
}
