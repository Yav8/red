import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 * La clase EntradaFoto contiene las imagenes que los 
 * usuarios desean compartir, el momento en que fueron 
 * publicadas, la cantidad de "me gusta" que tienen y 
 * los comentarios asociados.
 * @author Javier de Cea Dominguez.
 * @version 2018.04.14
 */
public class EntradaFoto {
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;
    
    /**
     * Constructor para objetos de la clase EntradaFoto.
     * @param autor El usuario que va a introducir la imagen.
     * @param url La url de la imagen introducida por el usuario.
     * @param titulo El titulo de la imagen.
     */
    public EntradaFoto(String autor, String url, String titulo) {
        usuario = autor;
        urlImagen = url;
        this.titulo = titulo;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }
    
    /**
     * Añade un "me gusta" a una imagen.
     */
    public void meGusta() {
        cantidadMeGusta += 1;
    }
    
    /**
     * Añade un comentario a una imagen.
     * @param text El comentario que va a ser añadido.
     */
    public void addComentario(String text) {
        comentarios.add(text);
    }
    
    /**
     * Devuelve la url de la imagen.
     * @return Devuelve un String que contiene la url de la imagen.
     */
    public String getUrlImagen() {
        return urlImagen;
    }
    
    /**
     * Devuelve el titulo de la imagen.
     * @return Devuelve un String que contiene el titulo de la imagen.
     */
    public String getTituloImagen() {
        return titulo;
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
     * Devuelve todas las caracteristicas de las entradas de foto.
     * @return Devuelve un String con las caracteristicas de las 
     * entradas de foto.
     */
    public String toString() {
        String textoADevolver = "Usuario: " + usuario + " - url de la imagen: " + urlImagen + " - titulo de la imagen: " + titulo + " - momento de la publicacion: hace ";
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