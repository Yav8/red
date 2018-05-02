import java.util.ArrayList;

/**
 * La clase EntradaConComentarios contiene informacion sobre quien 
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
     * A�ade un comentario a un post.
     * @param text El comentario que va a ser a�adido.
     */
    public void addComentario(String text) {
        comentarios.add(text);
    }
    
    /**
     * Devuelve las caracteristicas comunes a las entradas que pueden 
     * tener comentarios.
     * @return Devuelve un String que contiene las caracteristicas 
     * comunes a las entradas que pueden tener comentarios.
     */
    @Override
    public String toString() {
        String textoADevolver = super.toString();
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