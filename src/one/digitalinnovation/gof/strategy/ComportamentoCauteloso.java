package one.digitalinnovation.gof.strategy;

public class ComportamentoCauteloso implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se cautelosamente...");
    }
}
