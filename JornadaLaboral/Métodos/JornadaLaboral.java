package Métodos;

public class JornadaLaboral {
    private int horasTrabajadas;
    private int horasExtras;
    private double salario;
    private double total;
    private double totalHorasExtras;
    private double salarioTotal;

    //MétodoConstructor
    public JornadaLaboral (int horasTrabajadas, int salario){
        this.horasTrabajadas = horasTrabajadas;
        this.salario = salario;
        this.calcularSalarioNormal();
    }
    //Constructor 2
    //Sobrecarga
    public JornadaLaboral(int horasTrabajadas, int horasExtras, double salario) {
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.salario = salario;
        this.calcularCostoHorasExtras();
        this.calcularSalarioNormal();
        this.calcularSalarioSemanal();
    }

    //get
    public double getTotal() { return total; }

    public double getSalarioTotal() {
        return salarioTotal;
    }


    //Método de instancia

    public void calcularSalarioNormal() {
        this.total = this.horasTrabajadas * this.salario;
    }

    public void calcularCostoHorasExtras() {
        this.horasExtras = horasExtras;
        this.salario = salario;
        this.totalHorasExtras += this.horasExtras * (this.salario * 1.5);
    }

    public void calcularSalarioSemanal() {
        this.salarioTotal = this.total + this.totalHorasExtras;
    }


    //Método de clase
    public static double calcularSalarioNormal(double horasTrabajadas, double salario) {
        double total = horasTrabajadas * salario;
        return total;
    }
}