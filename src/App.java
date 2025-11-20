import java.util.Arrays;

import controller.BusquedaBinaria;
import controller.PersonaController;
import model.Persona;
import view.ShowConsole;

public class App {
    public static void main(String[] args) {

       
        int[] numeros = { 5, 4, 7, 3, 9, 11, 20 };
        Arrays.sort(numeros);

        Persona[] personas = {
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Pedro", 20),
                new Persona("Maria", 28),
                new Persona("Luis", 22),
                new Persona("Carmen", 37),
                new Persona("Sofia", 24)
        };

        Arrays.sort(personas, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));

        BusquedaBinaria bb = new BusquedaBinaria();
        PersonaController pc = new PersonaController();
        ShowConsole vista = new ShowConsole();

       
        int valorBuscado = 7;
        boolean encontrado = bb.buscadaNumero(numeros, valorBuscado);
        vista.showResult(encontrado, valorBuscado);

        
        String nombre = "Luis";
        Persona pEncontrada = pc.buscarPersonaBinaria(personas, nombre);
        vista.showPersonResult(pEncontrada, nombre);
    }
}
