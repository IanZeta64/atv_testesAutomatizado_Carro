package service;


import model.Carro;

public class CarroDesligado extends CarroEstado {

    @Override
    public void acelerar(Carro carro, int velocidadeAMais) {
        System.out.println("carro desligado, não pode acelerar.");

    }

    @Override
    public void frear(Carro carro, int velocidadeAMenos) {
        System.out.println("carro desligado, não pode frear.");
    }

    @Override
    public void desligar(Carro carro) {
        System.out.println("carro ja desligado.");
    }

    @Override
    public String estadoAtual(Carro carro) {
        String ligado = (carro.isLigado()) ? "ligado" : "desligado";
        String movimento = (carro.getVelocidadeAtual() > 0) ? "andando" : "parado";
        return String.format("Carro esta %s e %s.", ligado, movimento);
    }
}
