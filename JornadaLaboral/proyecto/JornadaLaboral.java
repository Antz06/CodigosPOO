package proyecto;
/*
Se crea la clase pública con el especificador de acceso public, se abre la llave y se declaran
los atributos con los que se va a trabajar.
 */
public class JornadaLaboral {
        private int horasTrabajadas;
        private int horasExtras;
        private double salario;
        private double total;
        private double totalHorasExtras;
        private double salarioTotal;

        /*
        Esta clase calcula el salario que debe recibir un empleado después de una jornada laboral,
        por lo que se emplea un método constructor en donde establezcamos los parámetros o argumentos
        además de los métodos que se mandan llamar y con los que se va a trabajar, esto para ahorrar
        líneas de código.
        */
        public JornadaLaboral(int horasTrabajadas, int horasExtras, double salario) {
                this.horasTrabajadas = horasTrabajadas;
                this.horasExtras = horasExtras;
                this.salario = salario;
                this.calcularCostoHorasExtras();
                this.calcularSalarioNormal();
                this.calcularSalarioSemanal();
        }

        public double getSalarioTotal() {
                return salarioTotal;
        }

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
}

/*
Los public void son los métodos que se utilizan para calcular el salario total, valor
que se retorna en el método get, ya que ahí se almacenará el resultado cuando se ejecute el
después de que se declaren los parámetros.
 */
