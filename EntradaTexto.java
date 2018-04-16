import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 * La clase EntradaTexto contiene la informacion de los usuarios 
 * que envian mensajes, el momento en que fue publicado dicho mensaje, 
 * la cantidad de "me gusta" que tiene ese mensaje, y los comentarios 
 * asociados a dicho mensaje.
 * @author Javier de Cea Dominguez.
 * @version 2018.04.14
 */
public class EntradaTexto {
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;
    
    /**
     * Constructor para objetos de la clase EntradaTexto.
     * @param autor El usuario que va a escribir un mensaje.
     * @param texto El mensaje que va a enviar el usuario.
     */
    public EntradaTexto(String autor, String texto) {
        usuario = autor;
        mensaje = texto;
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
     * Devuelve el contenido del mensaje.
     * @return Devuelve un String con el contenido del mensaje.
     */
    public String getMensaje() {
        return mensaje;
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
     * Devuelve todas las caracteristicas de las entradas de texto.
     * @return Devuelve un String con las caracteristicas de las 
     * entradas de texto.
     */
    public String toString() {
        String textoADevolver = "Usuario: " + usuario + " - mensaje: " + mensaje + " - momento de la publicacion: hace ";
        LocalDateTime fechaDelMomentoDeLaPublicacion = getMomentoPublicacion();
        if(fechaDelMomentoDeLaPublicacion.getMinute() < 1) {
            textoADevolver += fechaDelMomentoDeLaPublicacion.getSecond();
            if(fechaDelMomentoDeLaPublicacion.getSecond() == 1) {
                textoADevolver += " segundo ";                    
            }
            else {
                textoADevolver += " segundos ";                    
            }
        }
        else {
            textoADevolver += fechaDelMomentoDeLaPublicacion.getMinute();
            if(fechaDelMomentoDeLaPublicacion.getMinute() == 1) {
                textoADevolver += " minuto ";
            }
            else {
                textoADevolver += " minutos ";                    
            }
        }
        textoADevolver += "- me gusta: " + cantidadMeGusta;
        if(comentarios.isEmpty()) {
            textoADevolver += " - no se ha realizado ningun comentario aun.";                                        
        }
        else {
            textoADevolver += " - comentarios: ";
            for(int contador = 0; contador < comentarios.size(); contador++) {
                textoADevolver += comentarios.get(contador);
                if(contador != comentarios.size() - 1) {
                    textoADevolver += " - ";
                }
            }
        } 
        return textoADevolver;
    }
}