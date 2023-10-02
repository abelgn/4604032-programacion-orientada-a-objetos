import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivo {

    private static boolean contieneExtension(String nombreArchivo) {
        if (nombreArchivo.contains(".txt") || nombreArchivo.contains(".doc"))
            return (true);
        return (false);
    }

    private static boolean esCorrectoNombreArchivo(String nombreArchivo) {
        if (nombreArchivo.equals("nombreArchivoErroneo.txt"))
            return (false);
        else
            return (true);
    }
    
    public static String primeraLinea(String nombreArchivo)
            throws NombreArchivoIncorrectoException, IllegalArgumentException, ExtensionArchivoIncorrectaException, FileNotFoundException {
        try {
            Scanner archivo = new Scanner(new File(nombreArchivo));
            if (archivo.hasNextLine()) {
                return archivo.nextLine();
            } else {
                throw new IllegalArgumentException(nombreArchivo
                        + " (El archivo no se puede leer)");
            }
        } catch (FileNotFoundException err) {
            if (!esCorrectoNombreArchivo(nombreArchivo)) {
                throw new NombreArchivoIncorrectoException(nombreArchivo
                        + " (Seleccionar otro archivo)");
            } else {
                throw err;
            }

        } catch (IllegalArgumentException err) {
            if (!contieneExtension(nombreArchivo)) {
                throw new ExtensionArchivoIncorrectaException(nombreArchivo
                        + " (Sólo leo archivos de texto)" );
            } else {
                throw err;
            }
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(primeraLinea(args[0]));
        } catch (ExtensionArchivoIncorrectaException | IllegalArgumentException
                 | NombreArchivoIncorrectoException | FileNotFoundException err) {
            System.out.println(err);
        }
    }

}
