package baraja;


public abstract class Carta {
    
    protected boolean tapada;
    
    public Carta(){
        this.tapada = false;
    }
    
    public abstract void voltear();
    public abstract void mostrar();
    
}
