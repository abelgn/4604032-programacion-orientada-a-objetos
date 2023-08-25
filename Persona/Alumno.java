public class Alumno extends Persona {

    private int matricula;
    private String plan;


    public Alumno(String nombre, String apellido, int matricula, String plan) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.plan = plan;
    }


    public int getMatricula() {
        return matricula;
    }
    
    
    public String getPlan() {
        return plan;
    }


    public String toString() {
        return (super.toString() + ", " + Integer.toString(matricula) + ", " + plan);
    }

}
