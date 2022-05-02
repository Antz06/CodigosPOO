class JornadaLaboral:

    __horasTrabajadas = int(0)
    __horasExtras = int(0)
    __salario = float(0.0)
    __total = float(0.0)
    __totalHorasExtras = float(0.0)
    __salarioTotal = float(0.0)

#Sobrecarga de métodos
    def calcularSalario(self, horasTrabajadas = None, salario = None, horasExtras = None ):
        if horasTrabajadas is not None and salario is not None and horasExtras is None:
            self.__horasTrabajadas = horasTrabajadas
            self.__salario = salario
            self.calcularSalarioNormal()
        elif horasTrabajadas is not None and salario is not None and horasExtras is not None:
            self.__horasTrabajadas = horasTrabajadas
            self.__salario = salario
            self.__horasExtras = horasExtras
            self.calcularSalarioNormal()
            self.calcularCostoHorasExtras()
            self.calcularSalarioSemanal()

    def getsalarioTotal(self):
        return self.__salarioTotal

    def calcularSalarioNormal(self):
        self.__total = self.__horasTrabajadas * self.__salario

    def calcularCostoHorasExtras(self):
        self.__totalHorasExtras = self.__horasExtras * (self.__salario * 1.5)

    def calcularSalarioSemanal(self):
        self.__salarioTotal = self.__total + self.__totalHorasExtras


