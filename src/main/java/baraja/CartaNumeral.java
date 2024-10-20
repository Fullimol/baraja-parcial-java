package baraja;


public class CartaNumeral extends CartaConPalo{
    
    private int numero;
    
    public CartaNumeral(int numero, Palo palo){
        super(palo);
        this.numero = numero;
    }
    
    @Override
    public void voltear(){
        this.tapada = !this.tapada;
    }
    
    @Override
    public void mostrar(){

        if(!tapada){
            System.out.println(numero + " de " + palo);
        }else{
            System.out.println("Carta Tapada");
        }
    }
}