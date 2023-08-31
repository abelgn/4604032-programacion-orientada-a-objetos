/**
 * Esta es una interfaz que deben implementar todas las clases de 
 * figuras geométricas planas.
 */
public interface IFigura {

    /**
     * Esta constante establece como NEGRO el
     * <code>Color</code> predefinido para todas las clases que 
     * implementen esta interfaz.
     */
    public static final Color COLOR_PREDEFINIDO = Color.NEGRO;
    
    /**
     * Esta constante establece como (0,0) el origen predefinido 
     * para todas las clases que implementen esta interfaz.
     */
    public static final Punto ORIGEN_PREDEFINIDO = new Punto(0,0);

    /**
     * Cambia el <code>Color</code> de la <code>IFigura</code> a 
     * <code>nuevoColor</code>.
     * 
     * @param nuevoColor el nuevo <code>Color</code> de la 
     * <code>IFigura</code>.
     * @return <code>true</code> si el cambio de color fue 
     * exitoso, 
     * <code>false</code> en caso contrario.
     */
    public boolean setColor(Color nuevoColor);
    
    /**
     * Mueve el origen de la <code>IFigura</code> al punto referenciado por
     * <code>nuevoOrigen</code>.
     *
     * @param nuevoOrigen punto de referencia para establecer el origen.
     */
    public void setOrigen(Punto nuevoOrigen);

    /**
     * Mueve el origen de la <code>IFigura</code> a las coordenadas 
     * (<code>nuevaX</code>, <code>nuevaY</code>).
     *
     * @param nuevaX coordenada X del nuevo origen de la <code>IFigura</code>.
     * @param nuevaY coordenada Y del nuevo origen de la <code>IFigura</code>.
     */
    public void setOrigen(float nuevaX, float nuevaY);

    /**
     * Devuelve el <code>Color</code> de la <code>IFigura</code>.
     *
     * @return el <code>Color</code> de la <code>IFigura</code>.
     */
    public Color getColor();

    /**
     * Devuelve el origen de la <code>IFigura</code>.
     *
     * @return un objeto Punto que contiene el origen de la <code>Figura</code>.
     */
    public Punto getOrigen();

    /**
     * Cambia el tamaño de esta <code>IFigura</code> por el 
     * <code>factor</code> indicado.
     *
     * @param factor del nuevo tamaño de esta <code>IFigura</code>.
     */
    public void cambiarTamano(float factor);
}
