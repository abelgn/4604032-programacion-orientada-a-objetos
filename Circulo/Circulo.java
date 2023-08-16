public class Circulo {
    
    float radio;

    public Circulo(float r) {
        radio = r;
    }
    
    public double area() {
        return (Math.PI * radio * radio);
    }
    
    public double perimetro() {
        return (2 * Math.PI * radio);
    }

}
