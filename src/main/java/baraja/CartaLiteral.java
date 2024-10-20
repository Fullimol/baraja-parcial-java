package baraja;

public class CartaLiteral extends CartaConPalo {

    private int letra;

    public CartaLiteral(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }

    @Override
    public void voltear() {
        this.tapada = !this.tapada;
    }

    @Override
    public void mostrar() {

        if (!tapada) {
            System.out.println(letra + " de " + palo);
        } else {
            System.out.println("Carta Tapada");
        }
    }

}
