from math import pi

class Circulo:

    def __init__(self, r):
        self.radio = r
    
    def area(self):
        return self.radio ** 2 * pi
    
    def perimetro(self):
        return 2 * self.radio * pi
