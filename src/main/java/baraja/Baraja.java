package baraja;

import java.util.ArrayList;

public class Baraja {

    //atributos
    private ArrayList<Carta> cartas;

    //constructor
    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    //metodos
    public void generarCartaJoker(boolean color) {
        cartas.add(new CartaJoker(color));
    }

    public void generarCartaLiteral(char letra, Palo palo) {
        cartas.add(new CartaLiteral(letra, palo));
    }

    public void generarCartaNumeral(int numero, Palo palo) {
        cartas.add(new CartaNumeral(numero, palo));
    }

    public void mostrarCartas() {
        for (Carta carta : cartas) {
            carta.mostrar();
        }
    }

}
