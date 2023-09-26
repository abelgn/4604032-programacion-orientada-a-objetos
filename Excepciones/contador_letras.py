class ContadorLetras():

    def __init__(self, palabra):
        cuenta = [0] * 26

        # convierte la palabra a mayusculas
        palabra = palabra.upper()
      
        # cuenta la frecuencia de cada letra en la palabra
        for i in range(len(palabra)):
            cuenta[ord(palabra[i]) - ord('A')] = cuenta[ord(palabra[i]) - ord('A')] + 1
      
        # muestra las frecuencias
        print()
        for i in range(len(cuenta)):
            if cuenta[i] != 0:
                print(chr(i + ord('A')) + ': ' + str(cuenta[i]))


def main():
    palabra = input('Ingresa una palabra (solo letras por favor): ')
    ContadorLetras(palabra)

main()
