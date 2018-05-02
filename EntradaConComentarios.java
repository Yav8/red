import java.util.ArrayList;

/**
 * La clase Entrada contiene informacion sobre quien 
 * realiza una entrada, el momento que se publica, la 
 * cantidad de "me gusta" que tiene y los comentarios.
 * @author Javier de Cea Dominguez.
 * @version 20.04.2018
 */
public class EntradaConComentarios extends Entrada {
    private ArrayList<String> comentarios;
    
    /**
     * Constructor para objetos de la clase Entrada.
     * @param autor El usuario que realiza una entrada.
     */
    public EntradaConComentarios(String autor) {
        super(autor);
        comentarios = new ArrayList<>();
    }
    
    /**
     * Añade un comentario a un mensaje.
     * @param text El comentario que va a ser añadido.
     */
    public void addComentario(String text) {
        comentarios.add(text);
    }
    
    /**
     * Devuelve los comentarios de la entrada.
     * @return Devuelve un ArrayList de String que son los comentarios que 
     * tiene una entrada.
     */
    public ArrayList<String> getComentarios() {
        return comentarios;
    }
}