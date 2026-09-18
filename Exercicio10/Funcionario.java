public class Funcionario {

    private String nome;
    protected double salario;
    private Endereco endereco;

    public Funcionario(String nome, double salario, Endereco endereco) {
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("Cidade: " + endereco.getCidade());
    }
}
