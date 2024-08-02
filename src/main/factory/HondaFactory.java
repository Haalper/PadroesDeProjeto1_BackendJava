package main.factory;

import main.produto.HondaSUV;
import main.produto.HondaSedan;
import main.produto.SUV;
import main.produto.Sedan;

public class HondaFactory implements CarroFactory {
    @Override
    public Sedan criarSedan() {
        return new HondaSedan();
    }

    @Override
    public SUV criarSUV() {
        return new HondaSUV();
    }
}
