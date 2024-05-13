package factory2.padrao.projeto;

public class PizzaCalabresa implements Pizza{

    @Override
    public void preparar() {
        System.out.println("Preparando pizza de calabresa: adiciona calabresa, queijo e orégano.");
    }

    @Override
    public void assar() {
        System.out.println("Assando pizza de calabresa.");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza de calabresa.");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando para entrega a pizza de calabresa.");
    }
}
