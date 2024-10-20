package baraja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<>();
        Baraja barajaCreada = new Baraja(cartas);
        
        // Generar cartas
        barajaCreada.generarCartaJoker(true); // Rojo
        barajaCreada.generarCartaJoker(false); // Negro
        barajaCreada.generarCartaLiteral('J', Palo.CORAZON);
        barajaCreada.generarCartaLiteral('Q', Palo.DIAMANTE);
        barajaCreada.generarCartaLiteral('K', Palo.TREBOL);
        barajaCreada.generarCartaLiteral('A', Palo.PICA);
        barajaCreada.generarCartaNumeral(2, Palo.CORAZON);
        barajaCreada.generarCartaNumeral(3, Palo.DIAMANTE);
        barajaCreada.generarCartaNumeral(4, Palo.TREBOL);
        barajaCreada.generarCartaNumeral(5, Palo.PICA);
       
        barajaCreada.mostrarCartas();
 
    }
}
