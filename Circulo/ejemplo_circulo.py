from circulo import Circulo

def main():
    circulo1 = Circulo(3)
    circulo2 = Circulo(5)

    print("El círculo 1 tiene un radio de", circulo1.radio)
    print("Su área es de", circulo1.area())
    print("Su perímetro es de", circulo1.perimetro(), "\n")
    print("El círculo 2 tiene un radio de", circulo2.radio)
    print("Su área es de", circulo2.area())
    print("Su perímetro es de", circulo2.perimetro(), "\n")

main()
