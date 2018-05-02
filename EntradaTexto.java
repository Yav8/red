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
        return super.toString() + " - mensaje: " + getMensaje();
    }
    
    /**
     * Muestra por pantalla el usuario y el mensaje que ha introducido.
     */
    public void mostrarAutorYMensaje() {
        System.out.println("Usuario: " + getUsuario() + " - mensaje: " + mensaje);
    }
    
    /**
     * Muestra por pantalla el resultado de aplicar el metodo toString de esta clase sobre este objeto.
     */
    public void mostrar() {
        System.out.println(this);
    }
}