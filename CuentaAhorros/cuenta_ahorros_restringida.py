from cuenta_ahorros import CuentaAhorros
        
class CuentaAhorrosRestringida(CuentaAhorros):
    """Esta clase representa una cuenta de ahorros restringida."""
    RETIROS_MAX = 3
            
    def __init__(self, nombre, nip, saldo = 0.0):
        """Mismo atributos que CuentaAhorros, pero con un contador
        para los retiros."""
        CuentaAhorros.__init__(self, nombre, nip, saldo)
        self.__contador = 0
        
        
    def retirar(self, cantidad):
        """Restringe el número de retiros a RETIROS_MAX."""
        if self.__contador == CuentaAhorrosRestringida.RETIROS_MAX:
            return "No tienes más retiros disponibles este mes"
        else:
            mensaje = super().retirar(cantidad)
            if mensaje == None:
                self.__contador += 1
            return mensaje
           
           
    def restablecer_contador(self):
        """Restablece el contador de retiros."""
        self.__contador = 0
