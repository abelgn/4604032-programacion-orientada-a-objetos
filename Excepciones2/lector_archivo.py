import sys


class NombreArchivoIncorrectoError(Exception):
    
    def __init__(self, mensaje_error):
        super().__init__(self, mensaje_error)


class ExtensionArchivoIncorrectaError(Exception):

    def __init__(self, mensaje_error):
        super().__init__(self, mensaje_error)


class LectorArchivo:


    def __contiene_extension(nombre_archivo):
        if (".txt" in nombre_archivo or  ".doc" in nombre_archivo):
            return (True)
        return (False)


    def __es_correcto_nombre_archivo(nombre_archivo):
        if (nombre_archivo == "nombreArchivoErroneo.txt"):
            return (False)
        else:
            return (True)


    def primera_linea(nombre_archivo):
        try:
            archivo = open(nombre_archivo, "r")
            linea = archivo.readline()
            if (linea != ''):
                return linea
            else:
                raise EOFError("El archivo no se puede leer: " + nombre_archivo);
        except FileNotFoundError as err:
            if (not LectorArchivo.__es_correcto_nombre_archivo(nombre_archivo)):
                raise NombreArchivoIncorrectoError("Nombre de archivo incorrecto: " + nombre_archivo)
            else:
                raise err

        except EOFError as err:
            if (not LectorArchivo.__contiene_extension(nombre_archivo)):
                raise ExtensionArchivoIncorrectaError("Extensión de archivo incorrecta: " + nombre_archivo)
            else:
                raise err


linea = LectorArchivo.primera_linea(sys.argv[1])
print (linea)
