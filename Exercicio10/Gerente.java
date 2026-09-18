public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(
        String nome,
        double salario,
        Endereco endereco,
        String departamento
    ) {
        super(nome, salario, endereco);
        this.departamento = departamento;
    }

    public void gerenciarEquipe() {
        System.out.println(
            getNome() + " está gerenciando a equipe."
        );
    }
}
