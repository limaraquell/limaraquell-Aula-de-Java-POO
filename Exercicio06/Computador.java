public class Computador {

    private String marca;
    private double preco;
    private Processador processador;

    public Computador(String marca, double preco, String modeloProcessador, double frequencia) {
        this.marca = marca;
        this.preco = preco;

        this.processador = new Processador(modeloProcessador, frequencia);
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Processador: " + processador.getModelo());
        System.out.println("Frequência: " + processador.getFrequencia() + " GHz");
    }
}
