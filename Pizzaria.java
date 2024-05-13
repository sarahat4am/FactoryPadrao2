package factory2.padrao.projeto;

public abstract class Pizzaria {

    public abstract Pizza criarPizza(String tipo);

    public Pizza encomendarPizza(String tipo){
        Pizza pizza = criarPizza(tipo);
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();
        return pizza;
    }
}
