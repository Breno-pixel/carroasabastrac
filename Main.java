public class Main {
    public static void main(String[] args) {
        // Fábrica Toyota
        CarroFactory fabricaToyota = new FabricaToyota();
        Carro sedanToyota = fabricaToyota.criarSedan();
        Carro suvToyota = fabricaToyota.criarSUV();
        Contrato contratoToyota = fabricaToyota.criarContrato("São Paulo", true);

        sedanToyota.associarContrato(contratoToyota);
        suvToyota.associarContrato(fabricaToyota.criarContrato("Rio de Janeiro", false));

        System.out.println("Carros da Toyota:");
        sedanToyota.exibirInformacoes();
        suvToyota.exibirInformacoes();

        System.out.println();

        // Fábrica Honda
        CarroFactory fabricaHonda = new FabricaHonda();
        Carro sedanHonda = fabricaHonda.criarSedan();
        Carro suvHonda = fabricaHonda.criarSUV();
        Contrato contratoHonda = fabricaHonda.criarContrato("Belo Horizonte", true);

        sedanHonda.associarContrato(contratoHonda);
        suvHonda.associarContrato(fabricaHonda.criarContrato("Curitiba", false));

        System.out.println("Carros da Honda:");
        sedanHonda.exibirInformacoes();
        suvHonda.exibirInformacoes();
    }
}
