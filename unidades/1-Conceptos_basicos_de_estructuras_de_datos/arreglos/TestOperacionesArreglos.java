package mx.edu.uttt.arreglos;

import javax.swing.*;
import java.lang.management.OperatingSystemMXBean;

public class TestOperacionesArreglos {
    public static void main(String[] args) {
    /**    OprecacionesArreglos op1 = new OprecacionesArreglos();
        OprecacionesArreglos op2 = new OprecacionesArreglos(6);
        double vector [] = {1.2,4.5,7.8};
        OprecacionesArreglos op3 = new OprecacionesArreglos(vector);
        double vector1 [] = {1.2,4.5,7.8};
     OprecacionesArreglos op4 = new OprecacionesArreglos(vector1);
     **/
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo:"));
        OprecacionesArreglos op = new OprecacionesArreglos(tam);
        int opcion;
do {
opcion =Integer.parseInt( JOptionPane.showInputDialog(
        "===== MENÚ ARREGLOS =====\n" +
                "1. Llenar arreglo\n" +
                "2. Imprimir arreglo\n" +
                "3. Sumar valores\n" +
                "4. Valor máximo\n" +
                "5. Valor mínimo\n" +
                "6. Buscar valor\n" +
                "7. Cambiar tamaño\n" +
                "8. Comparar con otro arreglo\n" +
                "9. Salir\n\n" +
                "Elige una opción:"));
switch (opcion){
    case 1:
        op.llenarArreglo();
        break;
    case 2:
        op.imprimir();
        break;
    case 3:
        JOptionPane.showMessageDialog(null,"La suma de valores es:" +op.sumarValores());
        break;
    case 4:
        JOptionPane.showMessageDialog(null,"Valor máximo: " + op.obtenerValorMaximo());
        break;
    case 5:
        JOptionPane.showMessageDialog(null,"Valor mínimo: " + op.ObtenerValorMinimo());
        break;
    case 6:
        double buscarValor= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor a buscar:"));
        JOptionPane.showMessageDialog(null, op.buscarValor(buscarValor));
        break;
    case 7:
        int nuevoTam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo tamaño:"));
        op.cambiarTamanio(nuevoTam);
        break;
    case 8:
        JOptionPane.showMessageDialog(null, "No disponible");
        break;
    case 9:
        JOptionPane.showMessageDialog(null, "Saliendo del programa");
        break;

    default:
        JOptionPane.showMessageDialog(null, "Opcion no encontrada");
}
}while (opcion != 9);


    }
}
