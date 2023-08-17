from circulo import Circulo

def main():
    c1 = Circulo(3)
    c2 = Circulo(5)

    print("El círculo 1 tiene un radio de", c1.radio)
    print("Su área es de", c1.area())
    print("Su perímetro es de", c1.perimetro(), "\n")
    print("El círculo 2 tiene un radio de", c2.radio)
    print("Su área es de", c2.area())
    print("Su perímetro es de", c2.perimetro(), "\n")

main()
