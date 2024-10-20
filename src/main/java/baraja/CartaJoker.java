package baraja;


public class CartaJoker extends Carta {
    
    private boolean color;
    
    public CartaJoker(boolean color){
        super();
        this.color = color;
    }
    
    @Override
    public void mostrar(){
        System.out.println("Joker " + (color ? "Rojo": "Negro"));
    }
    
    @Override
    public void voltear(){
        this.tapada = !this.tapada;
    }
}