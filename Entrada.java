import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 * La clase Entrada contiene informacion sobre quien 
 * realiza una entrada, el momento que se publica, la 
 * cantidad de "me gusta" que tiene y los comentarios.
 * @author Javier de Cea Dominguez.
 * @version 20.04.2018
 */
public class Entrada {
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;
    
    /**
     * Constructor para objetos de la clase Entrada.
     * @param autor El usuario que realiza una entrada.
     */
    public Entrada(String autor) {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }
    
    /**
     * Añade un "me gusta" a un mensaje.
     */
    public void meGusta() {
        cantidadMeGusta += 1;
    }
    
    /**
     * Añade un comentario a un mensaje.
     * @param text El comentario que va a ser añadido.
     */
    public void addComentario(String text) {
        comentarios.add(text);
    }
    
    /**
     * Devuelve el usuario que ha realizado la entrada.
     * @return Devuelve un String que es el usuario que ha 
     * realizado la entrada.
     */
    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Devuelve el tiempo que ha transcurrido desde que se creo el post.
     * @return Devuelve un LocalDateTime que corresponde al tiempo que ha 
     * transcurrido desde que se creo el post.
     */
    public LocalDateTime getMomentoPublicacion() {
        LocalDateTime momentoADevolver = LocalDateTime.now();
        momentoADevolver = momentoADevolver.minusYears(momentoPublicacion.getYear());
        momentoADevolver = momentoADevolver.minusMonths(momentoPublicacion.getMonthValue());
        momentoADevolver = momentoADevolver.minusDays(momentoPublicacion.getDayOfMonth());                
        momentoADevolver = momentoADevolver.minusHours(momentoPublicacion.getHour());
        momentoADevolver = momentoADevolver.minusMinutes(momentoPublicacion.getMinute());
        momentoADevolver = momentoADevolver.minusSeconds(momentoPublicacion.getSecond());
        momentoADevolver = momentoADevolver.minusNanos(momentoPublicacion.getNano());
        return momentoADevolver;
    }
    
    /**
     * Devuelve la cantidad de "me gusta" que tiene una entrada.
     * @return Devuelve un int que es la cantidad de "me gusta" que 
     * tiene una entrada.
     */
    public int getCantidadMeGusta() {
        return cantidadMeGusta;
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