
public class EjemploBaraja
{

    public void ejecutar() {
        Baraja b = new Baraja();

        System.out.println("Mazo inicial:");
        for (int c = 0; c < Baraja.NUM_CARTAS; c++)
            System.out.print(b.getCarta(c) + " ");
        System.out.println("\nCartas: " + Carta.getCuenta());
        b.barajar();
        System.out.println("Mazo después de barajar:");
        for (int c = 0; c < Baraja.NUM_CARTAS; c++)
        System.out.print(b.getCarta(c) + " ");
        System.out.println();
    }


    public static void main(String args[]) {
        EjemploBaraja miEjemplo = new EjemploBaraja();
        miEjemplo.ejecutar();
    }
}
