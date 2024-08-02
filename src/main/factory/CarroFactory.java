package main.factory;

import main.produto.SUV;
import main.produto.Sedan;

public interface CarroFactory {
    Sedan criarSedan();
    SUV criarSUV();
}
