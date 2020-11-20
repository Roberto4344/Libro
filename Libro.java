
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int paginas;
     

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro,int numeroPaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getPaginas(){
        return paginas;
    }
    
    public void impAutor(){
        System.out.println("El autor es "+ autor);
    }
    
    public void impTitulo(){
        System.out.println("El titulo del libro es "+titulo);
    }
    
    public void impDetalles(){
        System.out.println("Autor:" + autor + ",Libro:" + titulo + ",N PAginas: " + paginas);
    }
    
    public String getDetalles(){
        String detalles;
        detalles ="";
        detalles =(detalles +" Autor: "+ autor + " Libro: "+ titulo + " Paginas:"+ paginas);
        return detalles;
    }
}
