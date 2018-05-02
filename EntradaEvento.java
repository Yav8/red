/**
 * La clase EntradaEvento representa los eventos que 
 * se producen en nuestra red social.
 * @author Javier de Cea Dominguez.
 * @version 2018.04.20
 */
public class EntradaEvento extends Entrada {
    private String mensajeEvento;
    
    /**
     * Constructor para objetos de la clase EntradaEvento.
     * @param autor El usuario que ha introducido un post.
     * @param texto El mensaje del evento del post.
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
        return super.toString() + " - evento: " + getMensajeEvento();
    }
    
    /**
     * Muestra por pantalla el resultado de aplicar el metodo toString de esta clase sobre este objeto.
     */
    public void mostrar() {
        System.out.println(this);
    }
}