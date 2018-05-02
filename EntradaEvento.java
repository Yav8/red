import java.time.LocalDateTime;

/**
 * La clase EntradaEvento representa los eventos que 
 * se producen en nuestra red social.
 * @author Javier de Cea Dominguez.
 * @version 20.04.2018
 */
public class EntradaEvento extends Entrada {
    private String mensajeEvento;
    
    /**
     * Constructor para objetos de la clase EntradaEvento.
     * @param autor El usuario que ha introducido un post.
     */
    public EntradaEvento(String autor, String texto) {
        super(autor);
        mensajeEvento = texto;
    }
    
    /**
     * Devuelve el contenido del evento.
     * @return Devuelve un String que es el 
     * contenido del evento.
     */
    public String getMensajeEvento() {
        return mensajeEvento;
    }
    
    /**
     * Devuelve todas las caracteristicas de las entradas de eventos.
     * @return Devuelve un String con las caracteristicas de las 
     * entradas de eventos.
     */
    @Override
    public String toString() {
        String textoADevolver = "Usuario: " + getUsuario() + " - mensaje: " + getMensajeEvento() + " - momento de la publicacion: hace ";
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
        textoADevolver += "- me gusta: " + getCantidadMeGusta();
        return textoADevolver;
    }
}