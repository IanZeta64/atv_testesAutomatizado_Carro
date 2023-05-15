package service;
import exceptions.VelocidadeNegativaException;
import model.Carro;

public class CarroServiceImpl implements CarroService{

    @Override
    public void acelerar(Carro carro, int velocidadeAMais) {
        if (velocidadeAMais < 1){
            throw new VelocidadeNegativaException("Valor da velocidade negativa.");
        }
        carro.setVelocidadeAtual(Math.min(carro.getVelocidadeAtual() + velocidadeAMais, carro.getVelocidadeMaxima()));
        System.out.println("acelerando carro.");
    }

    @Override
    public void frear(Carro carro, int velocidadeAMenos) {
        if (velocidadeAMenos < 1){
            throw new VelocidadeNegativaException("Valor da velocidade negativa.");
        }
        carro.setVelocidadeAtual(Math.max(carro.getVelocidadeAtual() - velocidadeAMenos, 0));
        System.out.println("freando carro.");
    }

    @Override
    public void ligar(Carro carro) {
        carro.setLigado(true);
        System.out.println("ligando carro.");
    }

    @Override
    public void desligar(Carro carro) {
        carro.setLigado(false);
        System.out.println("desligando carro.");
    }

    @Override
    public String estadoAtual(Carro carro) {
        String ligado = (carro.isLigado()) ? "ligado" : "desligado";
        String movimento = (carro.getVelocidadeAtual() > 0) ? "andando" : "parado";
        return String.format("Carro esta %s e %s.", ligado, movimento);
    }
}
