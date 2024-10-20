package baraja;


public enum Palo {
    PICA,
    CORAZON,
    TREBOL,
    DIAMANTE;
    
    private Color color;
    
    static {
        PICA.color = Color.NEGRO;
        CORAZON.color = Color.ROJO;
        TREBOL.color = Color.NEGRO;
        DIAMANTE.color = Color.ROJO;
    }
    
    public Color getColor(){
        return this.color;
    }
}

