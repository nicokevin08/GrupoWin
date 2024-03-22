package barajaespañola;

public class BarajaEspañola {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();
        System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles());
        System.out.println("Mostrando algunas cartas:");
        System.out.println(baraja.siguienteCarta());
        System.out.println(baraja.siguienteCarta());
        System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles());
        System.out.println("Dando 5 cartas:");
        System.out.println(baraja.darCartas(5));
        baraja.cartasMonton();
        System.out.println("Mostrando todas las cartas restantes en la baraja:");
        baraja.mostrarBaraja();
    }
}
