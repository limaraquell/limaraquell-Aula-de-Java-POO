public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(
            "Carlos",
            20,
            "Engenharia de Software"
        );

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Curso: " + aluno.getCurso());
    }
}
