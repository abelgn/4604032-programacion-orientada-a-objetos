public class LanzadorExcepcion {

    private static boolean verificarElegibilidad(int edad, int peso) {
        if (edad < 15 || peso < 50) {
            throw new ArithmeticException("La persona no puede usar el juego.");
        }
        return true;
    }

    public static void main(String[] args) {
        boolean elegible = false;
        System.out.println("¡Bienvenido al servicio de registro!");
        try {
            elegible = verificarElegibilidad(Integer.valueOf(args[0]),
                Integer.valueOf(args[1]));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (elegible) {
                System.out.println("La persona cumple con los criterios.");
            }
        }
    }
}
