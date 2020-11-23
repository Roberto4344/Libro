
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
    private String numRef;
    private int vecesPrestado;
    private boolean libroTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro,int numeroPaginas,boolean libroDeTexto){
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;
        numRef ="";
        vecesPrestado = 0;
        libroTexto = libroDeTexto;
    }

    public boolean getLibroTexto(){
       return libroTexto;
    }

    public int getPrestamo(){
        return vecesPrestado;
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

    public String getnRef(){
        return numRef;
    }

    /**
     * setter del numero de referencia
     */
    public void setNRef(String newNRef){

        if( newNRef.length() < 3){
            System.out.println("Numero no valido ,requiere de un minimo de 3 caracteres, el atributo no se modificara"); 
        }
        else{
            this.numRef = newNRef;
        }   
    }

    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }

    public void impAutor(){
        System.out.println("El autor es "+ autor);
    }

    public void impTitulo(){
        System.out.println("El titulo del libro es "+titulo);
    }

    public void impDetalles(){
        String libreto;
        if(libroTexto == true){
            libreto = "si";
        }
        else{
            libreto ="no";
        }
        
        if (numRef == ""){
            System.out.println("Autor:" + autor + ",Libro:" + titulo + ",N PAginas: " + paginas + " ,Numero Referencia: ZZZ"+" ,Veces prestado:"+ vecesPrestado +" ,Libro texto:"+ libreto);
        }
        else{ 
            System.out.println("Autor:" + autor + ",Libro:" + titulo + ",N PAginas: " + paginas + " ,Numero Referencia:"+numRef+" ,Veces prestado:"+ vecesPrestado+" ,Libro texto:"+ libreto);
        }
    }

    public String getDetalles(){
        String detalles;
        detalles ="";
        String libreto;
        
        if(libroTexto == true){
            libreto = "si";
        }
        else{
            libreto ="no";
        }
        
        if (numRef == ""){
            detalles =detalles +" Autor: "+ autor + " Libro: "+ titulo + " Paginas:"+ paginas +" Numero referencia:ZZZ"+" Veces prestado:"+ vecesPrestado+" Libro texto:"+ libreto;
        }
        else{
            detalles =detalles +" Autor: "+ autor + " Libro: "+ titulo + " Paginas:"+ paginas +" Numero referencia:"+ numRef+" Veces prestado:"+ vecesPrestado+" Libro texto:"+ libreto;
        }
        return detalles;
    }
}
