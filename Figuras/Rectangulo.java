public class Rectangulo {
    
    float base;
    float altura;

    public Rectangulo(float b, float h) {
        base = b;
        altura = h;
    }
    
    public double area() {
        return (base * altura);
    }
    
    public double perimetro() {
        return (2 * (base + altura));
    }

}
