import sys

def main(val):
    error = True
    
    try:
        numero = float(val)
        print("La raíz cuadrada de %f es %f"
            % (numero, numero ** 0.5))
    except TypeError as excepcion:
        print("Tipo de datos incorrecto:", excepcion)
    except ValueError as excepcion:
        print("Error en el valor:", excepcion)
    else:
        print("Sin errores")
        error = False
    finally:
        if not error:
            print("Bien hecho")
        else:
            print("Inténtalo de nuevo")

main(sys.argv[1])
