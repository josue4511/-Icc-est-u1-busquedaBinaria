package view;
import model.Persona;

public class ShowConsole {

    public void showResult(boolean resultado, int valorBuscado) {
        if (resultado) {
            System.out.println("El número " + valorBuscado + " SÍ fue encontrado.");
        } else {
            System.out.println("El número " + valorBuscado + " NO fue encontrado.");
        }
    }

    public void showPersonResult(Persona persona, String nombreBuscado) {
        if (persona != null) {
            System.out.println("Persona encontrada: " 
                + persona.getNombre() 
                + ", Edad: " + persona.getEdad());
        } else {
            System.out.println("La persona con nombre '" + nombreBuscado + "' no existe.");
        }
    }
}
