package proyecto;

import proyecto.JornadaLaboral;

/*
Se creó esta clase con el fin de realizar la importación de la clase JornadaLaboral para realizar
las pruebas necesarias de que el programa se ejecute correctamente, para ello, creamos una clase
main en donde mandaremos llamar a la clase y crearemos una instancia para posteriormente asignar
valores y así ejecutar el código.
 */
public class Main {
    public static void main (String[] args) {
        JornadaLaboral jornadaLaboral = new JornadaLaboral(40, 8, 100 );
        System.out.println(jornadaLaboral.getSalarioTotal());
    }
}


