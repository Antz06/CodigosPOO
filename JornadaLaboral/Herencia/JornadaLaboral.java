package Herencia;

public class JornadaLaboral {
    protected double salario;
    protected double horasTrabajadas;

    public JornadaLaboral(double salario, double horasTrabajadas){
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularSalario(){}

    public double getSalarioTotal(){
        return salario;
    }

}
