package service;

import model.Carro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.CarroEstado;
import service.CarroLigadoParado;

import static org.junit.jupiter.api.Assertions.*;



class CarroLigadoParadoTest {

    private CarroEstado carroLigadoParado;
    private Carro carro;
    @BeforeEach
    void setUp(){
        this.carroLigadoParado  = new CarroLigadoParado();
        this.carro = new Carro("Azul", "Fiat", "Uno", 2015, 150);
        this.carro.setLigado(true);
    }
    @Test
    void frear() {
        carroLigadoParado.frear(carro, 10);
        assertFalse(carro.getVelocidadeAtual() < 0);
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void ligar() {
        carroLigadoParado.ligar(carro);
        assertTrue(carro.isLigado());
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void deveTestarEstadoLigadoEParado() {
        assertEquals(carro.getEstadoAtual(),carroLigadoParado.estadoAtual(carro));
        assertTrue(carro.isLigado());
        assertEquals(0, carro.getVelocidadeAtual());
    }
}