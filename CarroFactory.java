public interface CarroFactory {
    Carro criarSedan();
    Carro criarSUV();
    Contrato criarContrato(String localizacao, boolean tanqueCheio);
}

