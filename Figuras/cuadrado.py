class Cuadrado:

    def __init__(self, l):
        self.lado = l
    
    def area(self):
        return self.lado * self.lado
    
    def perimetro(self):
        return 4 * self.lado
