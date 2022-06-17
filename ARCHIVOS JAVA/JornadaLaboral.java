package Archivos;

public class JornadaLaboral {
    private int horasTrabajadas;
    private int horasExtras;
    private double salario;
    private double total;
    private double totalHorasExtras;
    private double salarioTotal;

    public JornadaLaboral(int horasTrabajadas, int horasExtras, double salario) {
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.salario = salario;
        this.calcularSalarioNormal();
        this.calcularCostoHorasExtras();
        this.calcularSalarioSemanal();
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalHorasExtras() {
        return totalHorasExtras;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public void setTotalHorasExtras(double totalHorasExtras) {
        this.totalHorasExtras = totalHorasExtras;
    }

    public void calcularSalarioNormal() {
        this.total = this.horasTrabajadas * this.salario;
    }

    public void calcularCostoHorasExtras() {
        this.totalHorasExtras += this.horasExtras * (this.salario * 1.5);
    }

    public void calcularSalarioSemanal() {
        this.salarioTotal = this.total + this.totalHorasExtras;
    }

    public static void main (String[] args){
        JornadaLaboral jornadaLaboral = new JornadaLaboral(40, 9, 130);
        System.out.println(jornadaLaboral.getSalarioTotal());

    }

}
