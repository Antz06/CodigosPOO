package Métodos;

public class Main {
    public static void main (String[] args) {
        System.out.println ("Método constructor");
        JornadaLaboral total = new JornadaLaboral(28, 150);
        System.out.println(total.getTotal());

        System.out.println("Sobrecarga");
        JornadaLaboral jornadaLaboral = new JornadaLaboral(40, 9, 130);
        System.out.println(jornadaLaboral.getSalarioTotal());

        System.out.println("Método de clase");
        System.out.println(JornadaLaboral.calcularSalarioNormal(38, 100));
        System.out.println("Método de instancia");
        jornadaLaboral.calcularCostoHorasExtras();

    }
    public void JornadaLaboral (String jornadaLaboral){
        System.out.println(jornadaLaboral);
    }
}

