class JornadaLaboral:
    """
    Esta clase se define como abstracta ya que solamente se establecerán los métodos para calcular
    el salario de un trabajador, cuyo método es el estático y en el cual se almacenarán los métodos
    pero con la diferencia de que no existirán parámetros debido a que en las clases abstractas no
    podemos crear instancias, así como se muestra en el método estático y solo retorna en el salario
    total.
    """
    #Método estático
    @staticmethod
    def calcularSalario (horasTrabajadas, horasExtras, salario):
        salarioTotal = horasTrabajadas * salario
        totalHorasExtras = horasExtras *(salario*1.5)
        salarioTotal += totalHorasExtras
        return  salarioTotal

