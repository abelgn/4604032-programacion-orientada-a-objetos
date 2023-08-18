import java.util.Random;

public class Baraja {
    
    public static final int NUM_CARTAS = 52;
    
    private Carta mazo[] = new Carta[NUM_CARTAS];

    public Baraja() {
        int i = 0;
        for (int p = 0; p < Palo.values().length; p++) {
            for (int v = 1; v <= Carta.VALOR_MAX; v++) {
                Carta c = new Carta(v, Palo.values()[p]);
                mazo[i] = c;
                i++;
            }
        }
    }
    

    public Carta getCarta(int i) {
        return mazo[i];
    }
    
    
    public void intercambiar(int i, int j) {
            Carta c1 = mazo[j];
            Carta c2 = mazo[i];
            mazo[i] = c1;
            mazo[j] = c2;
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