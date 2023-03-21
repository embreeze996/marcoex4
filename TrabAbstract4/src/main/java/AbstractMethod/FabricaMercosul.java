package AbstractMethod;

public class FabricaMercosul implements FabricaAbstrata {

    @Override
    public Placa createPlaca() {
        return new PlacaMercosul();
    }

    @Override
    public Modelo createModelo() {
        return new ModeloMercosul();
    }
}