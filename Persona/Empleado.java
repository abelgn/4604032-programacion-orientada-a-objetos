public class Empleado extends Persona {

    private int numEmpleado;
    private float salario;


    public Empleado(String nombre, String apellido, int numEmpleado, float salario) {
        super(nombre, apellido);
        this.numEmpleado = numEmpleado;
        this.salario = salario;
    }


    public int getNumEmpleado() {
        return numEmpleado;
    }
    
    
    public float getSalario() {
        return salario;
    }


    public String toString() {
        return (super.toString() + ", " + Integer.toString(numEmpleado) + ", " + Float.toString(salario));
    }

}
