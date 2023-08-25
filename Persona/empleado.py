from persona import Persona

class Empleado(Persona):
    
    def __init__(self, nombre, apellido, num_empleado, salario):
        super().__init__(nombre, apellido)
        self.__num_empleado = num_empleado
        self.__salario = salario
        
        
    def __str__(self):
        return super().__str__() + ", " + str(self.__num_empleado) + ", " + str(self.__salario)
    
    
    def get_num_empleado(self):
        return self.__num_empleado
    
    
    def get_salario(self):
        return self.__salario
