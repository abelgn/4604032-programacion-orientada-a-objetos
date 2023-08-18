import java.util.Random;

public class Baraja {
    
    public static final int NUM_CARTAS = 52;
    
    private Carta mazo[] = new Carta[NUM_CARTAS];

    public Baraja() {
        int i = 0;
        for (int palo = 0; palo < Palo.values().length; palo++) {
            for (int valor = 1; valor <= Carta.VALOR_MAX; valor++) {
                Carta carta = new Carta(valor, Palo.values()[palo]);
                mazo[i] = carta;
                i++;
            }
        }
    }
    

    public Carta carta(int i) {
        return mazo[i];
    }
    
    
    public void intercambiar(int i, int j) {
            Carta carta1 = mazo[j];
            Carta carta2 = mazo[i];
            mazo[i] = carta1;
            mazo[j] = carta2;
    }
            
    
    public void barajar() {
        Random random = new Random();
        int i = 0;
        while (i < NUM_CARTAS) {
            int j = random.nextInt(NUM_CARTAS);
            intercambiar(i, j);
            i++;
        }
    }
}
