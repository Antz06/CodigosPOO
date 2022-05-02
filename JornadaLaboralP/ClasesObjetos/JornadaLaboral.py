class JornadaLaboral:
    """
Este es una clase pública en el lenguaje Python, en donde resolveremos un problema acerca del salario que recibe
un trabajador en una semana por medio de las horas que trabaja por semana.
    """
    #Atributos
    __horasTrabajadas = int(0)
    __horasExtras = int(0)
    __salario = float(0.0)
    __total = float(0.0)
    __totalHorasExtras = float(0.0)
    __salarioTotal = float(0.0)

    #Método constructor
    def __init__(self, horasTrabajadas, horasExtras, salario):
        self.__horasTrabajadas = horasTrabajadas
        self.__horasExtras = horasExtras
        self.__salario = salario
        self.calcularSalarioNormal()
        self.calcularCostoHorasExtras()
        self.calcularSalarioSemanal()

    def get_SalarioTotal(self):
        return self.__salarioTotal


    def calcularSalarioNormal(self):
        self.__total = self.__horasTrabajadas * self.__salario

    def calcularCostoHorasExtras(self):
        self.__totalHorasExtras = self.__horasExtras * (self.__salario * 1.5)

    def calcularSalarioSemanal(self):
        self.__salarioTotal = self.__total + self.__totalHorasExtras


