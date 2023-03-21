package AbstractMethodTestes;

import AbstractMethod.Carro;
import AbstractMethod.FabricaAbstrata;
import AbstractMethod.FabricaInternacional;
import AbstractMethod.FabricaMercosul;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTeste {

    @Test
    void deveEmitirModeloMercosul() {
        FabricaAbstrata fabrica = new FabricaMercosul();
        Carro carro = new Carro(fabrica);
        assertEquals("Modelo do Mercosul", carro.emitirModelo());
    }

    @Test
    void deveEmitirModeloInternacional() {
        FabricaAbstrata fabrica = new FabricaInternacional();
        Carro carro = new Carro(fabrica);
        assertEquals("Histórico de Pós Graduação", carro.emitirModelo());
    }

    @Test
    void deveEmitirPlacaMercosul() {
        FabricaAbstrata fabrica = new FabricaMercosul();
        Carro carro = new Carro(fabrica);
        assertEquals("Diploma de Graduação", carro.emitirPlaca());
    }

    @Test
    void deveEmitirPlacaInternacional() {
        FabricaAbstrata fabrica = new FabricaInternacional();
        Carro carro = new Carro(fabrica);
        assertEquals("Diploma de Pós Graduação", carro.emitirPlaca());
    }

}