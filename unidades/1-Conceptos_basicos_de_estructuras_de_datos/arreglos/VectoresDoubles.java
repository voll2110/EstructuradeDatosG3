package mx.edu.uttt.arreglos;
import javax.swing.JOptionPane;
public class VectoresDoubles {
    public static void main(String[] args) {
        int tamano = 0;
        tamano = obtenerTamano();
        double arr [] = new double[tamano];
        llenarArreglo(arr);
        imprimir(arr);
    }

public static  int obtenerTamano () {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));


}
public static void llenarArreglo ( double [] vector ){
    for (int i = 0; i < vector.length ; i++) {
        vector[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la posicion [ " + i + "]"));
    }
}
public static void imprimir(double vector[] ){
        String salida = "";
        for (double valor : vector){
            salida+= "| " + valor + " |";
        }
        JOptionPane.showMessageDialog(null, salida);
}
}
