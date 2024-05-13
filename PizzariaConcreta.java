package factory2.padrao.projeto;

public class PizzariaConcreta extends Pizzaria{

    @Override
    public Pizza criarPizza(String tipo) {
        switch (tipo){
            case "calabresa":
                return new PizzaCalabresa();
            case "frango":
                return new PizzaFrango();
            default:
                throw new IllegalArgumentException("Tipo de pizza não encontrado");
        }
    }
}
