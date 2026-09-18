public class Processador {

    private String modelo;
    private double frequencia;

    public Processador(String modelo, double frequencia) {
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getModelo() {
        return modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }
}
