import java.util.Random;

public class Carta {
    
    public static final int VALOR_MAX = 13;
    private static int cuenta = 0;

    private Palo palo;
    private int valor;


    public Carta(int valor, Palo palo) {
        this.palo = palo;
        this.valor = valor;
        cuenta = cuenta + 1;
    }
    

    public Carta() {
        int palo = new Random().nextInt(Palo.values().length);
        this.palo = Palo.values()[palo];
        int valor = new Random().nextInt(VALOR_MAX) + 1;
        this.valor = valor + 1;
        cuenta = cuenta + 1;
    }

    
    public String toString() {
        char palo;
        if (this.palo == Palo.CORAZONES)
            palo = 'C';
        else if (this.palo == Palo.DIAMANTES)
            palo = 'D';
        else if (this.palo == Palo.PICAS)
            palo = 'P';
        else
            palo = 'T';
        return (Integer.toString(valor) + palo);
    }


    public static int getCuenta() {
        return cuenta;
    }


    public int getValor() {
        return valor;
    }


    public Palo getPalo () {
        return palo;
    }
}
        
