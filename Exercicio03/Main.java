public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Carlos", 8.0, 7.0);
        Aluno aluno2 = new Aluno("Maria", 5.0, 6.0);
        Aluno aluno3 = new Aluno("João", 4.0, 5.0);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Situação: " + (aluno1.estaAprovado() ? "Aprovado" : "Reprovado"));

        System.out.println();

        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println("Situação: " + (aluno2.estaAprovado() ? "Aprovado" : "Reprovado"));

        System.out.println();

        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Média: " + aluno3.calcularMedia());
        System.out.println("Situação: " + (aluno3.estaAprovado() ? "Aprovado" : "Reprovado"));
    }
}
