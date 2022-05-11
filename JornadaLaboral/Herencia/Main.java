package Herencia;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salario total");
        Empleado recibo1 = new Empleado(125,38);
        System.out.println(recibo1.getsalarioTotal());

        System.out.println("Salario Horas Extra");
        EmpleadoHorasExtra recibo2 = new EmpleadoHorasExtra(125,40,9);
        System.out.println(recibo2.getSalarioHE());
    }
}
