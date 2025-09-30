package mx.edu.uttt.arreglos;

import javax.swing.*;

public class OprecacionesArreglos {
    private double[] vector;
    private final int TAMANIO = 5;

    public OprecacionesArreglos() {
        this.vector = new double[TAMANIO];
    }

    public OprecacionesArreglos(int tamanio) {
        this.vector = new double[tamanio];
    }

    public OprecacionesArreglos(double[] vector) {
        this.vector = new double[vector.length];
        this.llenarArreglo(vector);
    }

    public void llenarArreglo(double[] vector) {
        int i = 0;
        while (i < this.vector.length) {
            this.vector[i] = vector[i];
            i++;
            /**
             * int i = 0;
             * do{
             * this.vector[i] = Double.parseDouble(JOP.ShowInput(Introduce el Valor");
             * i++
             * }while(i<this.vector.lenght);
             */
        }
    }

    public void llenarArreglo() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Double.parseDouble(JOptionPane.showInputDialog
                    ("Introduce el valor de la posicion [ " + i + "]"));
        }
    }

    public double sumarValores() {
        double suma = 0.0;
        for (int i = 0; i < this.vector.length; i++) {
            suma += this.vector[i];
        }
        return suma;

    }

    public double obtenerValorMaximo() {
        double maximo = this.vector[0];
        for (double v : this.vector) {
            if (v > maximo) {
                maximo = v;
            }
        }
        return maximo;
        /**double maximo = 0.0;
         * int i = 0;
         * while(i<this.vector.lenght){
         * if(maximo<this.vector[i])
         * maximo = this.vector[i];
         * i++;
         * }
         * return maximo;
         */
    }

    public double ObtenerValorMinimo() {
        double minimo = this.vector[0];
        for (double valor : this.vector) {
            if (valor < minimo) {
                minimo = valor;
            }
        }
            return minimo;

    }
        public boolean compararArreglos ( double[] vector){
            if (this.vector.length != vector.length){
                return false;
            }
            for (int i = 0; i < vector.length; i++) {
                if (this.vector[i] != vector[i]){
                    return false;
                }
            }
            return true;
            }

    /**boolean isEquals = true;
     * if(vector.length != this.vector.length){
     *    isEqulas = false;
     * }else{
     *     for (int i = 0; i < this.vector.length && isEqulas ; i++){
     *         if(this.vector[i] != vector[i])
     *         isEqulas = false;
     *     }
     * }
     *
     */


    public void cambiarTamanio(int tamanio) {
        double[] nuevo = new double[tamanio];
        for (int i = 0; i < this.vector.length; i++) {
            nuevo[i] = this.vector[i];
        }
        this.vector = nuevo;
        nuevo = null;
    }

        public String buscarValor ( double valor){
        String salida = "";
        boolean seentinel = false;
        for (int i = 0; i < this.vector.length; i++) {
                if (valor ==this.vector[i] ) {
                    seentinel = true;
                    salida = "El valor " + valor + " esta la posicion " + i;
              break;
                }
            }
            if(!seentinel)
                salida ="El valorno se encontro en el arreglo";
            return salida;

        }


        public void imprimir() {
            String salida = "";
            for (double valor : vector) {
                salida += "|" + valor + "|";
            }
            JOptionPane.showMessageDialog(null, salida);
        }

}


