import circulo
import rectangulo
import cuadrado

def main():
    circ = circulo.Circulo(5)
    rect = rectangulo.Rectangulo(5, 7)
    cuad = cuadrado.Cuadrado(6)

    print("El círculo tiene un radio de", circ.radio)
    print("Su área es de", circ.area())
    print("Su perímetro es de", circ.perimetro(), "\n")
    print("El rectangulo tiene base", rect.base, "y altura", rect.altura)
    print("Su área es de", rect.area())
    print("Su perímetro es de", rect.perimetro(), "\n")
    print("El cuadrado tiene lado", cuad.lado)
    print("Su área es de", cuad.area())
    print("Su perímetro es de", cuad.perimetro(), "\n")

main()
