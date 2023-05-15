package service;

import model.Carro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.CarroEstado;
import service.CarroLigadoAndando;

import static org.junit.jupiter.api.Assertions.*;

class CarroLigadoAndandoTest {

    private CarroEstado carroLigadoAndando;
    private Carro carro;
    @BeforeEach
    void setUp(){
        this.carroLigadoAndando = new CarroLigadoAndando();
        this.carro = new Carro("Azul", "Fiat", "Uno", 2015, 150);
        this.carro.setLigado(true);
        this.carro.setVelocidadeAtual(10);
    }
    @Test
    void deveManterCarroLigadoEAndandoEImprimirAvisoAoTentarLigar() {
        carroLigadoAndando.ligar(carro);
        assertTrue(carro.isLigado());
        assertTrue(carro.getVelocidadeAtual()> 0);

    }

    @Test
    void deveManterCarroLigadoEAndandoEImprimirAvisoAoTentarDesligar() {
        carroLigadoAndando.desligar(carro);
        assertTrue(carro.isLigado());
        assertTrue(carro.getVelocidadeAtual()> 0);
    }

    @Test
    void deveTestarEstadoLigadoEAndando() {
        assertEquals(carro.getEstadoAtual(),carroLigadoAndando.estadoAtual(carro));
        assertTrue(carro.isLigado());
        assertTrue(carro.getVelocidadeAtual() > 0);
    }
}