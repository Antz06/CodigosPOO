from abc import ABC

class JornadaLaboral(ABC):
    _salario = float(0.0)
    _horasTrabajadas = int (0)

#Constructor
    def __init__(self, salario, horasTrabajadas):
        self._salario = salario
        self._horasTrabajadas = horasTrabajadas

    @staticmethod
    def calcularSalario(self):
        pass

    @staticmethod
    def getsalarioTotal(self):
        return self._total

class Empleado(JornadaLaboral):
    __total = int(0)

    def __init__(self, salario, horasTrabajadas,):
        JornadaLaboral.__init__(self, salario, horasTrabajadas)
        self.calcularSalario()

    def calcularSalario(self):
        self.__total = self._horasTrabajadas * self._salario

    def getsalarioTotal(self):
        return self.__total

class EmpleadoHorasExtra(JornadaLaboral):
    __horasExtra = int(0)
    __totalHorasExtra = float(0.0)
    __salarioHorasExtra = float(0.0)

    def __init__(self, salario, horasTrabajadas, horasExtra):
        JornadaLaboral.__init__(self, salario, horasTrabajadas)
        self.__horasExtra = horasExtra
        self.calcularSalario()
        self.calcularCostoHorasExtra()
        self.calcularSalarioSemanal()

    def calcularSalario(self):
        self.__total = self._horasTrabajadas * self._salario

    def calcularCostoHorasExtra(self):
        self.__totalHorasExtra = self.__horasExtra * (self._salario * 1.5)

    def calcularSalarioSemanal(self):
        self.__salarioHorasExtra = self.__total + self.__totalHorasExtra

    def getsalarioHE(self):
        return self.__salarioHorasExtra
