package Archivos;

import java.io.*;
import java.util.ArrayList;

public class pruebaArchivos {
    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<JornadaLaboral> listaEntrada = new ArrayList<>();
    private final String rutaWindows = "D:\\TECNOLOGICO\\SEMESTRE 2\\POO\\JornadaLaboral\\Archivos\\Datos.txt";

    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<JornadaLaboral> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo(){
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i=0; i < this.contenidoArchivo.size();i++){
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split("#");
            try {
                int horasTrabajadas = Integer.parseInt(elementosLinea[0]);
                int horasExtras = Integer.parseInt(elementosLinea[1]);
                double salario = Double.parseDouble(elementosLinea[2]);
                listaEntrada.add(new JornadaLaboral(horasTrabajadas, horasExtras, salario));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                listaEntrada.add(new JornadaLaboral(0, 0, 0.0));
            }
        }
    }

    public void escribirArchivo(ArrayList<JornadaLaboral> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Horas trabajadas, horas extra, salario, total\n");
            for (int i=0; i < lista.size(); i++){
                wr.append(lista.get(i).getHorasTrabajadas() +
                        "\t \t" + lista.get(i).getHorasExtras() +
                        "\t \t" + lista.get(i).getSalario() +
                        "\t \t" + lista.get(i).getSalarioTotal() + "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main (String args[]){
        pruebaArchivos prueba = new pruebaArchivos();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getHorasTrabajadas() +
                    "\t" + prueba.getListaEntrada().get(i).getHorasExtras() +
                    "\t" + prueba.getListaEntrada().get(i).getSalario() + "\t" +
                    prueba.getListaEntrada().get(i).getSalarioTotal());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());

    }

}
