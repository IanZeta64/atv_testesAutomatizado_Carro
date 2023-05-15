package service;

import model.Carro;

public class CarroLigadoAndando extends CarroEstado{

    @Override
    public void ligar(Carro carro) {
        System.out.println("Carro ja esta ligado.");
    }

    @Override
    public void desligar(Carro carro) {
        System.out.println("Impossivel desligar carro em movimento.");
    }

    @Override
    public String estadoAtual(Carro carro) {
        String ligado = (carro.isLigado()) ? "ligado" : "desligado";
        String movimento = (carro.getVelocidadeAtual() > 0) ? "andando" : "parado";
        return String.format("Carro esta %s e %s.", ligado, movimento);
    }
}
