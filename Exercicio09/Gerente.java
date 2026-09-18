public class Gerente extends Funcionario {

    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public void exibirDados() {
        System.out.println(getNome());
        System.out.println(salario);
        System.out.println(setor);
    }
}
