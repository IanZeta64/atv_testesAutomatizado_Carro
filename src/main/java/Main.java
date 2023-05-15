import model.Carro;
import service.CarroService;
import service.CarroServiceImpl;

public class Main {

    /**
     *
     * Um carro tem os seguintes atributos:
     *  - cor
     *  - marca
     *  - modelo
     *  - ligado
     *  - velocidadeAtual
     *  - velocidadeMáxima
     *
     *  Enquanto o carro estiver desligado deve ser capaz de:
     *  - Ligar
     *  - Mostrar estado atual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     *
     *
     * - Só podemos realizar as ações como acelerar e frear com o carro ligado
     * - Só podemos desligar o carro quando ele parar totalmente (velocidadeAtual = 0)
     * - Não existe velocidade negativa
     * - O carro não pode passar de sua velocidade máxima
     *
     *
     * Realizar os testes unitários utilizando TDD
     */

    public static void main(String[] args) {
        Carro carro = new Carro("Prata", "Chevrolet", "Celta", 2001, 50);
        System.out.println(carro.getEstadoAtual());
        carro.acelerar(100);
        System.out.println(carro.getEstadoAtual());
        carro.ligar();
        System.out.println(carro.getEstadoAtual());
        carro.ligar();
        System.out.println(carro.getEstadoAtual());
        carro.acelerar(100);
        System.out.println(carro.getEstadoAtual());
        carro.desligar();
        System.out.println(carro.getEstadoAtual());
        carro.frear(100);
        System.out.println(carro.getEstadoAtual());
        carro.frear(100);
        System.out.println(carro.getEstadoAtual());
        carro.desligar();
        System.out.println(carro.getEstadoAtual());
        carro.desligar();
        System.out.println(carro.getEstadoAtual());
    }
}
