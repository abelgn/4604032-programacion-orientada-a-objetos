class Rectangulo:

    def __init__(self, b, h):
        self.base = b
        self.altura = h
    
    def area(self):
        return self.base * self.altura
    
    def perimetro(self):
        return 2 * (self.base + self.altura)
