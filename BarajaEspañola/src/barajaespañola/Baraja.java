
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
        System.out.print("Baraja creada con exito");
    }
    
    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(cartas);
        System.out.print("Baraja mezclada con exito");
    }

    /*siguienteCarta(): devuelve la siguiente carta que está en la baraja,
    cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.*/
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

    /*cartasDisponibles(): indica el número de cartas que aún se puede repartir.*/
    public int cartasDisponibles() {
        return cartas.size();
    }

    /*darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. 
    En caso de que haya menos cartas que las pedidas, no devolveremos nada, 
    pero debemos indicárselo al usuario.*/
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
    
    /*cartasMonton(): mostramos aquellas cartas que ya han salido,
    si no ha salido ninguna indicárselo al usuario*/
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

    /*mostrarBaraja(): muestra todas las cartas hasta el final. 
    Es decir, mostrará las cartas que no se han sacado.*/
    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("No hay mas cartas en la baraja");
        }
        System.out.println("Cartas en la baraja:");
        for (Carta carta : cartas) {
            System.out.println(carta);
    }
 }

public static void mostrarMenu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Barajar");
        System.out.println("2. Siguiente carta");
        System.out.println("3. Cartas disponibles");
        System.out.println("4. Dar cartas");
        System.out.println("5. Cartas del montón");
        System.out.println("6. Mostrar baraja");
        System.out.println("7. Salir");
        System.out.print("Ingrese una opción: ");
    }    
}

