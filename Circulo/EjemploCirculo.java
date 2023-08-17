public class EjemploCirculo {
    
    public void ejecutar() {
        Circulo c1 = new Circulo(3);
        Circulo c2 = new Circulo(5);

        System.out.println("El círculo 1 tiene un radio de " + c1.radio);
        System.out.println("Su área es de " + c1.area());
        System.out.println("El círculo 2 tiene un radio de " + c2.radio);
        System.out.println("Su perímetro es de " + c2.perimetro());
    }
    
    
    public static void main(String[] args) {
        EjemploCirculo miEjemplo = new EjemploCirculo();
        miEjemplo.ejecutar();
    }
}
