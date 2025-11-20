package controller;

public class BusquedaBinaria {

    public boolean buscadaNumero(int[] numeros, int valor) {
        int inicio = 0;
        int fin = numeros.length - 1;

        while (inicio <= fin) {
            int mid = (inicio + fin) / 2;

            if (numeros[mid] == valor) {
                return true;
            } else if (numeros[mid] < valor) {
                inicio = mid + 1;
            } else {
                fin = mid - 1;
            }
        }

        return false;
    }

}