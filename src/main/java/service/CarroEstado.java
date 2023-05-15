package service;

import model.Carro;
import service.CarroServiceImpl;

public abstract class CarroEstado extends CarroServiceImpl {
    @Override
    public void acelerar(Carro carro, int velocidadeAMais) {
        super.acelerar(carro, velocidadeAMais);
    }

    @Override
    public void frear(Carro carro, int velocidadeAMenos) {
        super.frear(carro, velocidadeAMenos);
    }

    @Override
    public void ligar(Carro carro) {
        super.ligar(carro);
    }

    @Override
    public void desligar(Carro carro) {
        super.desligar(carro);
    }

    @Override
    public String estadoAtual(Carro carro) {
        return super.estadoAtual(carro);
    }
}
