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
public class EntradaTexto extends EntradaConComentarios {
    private String mensaje;
    
    /**
     * Constructor para objetos de la clase EntradaTexto.
     * @param autor El usuario que va a escribir un mensaje.
     * @param texto El mensaje que va a enviar el usuario.
     */
    public EntradaTexto(String autor, String texto) {
        super(autor);
        mensaje = texto;
    }
    
    /**
     * Devuelve el contenido del mensaje.
     * @return Devuelve un String con el contenido del mensaje.
     */
    public String getMensaje() {
        return mensaje;
    }
    
    /**
     * Devuelve todas las caracteristicas de las entradas de texto.
     * @return Devuelve un String con las caracteristicas de las 
     * entradas de texto.
     */
    @Override
    public String toString() {
        String textoADevolver = "Usuario: " + getUsuario() + " - mensaje: " + getMensaje() + " - momento de la publicacion: hace ";
        LocalDateTime fechaDelMomentoDeLaPublicacion = getMomentoPublicacion();
        ArrayList<String> listaDeComentarios = getComentarios();
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
        if(listaDeComentarios.isEmpty()) {
            textoADevolver += " - no se ha realizado ningun comentario aun.";                                        
        }
        else {
            textoADevolver += " - comentarios: ";
            for(int contador = 0; contador < listaDeComentarios.size(); contador++) {
                textoADevolver += listaDeComentarios.get(contador);
                if(contador != listaDeComentarios.size() - 1) {
                    textoADevolver += " - ";
                }
            }
        } 
        return textoADevolver;
    }
    
    /**
     * Muestra por pantalla el usuario y el mensaje que ha introducido.
     */
    public void mostrarAutorYMensaje() {
        System.out.println("Usuario: " + getUsuario() + " - mensaje: " + mensaje);
    }
}