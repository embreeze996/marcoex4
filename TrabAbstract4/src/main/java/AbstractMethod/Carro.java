package AbstractMethod;

public class Carro {

    private Placa placa;
    private Modelo modelo;

    public Carro (FabricaAbstrata fabrica) {
        this.placa = fabrica.createPlaca();
        this.modelo = fabrica.createModelo();
    }

    public String emitirPlaca() {
        return this.placa.emitir();
    }

    public String emitirModelo() {
        return this.modelo.emitir();
    }
}
