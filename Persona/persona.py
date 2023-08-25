class Persona:
    
    def __init__(self, nombre, apellido):
        self.__nombre = nombre
        self.__apellido = apellido
        
        
    def __str__(self):
        return self.__nombre + " " + self.__apellido
    
    
    def get_nombre(self):
        return self.__nombre
    
    
    def get_apellido(self):
        return self.__apellido