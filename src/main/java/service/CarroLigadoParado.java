package service;

import model.Carro;

public class CarroLigadoParado extends CarroEstado{

    @Override
    public void frear(Carro carro, int velocidadeAMenos) {
        System.out.println("Carro ja esta parado.");
    }
    @Override
    public void ligar(Carro carro) {
        System.out.println("Carro ja esta ligado.");
    }
    @Override
    public String estadoAtual(Carro carro) {
        String ligado = (carro.isLigado()) ? "ligado" : "desligado";
        String movimento = (carro.getVelocidadeAtual() > 0) ? "andando" : "parado";
        return String.format("Carro esta %s e %s.", ligado, movimento);
    }
}
