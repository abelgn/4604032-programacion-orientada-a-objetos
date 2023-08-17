public class EjemploCirculo {
    
    public void ejecutar() {
        Circulo circulo1 = new Circulo(3);
        Circulo circulo2 = new Circulo(5);

        System.out.println("El círculo 1 tiene un radio de " + circulo1.radio);
        System.out.println("Su área es de " + circulo1.area());
        System.out.println("Su perímetro es de " + circulo1.perimetro());
        System.out.println("El círculo 2 tiene un radio de " + circulo2.radio);
        System.out.println("Su área es de " + circulo2.area());
        System.out.println("Su perímetro es de " + circulo2.perimetro());
    }
    
    
    public static void main(String[] args) {
        EjemploCirculo miEjemplo = new EjemploCirculo();
        miEjemplo.ejecutar();
    }
}
