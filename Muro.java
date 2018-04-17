import java.util.ArrayList;

/**
 * La clase Muro contiene todas las entradas de texto y todas las 
 * entradas de foto.
 * @author Javier de Cea Dominguez.
 * @version 2018.04.14
 */
public class Muro {
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    
    /**
     * Constructor para objetos de la clase Muro.
     */
    public Muro() {
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
    }
    
    /**
     * Añade una entrada de texto al muro.
     * @param entradaTexto La entrada de texto que va a ser añadida 
     * al muro.
     */
    public void addEntradaTexto(EntradaTexto entradaTexto) {
        mensajes.add(entradaTexto);
    }
    
    /**
     * Añade una entrada de foto al muro.
     * @param entradaFoto La entrada de foto que va a ser añadida 
     * al muro.
     */
    public void addEntradaFoto(EntradaFoto entradaFoto) {
        fotos.add(entradaFoto);
    }
    
    /**
     * Devuelve las caracteristicas de las entradas de texto y de 
     * las entradas de foto, en este orden.
     * @return Devuelve un String con las caracteristicas de las entradas 
     * de texto y las entradas de imagen en este orden.
     */
    public String toString() {
        String textoADevolver = "";
        if(mensajes.size() > 0) {
            textoADevolver += "Entradas de texto /-/ ";
            for(int contador = 0; contador < mensajes.size(); contador++) {
                textoADevolver += mensajes.get(contador).toString();
                if(contador != mensajes.size() - 1) {
                    textoADevolver += " / ";
                }
            }
        }
        if(mensajes.size() > 0 && fotos.size() > 0) {
            textoADevolver += " /-/ ";
        }
        if(fotos.size() > 0) {
            textoADevolver += "Entradas de foto /-/ ";      
            for(int contador = 0; contador < fotos.size(); contador++) {
                textoADevolver += fotos.get(contador).toString();
                if(contador != fotos.size() - 1) {
                    textoADevolver += " / ";
                }
            }
        }
        if(textoADevolver.equals("")) {
            textoADevolver = "No hay datos de entradas de texto, ni de entradas de fotos aun.";
        }
        return textoADevolver;
    }
    
    /**
     * Muestra por pantalla las caracteristicas de las entradas de texto y de 
     * las entradas de foto, en este orden.
     */
    public void mostrarCaracteristicas() {
        if(mensajes.size() > 0 || fotos.size() > 0) {
            if(mensajes.size() > 0) {
                System.out.println("Entradas de texto:");
                for(EntradaTexto entradaTexto : mensajes) {
                    System.out.println(entradaTexto);
                }
                if(fotos.size() > 0) {
                    System.out.println();
                }
            }
            if(fotos.size() > 0) {
                System.out.println("Entradas de foto:");
                for(EntradaFoto entradaFoto : fotos) {
                    System.out.println(entradaFoto);
                }
            }
        }
        else {
            System.out.println("No hay datos de entradas de texto, ni de entradas de fotos aun.");
        }
    }
}