package main.factory;

import main.produto.SUV;
import main.produto.Sedan;
import main.produto.ToyotaSUV;
import main.produto.ToyotaSedan;

public class ToyotaFactory implements CarroFactory {
    @Override
    public Sedan criarSedan() {
        return new ToyotaSedan();
    }

    @Override
    public SUV criarSUV() {
        return new ToyotaSUV();
    }
}
