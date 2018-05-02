/**
 * La clase EntradaFoto contiene las imagenes que los 
 * usuarios desean compartir, el momento en que fueron 
 * publicadas, la cantidad de "me gusta" que tienen y 
 * los comentarios asociados.
 * @author Javier de Cea Dominguez.
 * @version 2018.04.14
 */
public class EntradaFoto extends EntradaConComentarios {
    private String urlImagen;
    private String titulo;
    
    /**
     * Constructor para objetos de la clase EntradaFoto.
     * @param autor El usuario que va a introducir la imagen.
     * @param url La url de la imagen introducida por el usuario.
     * @param titulo El titulo de la imagen.
     */
    public EntradaFoto(String autor, String url, String titulo) {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
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
     * Devuelve todas las caracteristicas de las entradas de foto.
     * @return Devuelve un String con las caracteristicas de las 
     * entradas de foto.
     */
    @Override
    public String toString() {
        return super.toString() + " - url de la imagen: " + urlImagen + " - titulo de la imagen: " + titulo;
    }
    
    /**
     * Muestra por pantalla el resultado de aplicar el metodo toString de esta clase sobre este objeto.
     */
    public void mostrar() {
        System.out.println(this);
    }
    
    /**
     * Muestra por pantalla los datos exclusivos de las entradas de foto.
     */
    public void mostrarDatosExclusivos() {
        System.out.println("url de la imagen: " + urlImagen + " - titulo: " + titulo);
    }
}