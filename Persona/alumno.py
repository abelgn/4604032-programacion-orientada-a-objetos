from persona import Persona

class Alumno(Persona):
    
    def __init__(self, nombre, apellido, matricula, plan):
        super().__init__(nombre, apellido)
        self.__matricula = matricula
        self.__plan = plan
        
        
    def __str__(self):
        return super().__str__() + ", " + str(self.__matricula) + ", " + str(self.__plan)
    
    
    def get_matricula(self):
        return self.__matricula
    
    
    def get_plan(self):
        return self.__plan
