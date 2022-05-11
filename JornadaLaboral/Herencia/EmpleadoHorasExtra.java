package Herencia;

public class EmpleadoHorasExtra extends JornadaLaboral {
    private int horasExtra;
    private double totalHorasExtra;
    private double salarioHorasExtra;
    private double total;

    public EmpleadoHorasExtra(double salario, double horasTrabajadas, int horasExtra) {
        super(salario, horasTrabajadas);
        this.horasExtra = horasExtra;
        this.calcularSalario();
        this.calcularCostoHorasExtra();
        this.calcularSalarioSemanal();
    }

    public void calcularSalario() {
        this.total = this.horasTrabajadas * this.salario;
    }
    public void calcularCostoHorasExtra(){
        this.totalHorasExtra = this.horasExtra * (this.salario * 1.5);
    }
    public void calcularSalarioSemanal() {

        this.salarioHorasExtra = this.total + this.totalHorasExtra;
    }

    public double getSalarioHE() {
        return salarioHorasExtra;
    }
}
