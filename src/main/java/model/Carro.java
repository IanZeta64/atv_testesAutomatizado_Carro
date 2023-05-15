package model;

import service.CarroDesligado;
import service.CarroEstado;
import service.CarroLigadoAndando;
import service.CarroLigadoParado;

public class Carro {
    private String cor;
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    private CarroEstado carroEstado;


    public Carro(String cor, String marca, String modelo, int ano, int velocidadeMaxima) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.carroEstado = new CarroDesligado();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getEstadoAtual() {
        return carroEstado.estadoAtual(this);
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
        if(ligado) this.carroEstado = new CarroLigadoParado();
        else this.carroEstado = new CarroDesligado();
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
        if (velocidadeAtual > 0) this.carroEstado = new CarroLigadoAndando();
        else this.carroEstado = new CarroLigadoParado();
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", ligado=" + ligado +
                ", velocidadeAtual=" + velocidadeAtual +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }

    public void acelerar(int velocidadeAMais) {
       this.carroEstado.acelerar(this, velocidadeAMais);
    }


    public void frear(int velocidadeAMenos) {
        this.carroEstado.frear(this, velocidadeAMenos);
    }


    public void ligar() {
       this.carroEstado.ligar(this);
    }


    public void desligar() {
       this.carroEstado.desligar(this);
    }

    public String estadoAtual() {
       return this.carroEstado.estadoAtual(this);
    }
}
