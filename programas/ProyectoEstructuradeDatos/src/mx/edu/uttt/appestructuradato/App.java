package mx.edu.uttt.appestructuradato;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar(){

        String opcion = "";
        boolean sentinel = true;

        do {
            opcion = JOptionPane.showInputDialog(Menus.ObtenerMenuPrincipal());

            switch (opcion){
                case "1":
                    arreglos();
                    break;
                case "2":
                    JOptionPane.showInternalMessageDialog(null, "Opcion 2");
                    break;
                case "3":
                    JOptionPane.showInternalMessageDialog(null, "Opcion 3");
                    break;
                case "4":
                    JOptionPane.showInternalMessageDialog(null, "Opcion 4");
                    break;
                case "5":
                    JOptionPane.showInternalMessageDialog(null, "Opcion 5");
                    break;
                case "6":
                    JOptionPane.showInternalMessageDialog(null, "I´LL BE BACK");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showInternalMessageDialog(null, "Opcion no valida");
            }
        }while (sentinel);
    }
    public static void arreglos(){
        String opcion = "";
        boolean sentinel = true;
        do {
            opcion = JOptionPane.showInputDialog(Menus.obtenerMenuAArreglos());

            switch (opcion){
                case "1":
                    JOptionPane.showMessageDialog(null, "Vectores");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Matrices");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar los arreglos");
                    sentinel=false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion No valida");

            }
        }while (sentinel);
    }
}
