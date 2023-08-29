from cuenta_ahorros import CuentaAhorros
       
class Banco():
    def __init__(self):
        self.__cuentas = {}


    def __str__(self) :
        """Regresa el banco represenado como un string."""
        banco = ''
        for cuenta in self.__cuentas.values():
            banco += str(cuenta) + '\n'
        return banco
        
        
    def crear_clave(self, nombre, nip):
        """Crear y regresa una clave de nombre y nip."""
        return nombre + '/' + nip
        
        
    def agregar_cuenta(self, cuenta):
        """Inserta una cuenta con nombre y nip como clave."""
        clave = self.crear_clave(cuenta.get_nombre(),
                                    cuenta.get_nip())
        self.__cuentas[clave] = cuenta
        
        
    def eliminar_cuenta(self, nombre, nip):
        """Elimina una cuenta con nombre y nip como clave."""
        clave = self.crear_clave(nombre, nip)
        return self.__cuentas.pop(clave, None)
                
                
    def obtener_cuenta(self, nombre, nip):
        """Regresa una cuenta con nombre y nip como clave o
        None si no existe."""
        clave = self.crear_clave(nombre, nip)
        return self.__cuentas.get(clave, None)
                
                
    def calcular_intereses(self):
        """Calcula los intereses para cada cuenta y regresa
        el total."""
        total = 0.0
        for account in self.__accounts.values():
            total += account.calcular_intereses()
        return total
