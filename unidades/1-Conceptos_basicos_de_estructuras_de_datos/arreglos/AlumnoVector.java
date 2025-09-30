package mx.edu.uttt.arreglos;

import mx.edu.uttt.poo.Alumno;

import javax.swing.*;
import java.time.chrono.JapaneseChronology;

public class AlumnoVector {
    public static void main(String[] args) {
        int tamano = 0;
        tamano = obtenerTamano();
        Alumno alumnos []= new Alumno[tamano];
        tamano = obtenerTamano();

    }
    public static int obtenerTamano (){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de alumnos a registrar"));
    }
    public static String menu (){
        return "===== MENU PRINCIPAL =====\n" +
                "1) Llenar Arreglo\n" +
                "2) Imprimir Arreglo\n" +
                "3) Salir\n" +
                "Elegir Opcion";
    }
    public static void operaciones (Alumno [] alumnos){

            String opcion = "";
            boolean sentinel = true;

            do {


            opcion = JOptionPane.showInputDialog(menu());
            switch (opcion){
            case "1" :
                //llenar arreglo
                break;
            case "2":
                //imprimir arreglo

                break;
            case "3":
                //salir
                JOptionPane.showMessageDialog(null, "BYE");
                sentinel = false;
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Obcion ni valida");

        }
            }while (sentinel);
    }
    public static void llenarArreglo (Alumno[] alumnos){
        int i = 0;
        boolean activo = true;
        while (i<alumnos.length){
            Alumno alumno= new Alumno();
            alumno.setNombre(JOptionPane.showInputDialog("Introduce el nombre del Alumno [ " + i + " ]"));
            alumno.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del Alumno [ " + i + " ]")));
            alumno.setSexo(JOptionPane.showInputDialog("Introduce el nombre del Alumno [ " + i + " ]").charAt(0));
            activo =JOptionPane.showInputDialog("Introduce el estatus del Alumno [ " + i + " ] Activo/Inactivo").equalsIgnoreCase("Activo")?true:false;
            alumno.setActivo(activo);
            alumno.setPromedio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el promedio del alumno [ " + i +" ]")));
            i++;
        }
    }
}
