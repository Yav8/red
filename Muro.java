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
    private ArrayList<EntradaEvento> eventos;
    
    /**
     * Constructor para objetos de la clase Muro.
     */
    public Muro() {
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
        eventos = new ArrayList<>();
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
     * Devuelve las caracteristicas de las entradas de texto, de 
     * las entradas de foto y de las entradas de evento, en este orden.
     * @return Devuelve un String con las caracteristicas de las entradas 
     * de texto, las entradas de imagen y las entradas de evento, en este orden.
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
        if((mensajes.size() > 0 || fotos.size() > 0) && eventos.size() > 0) {
            textoADevolver += " /-/ ";
        }
        if(eventos.size() > 0) {
            textoADevolver += "Entradas de evento /-/ ";      
            for(int contador = 0; contador < eventos.size(); contador++) {
                textoADevolver += eventos.get(contador).toString();
                if(contador != fotos.size() - 1) {
                    textoADevolver += " / ";
                }
            }
        }
        if(textoADevolver.equals("")) {
            textoADevolver = "No hay datos de entradas de texto, ni de entradas de fotos, ni de eventos aun.";
        }
        return textoADevolver;
    }
    
    /**
     * Muestra por pantalla las caracteristicas de las entradas de texto, de 
     * las entradas de foto y de las entradas de evento, en este orden.
     */
    public void mostrarCaracteristicas() {
        if(mensajes.size() > 0 || fotos.size() > 0 || eventos.size() > 0) {
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
                if(eventos.size() > 0) {
                    System.out.println();
                }
            }
            if(eventos.size() > 0) {
                System.out.println("Entradas de evento:");      
                for(EntradaEvento entradaEvento : eventos) {
                    System.out.println(entradaEvento);
                }
            }
        }
        else {
            System.out.println("No hay datos de entradas de texto, ni de entradas de fotos, ni de entradas de eventos aun.");
        }
    }
    
    /**
     * Añade un evento al muro.
     * @param entradaEvento Añade un evento al muro.
     */
    public void addEntradaEvento(EntradaEvento entradaEvento) {
        eventos.add(entradaEvento);
    }
}