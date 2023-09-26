import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.lang.NumberFormatException;

public class Raiz {

    public static void main (String[] args) {
        boolean error = false;
        Float numero = null;
        try {
            float val = Float.valueOf(args[0]);
            if (val >= 0) numero = val;
            System.out.println("La raíz cuadrada de " + numero
                + " es " + Math.sqrt(numero));
        } catch (NullPointerException excepcion) {
            System.out.println("No puedo calcular la raíz cuadrada"
                + " de un número negativo");
            error = true;
        } catch (ArrayIndexOutOfBoundsException excepcion) {
            System.out.println("Se requiere un número para calcular "
                + "su raíz cuadrada");
            error = true;
        } catch (NumberFormatException excepcion) {
            System.out.println("Error en el valor: " + excepcion);
            error = true;
        } finally {
            if (!error) 
                System.out.println("Bien hecho");
            else
                System.out.println("Inténtalo de nuevo");
        }
    }
}
