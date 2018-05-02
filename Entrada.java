import java.time.LocalDateTime;

/**
 * La clase Entrada contiene informacion sobre quien 
 * realiza una entrada, el momento que se publica y la 
 * cantidad de "me gusta" que tiene.
 * @author Javier de Cea Dominguez.
 * @version 2018.04.20
 */
public class Entrada {
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    
    /**
     * Constructor para objetos de la clase Entrada.
     * @param autor El usuario que realiza una entrada.
     */
    public Entrada(String autor) {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }
    
    /**
     * A�ade un "me gusta" a un mensaje.
     */
    public void meGusta() {
        cantidadMeGusta += 1;
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
     * Metodo que utilizan las clases hijas para mostrar sus respectivas entradas.
     */
    public void mostrar() {
        
    }
    
    /**
     * Devuelve las caracteristicas comunes a todas las entradas.
     * @return Devuelve un String que contiene las caracteristicas 
     * comunes a todas las entradas.
     */
    @Override
    public String toString() {
        String textoADevolver = "Usuario: " + getUsuario() + " - momento de la publicacion: hace ";
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
