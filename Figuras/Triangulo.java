public class Triangulo {
    
    float base;
    float altura;

    public Triangulo(float b, float h) {
        base = b;
        altura = h
    }
    
    public double area() {
        return (base * altura / 2.0);
    }
    
    public double perimetro() {
        return (2 * (base + altura));
    }

}
