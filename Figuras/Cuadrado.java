public class Cuadrado {
    
    float lado;

    public Cuadrado(float l) {
        lado = l;
    }
    
    public double area() {
        return (lado * lado);
    }
    
    public double perimetro() {
        return (4 * lado);
    }

}
