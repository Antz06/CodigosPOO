from Métodos.sobrecarga import *
recibo = JornadaLaboral(40, 5, 110)
print("Método constructor")
print(recibo.get_SalarioTotal())

print("Método de clase")
print(JornadaLaboral.calcularSalario(29, 180))
if __name__ == "__main__":
    recibo = JornadaLaboral()
    recibo.calcularSalario(40,145,8)
    print(recibo.getsalarioTotal())