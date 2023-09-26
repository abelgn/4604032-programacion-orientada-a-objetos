import java.util.Scanner;

public class ContadorLetras {
    
    public ContadorLetras(String palabra) {
        int[] cuenta = new int[26];

        // convierte la palabra a mayusculas
        palabra = palabra.toUpperCase();
      
        // cuenta la frecuencia de cada letra en la palabra
        for (int i = 0; i < palabra.length(); i++)
            cuenta[palabra.charAt(i) - 'A']++;
      
        // muestra las frecuencias
        System.out.println();
        for (int i = 0; i < cuenta.length; i++)
            if (cuenta[i] != 0)
                System.out.println((char)(i +'A') + ": " + cuenta[i]);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // palabra el usuario
        System.out.print("Ingresa una palabra (solo letras por favor): ");
        String palabra = scan.nextLine();
        new ContadorLetras(palabra);
    }
}
