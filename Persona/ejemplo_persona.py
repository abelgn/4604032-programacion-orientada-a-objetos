import persona, empleado, alumno

def main():
    e = empleado.Empleado("Pedro", "Gómez", 54321, 12345)
    print("Empleado:", e)
    a = alumno.Alumno("Pedro", "Gómez", 21234334, "LIC")
    print("Alumno:", a)
    
    if isinstance(e, empleado.Empleado):
        print (e, ", es una instancia de Empleado")
    if isinstance(e, persona.Persona):
        print (e, ", es una instancia de Persona")
    if not isinstance(e, alumno.Alumno):
        print (e, ", no es una instancia de Alumno")
    
    
main()