package service;
import model.Carro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.CarroDesligado;
import service.CarroEstado;

import static org.junit.jupiter.api.Assertions.*;

class CarroDesligadoTest {


    private CarroEstado carroDesligado;
    private Carro carro;
    @BeforeEach
    void setUp(){
        this.carro = new Carro("Azul", "Fiat", "Uno", 2015, 150);
        this.carroDesligado = new CarroDesligado();
    }

    @Test
    void deveManterVelocidade0ComCarroDesligadoAoAcelerar() {
        carroDesligado.acelerar(carro, 10);
        assertFalse(carro.isLigado());
        assertEquals(0, carro.getVelocidadeAtual());

    }

    @Test
    void deveManterVelocidade0ComCarroDeigadoAoFrear() {
        carroDesligado.frear(carro, 10);
        assertFalse(carro.isLigado());
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void deveManterCarroDesligadoEImprmirAviso() {
        carroDesligado.desligar(carro);
        assertFalse(carro.isLigado());
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void deveTestarEstadoDesligadoEParado() {
        assertEquals(carro.getEstadoAtual(),carroDesligado.estadoAtual(carro));
        assertFalse(carro.isLigado());
        assertEquals(0, carro.getVelocidadeAtual());
    }
}