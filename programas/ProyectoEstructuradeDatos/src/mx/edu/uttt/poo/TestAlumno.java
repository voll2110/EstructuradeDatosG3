package mx.edu.uttt.poo;

import javax.swing.*;

public class TestAlumno {
    public static void main(String[] args) {
        //Crear Una Instancia de la clase Alumno
        char sexo = '\0';
        boolean activo = false;
        Alumno a1 = new Alumno();
        a1.setNombre ( (JOptionPane.showInputDialog("Introduce tu nombre:")));
        a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:")));
        sexo = JOptionPane.showInputDialog("Introduce el sexo:").charAt(0);
        a1.setSexo(sexo);
        String valor = JOptionPane.showInputDialog("Estas activo Si/No");
        activo = valor.equalsIgnoreCase("si")? true:false;
        a1.setActivo(activo);
        a1.setPromedio(Double.parseDouble(JOptionPane.showInputDialog("Introduce tu promedio:")));




        String salida = "Resultados\n" +
                "\nNombre: " + a1.getNombre() +
                "\nEdad: " + a1.getEdad() +
                "\nSexo: " + a1.getSexo()+
                "\nActivo: " + a1.getActivo()+
                "\nPromedio: " + a1.getPromedio();

        System.out.println(a1.toString());


    }

}
