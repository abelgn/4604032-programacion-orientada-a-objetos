import sys

def main():
    error = True
    
    while error:
        try:
            numero = float(input("Ingresa un número: "))
            raiz = float(numero ** 0.5)
            
        except TypeError as excepcion:
            print("Tipo de datos incorrecto:", excepcion)
            
        except ValueError as excepcion:
            print("Error en el valor:", excepcion)
            
        else:
            error = False
            
        finally:
            if error:
                print("Inténtalo de nuevo")
            
    print("La raíz cuadrada de %f es %f"
          % (numero, raiz))

main()
