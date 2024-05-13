package factory2.padrao.projeto;

public class PizzaFrango implements Pizza{

    @Override
    public void preparar() {
        System.out.println("Preparando pizza de frango: adiciona frango, queijo e orégano.");
    }

    @Override
    public void assar() {
        System.out.println("Assando pizza de frango.");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza de frango.");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando para entrega a pizza de frango.");
    }
}
