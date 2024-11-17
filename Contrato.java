public class Contrato {
    private String marca;
    private String localizacao;
    private boolean tanqueCheio;

    // Construtor
    public Contrato(String marca, String localizacao, boolean tanqueCheio) {
        this.marca = marca;
        this.localizacao = localizacao;
        this.tanqueCheio = tanqueCheio;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public boolean isTanqueCheio() {
        return tanqueCheio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                ", Localização: " + localizacao +
                ", Tanque Cheio: " + (tanqueCheio ? "Sim" : "Não");
    }
}
