from cuenta_ahorros import CuentaAhorros
        
class CuentaAhorrosRestringida(CuentaAhorros):
    """Esta clase representa una cuenta de ahorros restringida."""
    RETIROS_MAX = 3
            
    def __init__(self, nombre, nip, saldo = 0.0):
        """Mismo atributos que CuentaAhorros, pero con un contador
        para los retiros."""

                    
        
    def retirar(self, cantidad):
        """Restringe el número de retiros a RETIROS_MAX."""
           
           
    def restablecer_contador(self):
        """Restablece el contador de retiros."""
        
