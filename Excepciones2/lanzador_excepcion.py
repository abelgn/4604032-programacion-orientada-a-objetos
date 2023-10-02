import sys

class LanzadorExcepcion:

    def __verificarElegibilidad(edad, peso):
        if (edad < 15 or peso < 50):
            raise ArithmeticError("La persona no puede usar el juego.")
        return (True)


    def main(edad, peso):
        elegible = False
        print("¡Bienvenido al servicio de registro!")
        try:
            elegible = LanzadorExcepcion.__verificarElegibilidad(edad, peso)
        except ArithmeticError as ex:
            print(ex);
        finally:
            if (elegible):
                print("El cliente cumple con los criterios.")


LanzadorExcepcion.main(int(sys.argv[1]), int(sys.argv[2]))
