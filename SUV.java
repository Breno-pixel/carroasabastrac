public class SUV implements Carro {
    private String modelo;
    private Contrato contrato;

    public SUV(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("SUV: " + modelo);
        if (contrato != null) {
            System.out.println("Contrato: " + contrato);
        } else {
            System.out.println("Sem contrato associado.");
        }
    }

    @Override
    public void associarContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
