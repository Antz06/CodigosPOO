from abc import ABCMeta

class JornadaLaboral(ABCMeta):
    #Método de clase
    @staticmethod
    def calcularSalarioNormal(salario,horasTrabajadas):
        total = salario * horasTrabajadas
        return total

class pruebaArchivos:

    def leerArchivo(self, archivo):
        file = open(archivo, 'r')
        lineas = []
        lineas_archivo = []
        for linea in file.readlines():
            lineas.append(linea.replace('\n','').split(",")) #nos permite hacer el arreglo multi o el recorrido
        file.close()

        for f in range(0, len(lineas)):
            try:
                lineas_archivo.append([float(lineas[f][0]), int (lineas[f][1])])
            except ValueError:
                lineas_archivo.append(([0,0]))
        return lineas_archivo

    def Empleado (self, lista):
        resultados = []
        for f in range (0, len(lista)):
            resultados.append(JornadaLaboral.calcularSalarioNormal(
                lista[f][0], lista[f][1]))
        return resultados

    def guardarResultados(self, entrada, resultados):
        file = open("salario.csv", 'w')
        file.write('salario,horasTrabajadas,total\n')
        for f in range(0, len(entrada)):
            linea = str(entrada[f][0]) + '\t \t' + \
                    str(entrada[f][1]) + '\t \t' + \
                    str(resultados[f]) + '\n'
            file.write(linea)
        file.close()

if __name__ == "__main__":
      prueba = pruebaArchivos()
      archivo = []
      archivo = prueba.leerArchivo("Datos.txt")
      resultado = prueba.Empleado(archivo)
      prueba.guardarResultados(archivo,resultado)
