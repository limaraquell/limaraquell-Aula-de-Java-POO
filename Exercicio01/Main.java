public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500.00, 5);
        Produto produto2 = new Produto("Mouse", 80.00, 10);

        produto1.exibirDados();

        System.out.println();

        produto2.exibirDados();
    }
}
