public class FabricaHonda implements CarroFactory {
    @Override
    public Carro criarSedan() {
        return new Sedan("Honda Civic");
    }

    @Override
    public Carro criarSUV() {
        return new SUV("Honda CR-V");
    }

    @Override
    public Contrato criarContrato(String localizacao, boolean tanqueCheio) {
        return new Contrato("Honda", localizacao, tanqueCheio);
    }
}
