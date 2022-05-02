from ClasesObjetos.JornadaLaboral import *
"""
Esta es una clase creada para importar la clase de JornadaLaboral
y posteroremente se establece un método main para crear una instancia que nos
permita crear parámetros y así al momento de ejecutarlo nos arroje un resultado, 
que en este caso será el salario que gana semanalmente un trabajador, poniendo 
como primer parámetro las horas trabajadas, en seguida las horas extras y finalmente
el pago que reciben por cada hora trabajada.
"""
def main():
    recibo = JornadaLaboral(40, 5, 110)
    print(recibo.get_SalarioTotal())

    print ("Clase y método abstracto")
if __name__ == "__main__":
    main()

