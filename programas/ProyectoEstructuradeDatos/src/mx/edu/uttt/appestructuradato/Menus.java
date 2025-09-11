package mx.edu.uttt.appestructuradato;

public class Menus {

    public static String ObtenerMenuPrincipal(){
        String menu = "===== MENU PRINCIPAL =====" +
        "\n1)Arreglos" +
        "\n2)Recursividad"+
        "\n3)Listas enlazadas" +
        "\n4)Pilas y colas" +
        "\n5)Arboles Binarios" +
        "\n6)Salir" +
        "\nElegir Opcion: ";
        return menu;

    }
    public static String obtenerMenuAArreglos(){
        return " ===== MENU ARREGLOS =====" +
                "\n1)Vectores\n" +
                "2)Matrices\n" +
                "3)Regresar\n" +
                "Elegir Opcion: ";
    }
}
