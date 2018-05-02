import java.util.ArrayList;

/**
 * La clase Muro contiene informacion relacionada con todos los 
 * tipos de entrada que existen.
 * @author Javier de Cea Dominguez.
 * @version 2018.04.14
 */
public class Muro {
    private ArrayList<Entrada> entradas;
    
    /**
     * Constructor para objetos de la clase Muro.
     */
    public Muro() {
        entradas = new ArrayList<>();
    }
    
    /**
     * Añade una entrada al muro.
     * @param entradaTexto La entrada que va a ser añadida 
     * al muro.
     */
    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }
    
    /**
     * Devuelve las caracteristicas de las entradas que existen en el muro.
     * @return Devuelve un String con las caracteristicas de las entradas 
     * que existen en el muro.
     */
    @Override
    public String toString() {
        String textoADevolver = "";
        
        if (entradas.size() > 0) {
            for(Entrada entrada : entradas) {
                textoADevolver += entrada;
            }
        }
        else {
            textoADevolver = "No hay datos de entradas de ningun tipo de entrada aun.";
        }
        return textoADevolver;
    }
    
    /**
     * Muestra por pantalla las caracteristicas de las entradas que 
     * existen en el muro.
     */
    public void mostrarCaracteristicas() {
        if (entradas.size() > 0) {
            System.out.println("Entradas existentes en el muro:");
            for(Entrada entrada : entradas) {
                System.out.println(entrada);
            }
        }
        else {
            System.out.println("No hay datos de ningun tipo de entrada aun.");
        }
    }
}