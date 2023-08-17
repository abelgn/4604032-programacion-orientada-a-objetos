public class EjemploFiguras {
    
    public void ejecutar() {
        Circulo circulo = new Circulo(3);
        Rectangulo rectangulo = new Rectangulo(5, 7);
        Cuadrado cuadrado = new Cuadrado(6);

        System.out.println("El círculo tiene un radio de " + circulo.radio);
        System.out.println("Su área es de " + circulo.area());
        System.out.println("Su perímetro es de " + circulo.perimetro() + "\n");
        System.out.println("El rectángulo tiene base " + rectangulo.base + " y altura " + rectangulo.altura);
        System.out.println("Su área es de " + rectangulo.area());
        System.out.println("Su perímetro es de " + rectangulo.perimetro() + "\n");
        System.out.println("El cuadrado tiene lado " + cuadrado.lado);
        System.out.println("Su área es de " + cuadrado.area());
        System.out.println("Su perímetro es de " + cuadrado.perimetro() + "\n");
    }
        
    public static void main(String[] args) {
        EjemploFiguras miEjemplo = new EjemploFiguras();
        miEjemplo.ejecutar();
    }
}
