public class Punto {
    
    private float x;
    private float y;
    
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}