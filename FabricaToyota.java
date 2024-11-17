public class FabricaToyota implements CarroFactory {
    @Override
    public Carro criarSedan() {
        return new Sedan("Toyota Corolla");
    }

    @Override
    public Carro criarSUV() {
        return new SUV("Toyota RAV4");
    }

    @Override
    public Contrato criarContrato(String localizacao, boolean tanqueCheio) {
        return new Contrato("Toyota", localizacao, tanqueCheio);
    }
}

