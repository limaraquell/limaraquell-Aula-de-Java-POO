public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;

    public Desenvolvedor(
        String nome,
        double salario,
        Endereco endereco,
        String linguagemPrincipal
    ) {
        super(nome, salario, endereco);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public void programar() {
        System.out.println(
            getNome() + " está programando em " + linguagemPrincipal + "."
        );
    }
}
