class JornadaLaboral:

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

    #Método destructor
    def __del__(self):
        self.calcularSalarioNormal()
        self.calcularCostoHorasExtras()
        self.calcularSalarioSemanal()

    #Método de instancia
    def calcularSalarioNormal(self):
        self.__total = self.__horasTrabajadas * self.__salario

    def calcularCostoHorasExtras(self):
        self.__totalHorasExtras = self.__horasExtras * (self.__salario * 1.5)

    def calcularSalarioSemanal(self):
        self.__salarioTotal = self.__total + self.__totalHorasExtras

    #Método de clase
    @classmethod
    def calcularSalario (cls, horasTrabajadas, salario):
        return horasTrabajadas*salario

    #Método de instancia
    def calcularSalarioNormal(self):
        self.__total = self.__horasTrabajadas * self.__salario
    def get_salarioNormal(self):
        return self.__total

