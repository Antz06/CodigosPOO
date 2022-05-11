package Herencia;

public class Empleado extends JornadaLaboral{
    private double total;

    public Empleado(double salario, double horasTrabajadas) {
        super(salario, horasTrabajadas);
        this.calcularSalario();
    }
    public void calcularSalario() {
        this.total = this.horasTrabajadas * this.salario;
    }
    public double getsalarioTotal(){
        return total;
    }

}
