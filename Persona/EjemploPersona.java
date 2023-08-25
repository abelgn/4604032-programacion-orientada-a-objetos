public class EjemploPersona
{

    public void ejecutar() {
        Empleado e = new Empleado("Pedro", "Gómez", 54321, 12345);
        System.out.println("Empleado: " + e);
        Alumno a = new Alumno("Pedro", "Gómez", 21234334, "LIC");
        System.out.println("Alumno: " + a);
    
        if (e instanceof Empleado)
            System.out.println(e + ", es una instancia de Empleado");
        if (e instanceof Persona)
            System.out.println(e + ", es una instancia de Persona");
        if (a instanceof Alumno)
            System.out.println(a + ", a es una instancia de Alumno");
    }
    
    
    public static void main(String args[]) {
        EjemploPersona miEjemplo = new EjemploPersona();
        miEjemplo.ejecutar();
    }
}
