package proyecto;

public class JornadaLaboralAbs {
/*
Para las clases abstractas, se definen ls métodos como se muestra a continuación, en este caso
se muestran dos métodos, en el primero se calcula el salario de un trabajador sin contar horas
extras, mientras que en el segundo si se utilizan. Al final se calcula el salario total y se
retorna el valor en ese atributo.
 */
    public static double calcularSalario(int horasTrabajadas, double salario) {
        double salarioTotal = horasTrabajadas * salario;
        return salarioTotal;
    }
    public static double calcularSalarioHrsExtras(int horasTrabajadas, double salario, int horasExtras){
        double salarioTotal = horasTrabajadas * salario;
        double totalHorasExtras = horasExtras *(salario*1.5);
        salarioTotal += totalHorasExtras;
        return salarioTotal;
    }

}

