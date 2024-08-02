package main.cliente;

import main.produto.SUV;
import main.produto.Sedan;
import main.factory.CarroFactory;
import main.factory.HondaFactory;
import main.factory.ToyotaFactory;

public class Cliente {
    public static void main(String[] args) {
        CarroFactory hondaFactory = new HondaFactory();
        CarroFactory toyotaFactory = new ToyotaFactory();

        Sedan hondaSedan = hondaFactory.criarSedan();
        SUV hondaSUV = hondaFactory.criarSUV();

        Sedan toyotaSedan = toyotaFactory.criarSedan();
        SUV toyotaSUV = toyotaFactory.criarSUV();

        hondaSedan.exibirInfo();
        hondaSUV.exibirInfo();
        toyotaSedan.exibirInfo();
        toyotaSUV.exibirInfo();
    }
}
