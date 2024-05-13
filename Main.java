package factory2.padrao.projeto;

public class Main {
    public static void main(String[] args) {
        Pizzaria pizzaria = new PizzariaConcreta();
        Pizza pizza = pizzaria.encomendarPizza("calabresa");
    }
}
