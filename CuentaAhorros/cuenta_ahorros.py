class CuentaAhorros():
    """Esta clase representa una cuenta de ahorros
    con el nombre del cliente, NIP y saldo."""
    
    # Mismo interés para todas las cuentas
    INTERES = 0.02


    def __init__(self, nombre, nip, saldo = 0.0):
        self.__nombre = nombre
        self.__nip = nip
        self.__saldo = saldo


    def __str__(self) :
        """Regresa la cuenta representada como un string."""
        cuenta = 'Nombre: ' + self.__nombre + '\n'
        cuenta += 'NIP:     ' + self.__nip + '\n'
        cuenta += 'Saldo:   ' + str(self.__saldo)
        return cuenta
    

    def get_saldo(self):
        """Regresa el saldo actual."""
        return self.__saldo
        
        
    def get_nombre(self):
        """Regresa el nombre del cliente."""
        return self.__nombre
        
        
    def get_nip(self):
        """Regresa el NIP."""
        return self.__nip
        
        
    def depositar(self, cantidad):
        """Deposita la cantidad especificada y regresa None."""
        self.__saldo += cantidad
        return None
        
        
    def retirar(self, cantidad):
        """Retira la cantidad especificada.
        Regresa None si el retiro fue exitoso o un mensaje
        de error en caso de que no."""
        if cantidad < 0:
            return "La cantidad debe ser mayor que 0.0"
        elif self.__saldo < cantidad:
            return "Fondos insuficientes"
        else:
            self.__saldo -= cantidad
            return None
        
            
    def calcular_intereses(self):
        """Calcula, deposita y regresa los intereses."""
        intereses = self.__saldo * CuentaAhorros.INTERES
        self.depositar(intereses)
        return intereses
