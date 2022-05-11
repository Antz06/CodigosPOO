from HerenciaJornadaLaboral import*

def main ():

        print("Salario Total")
        recibo2 = Empleado(125, 38)
        print(recibo2.getsalarioTotal())

        print("Salario Horas Extra")
        recibo = EmpleadoHorasExtra(125, 40, 8)
        print(recibo.getsalarioHE())

if __name__ == "__main__":
    main()

