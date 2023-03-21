package AbstractMethod;

public class FabricaInternacional implements FabricaAbstrata {

    @Override
    public Placa createPlaca() {
        return new PlacaInternacional();
    }

    @Override
    public Modelo createModelo() {
        return new ModeloInternacional();
    }
}