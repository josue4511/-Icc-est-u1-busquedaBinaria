package controller;

import model.Persona;

public class PersonaController {

    public Persona buscarPersonaBinaria(Persona[] personas, String nombre) {
        int inicio = 0;
        int fin = personas.length - 1;

        while (inicio <= fin) {
            int mid = (inicio + fin) / 2;
            int comp = personas[mid].getNombre().compareToIgnoreCase(nombre);

            if (comp == 0) {
                return personas[mid];
            }
            if (comp < 0) {
                inicio = mid + 1;
            } else {
                fin = mid - 1;
            }
        }

        return null;
    }
}