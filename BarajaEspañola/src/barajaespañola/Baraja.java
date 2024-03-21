
package barajaespañola;

import java.util.ArrayList;
import java.util.Collections;

    public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;

    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();

        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    cartas.add(new Carta(i, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        } else {
            Carta siguiente = cartas.remove(0);
            monton.add(siguiente);
            return siguiente;
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public ArrayList<Carta> darCartas(int cantidad) {
        ArrayList<Carta> cartasADar = new ArrayList<>();
        if (cantidad <= cartasDisponibles()) {
            for (int i = 0; i < cantidad; i++) {
                cartasADar.add(siguienteCarta());
            }
        } else {
            System.out.println("No hay suficientes cartas disponibles.");
        }
        return cartasADar;
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("Aún no ha salido ninguna carta.");
        } else {
            System.out.println("Cartas en el montón:");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("Cartas en la baraja:");
        for (Carta carta : cartas) {
            System.out.println(carta);
    }
 }    
}

