package barajaespañola;

import java.util.Scanner;

public class BarajaEspañola {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        Baraja baraja = new Baraja();
        
        int opcion;
        do {
            Baraja.mostrarMenu();
            opcion = leer.nextInt();
           
            switch (opcion) {
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    /*el metodo retorna una carta, creo una Carta para guardar el retorno del metodo
                    debido a que si no hay mas cartas en la baraja y llamo al metodo desde un sout
                    me mostraria null por pantalla, de esta forma evito que se muestre null*/
                    Carta x =baraja.siguienteCarta();
                    if (x!=null) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    System.out.println("Cartas disponibles en la baraja");
                    System.out.println(baraja.cartasDisponibles());
                    break;
                case 4:
                    System.out.println("Ingrese el numero de cartas a dar");
                    int cant = leer.nextInt();
                    baraja.darCartas(cant);
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 7);// aca se podria agregar un control mas , que si se termina la baraja tambien termina el juego
    }
    }

