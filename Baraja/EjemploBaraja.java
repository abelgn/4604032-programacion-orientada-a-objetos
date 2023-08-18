
public class EjemploBaraja
{

    public void ejecutar() {
        Baraja baraja = new Baraja();

        System.out.println("Mazo inicial:");
        for (int carta = 0; carta < Baraja.NUM_CARTAS; carta++)
            System.out.print(baraja.carta(carta) + " ");
        System.out.println("\nCartas: " + Carta.getCuenta());
        baraja.barajar();
        System.out.println("Mazo después de barajar:");
        for (int carta = 0; carta < Baraja.NUM_CARTAS; carta++)
            System.out.print(baraja.carta(carta) + " ");
        System.out.println();
    }


    public static void main(String args[]) {
        EjemploBaraja miEjemplo = new EjemploBaraja();
        miEjemplo.ejecutar();
    }
}
