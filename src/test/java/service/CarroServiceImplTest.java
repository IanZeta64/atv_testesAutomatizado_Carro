package service;
import exceptions.VelocidadeNegativaException;
import model.Carro;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarroServiceImplTest {
    private Carro carroTeste01;
    private Carro carroTeste02;
    private Carro carroTeste03;

    @Before
    public void setUp() throws Exception {
    this.carroTeste01 = new Carro("Azul", "Fiat", "Uno", 2015, 150);
    this.carroTeste02 = new Carro("vermelho", "marca", "modelo", 1990, 100);
    this.carroTeste03 = new Carro("Prata", "Chevrolet", "Celta", 2001, 50);
    }

    @Test
    public void deveAcelerarCorretamente() {

        // Given
        carroTeste01.ligar();

        // When
        carroTeste01.acelerar(10);

        // Then
        // Assertivas
        // O Junit busca por Asserts no método para validar que o teste passou
        assertTrue(carroTeste01.isLigado());
        assertEquals(10, carroTeste01.getVelocidadeAtual());
        assertEquals("Carro esta ligado e andando.", carroTeste01.getEstadoAtual());
    }

    @Test
    public void deveLigarCorretamente() {

        // Quando
        carroTeste02.ligar();

        // Então
        assertTrue(carroTeste02.isLigado());
        assertEquals("Carro esta ligado e parado.", carroTeste02.estadoAtual());
    }

    @Test
    public void velocidadeNaoDeveSerMenorQueZero() {
        // O Junit busca por Assets no método para validar que o teste passou

        // Dado:

        carroTeste03.ligar(); // velocidade zero

        // Quando:
        carroTeste03.frear(10);

        // Então:
        assertTrue(carroTeste03.isLigado());
        assertEquals(0, carroTeste03.getVelocidadeAtual());
        assertEquals("Carro esta ligado e parado.", carroTeste03.estadoAtual());
    }

    @Test
    public void deveLigarCorretamenteEAcelerarCorretamente() {

        // Quando:
        carroTeste03.ligar();
        carroTeste03.acelerar(10);

        // Então:
        assertTrue(carroTeste03.isLigado());
        assertEquals(10, carroTeste03.getVelocidadeAtual());
        assertEquals("Carro esta ligado e andando.", carroTeste03.estadoAtual());
    }

    @Test
    public void deveManterLigadoAoTentarDesligarEmMovimento(){
        carroTeste02.ligar();
        carroTeste02.acelerar(10);

        assertTrue(carroTeste02.isLigado());
        assertEquals(10, carroTeste02.getVelocidadeAtual());
        assertEquals("Carro esta ligado e andando.", carroTeste02.estadoAtual());
    }

    @Test
    public void deveRespeitarAVelocidadeMaxima(){
        carroTeste01.ligar();
        carroTeste01.acelerar(1000);
        assertEquals(carroTeste01.getVelocidadeMaxima(), carroTeste01.getVelocidadeAtual());
    }

    @Test
    public void deveLancarExcessaoDeVelocidadeNegativa(){
        carroTeste01.ligar();
        carroTeste01.acelerar(10);
       try{
           carroTeste01.acelerar(-10);
       }catch (VelocidadeNegativaException velocidadeNegativaException){
           assertEquals("Valor da velocidade negativa.", velocidadeNegativaException.getMessage());
       }

        try{
            carroTeste01.frear(-10);
        }catch (VelocidadeNegativaException velocidadeNegativaException){
            assertEquals("Valor da velocidade negativa.", velocidadeNegativaException.getMessage());
        }
    }


}
