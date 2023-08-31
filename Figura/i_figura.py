from color import Color
from punto import Punto

class IFigura:
    """
    Esta es una interfaz que deben implementar todas las clases de
    figuras geométricas planas.
    """

    # Esta constante establece como NEGRO el color predefinido
    # para todos los objetos de las clases que implementen esta
    # interfaz.
    COLOR_PREDEFINIDO = Color.NEGRO
    
    # Esta constante establece como (0,0) el origen predefinido
    # para todas los objetos de las clases que implementen esta
    # interfaz.
    ORIGEN_PREDEFINIDO = Punto(0,0)

    def set_color(self, nuevo_color):
        """
        Cambia el Color de la IFigura a nuevo_color.

        Regresa true si el cambio de color fue exitoso,
        false en caso contrario.
        """
        pass
    
    
    def set_origen(self, nuevo_origen):
        """
        Mueve el origen de la IFigura al punto referenciado
        por nuevo_origen.
        """
        pass


    def set_origen(self, nueva_x, nueva_y):
        """
        Mueve el origen de la IFigura a las coordenadas
        (nueva_x, nueva_y).
        """
        pass
        
    def get_color(self):
        """Devuelve el Color de la IFigura."""
        pass

    def get_origen(self):
        """Devuelve el origen de la IFigura."""

    def cambiar_tamano(self, factor):
        """Cambia el tamaño de la IFigura por el factor indicado."""
        pass
