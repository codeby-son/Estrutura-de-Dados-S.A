public class Empresa {

    private String nomeFantasia;
    private String inscricaoEstadual;
    private double valorMercado;

    public Empresa(String nomeFantasia, String inscricaoEstadual, double valorMercado) {
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
        this.valorMercado = valorMercado;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public double getValorMercado() {
        return valorMercado;
    }
}
