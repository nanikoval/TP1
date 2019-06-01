import java.util.ArrayList;
import java.util.List;

public class Pelicula implements Contenido, ContenidoUnitario {

    private String nombre;

    private Integer duracion;

    private String genero;

    private List<Actor> actoresProtagonistas = new ArrayList<>();


    public Pelicula(String nombre, Integer duracion, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }


    //PUNTO 1

    public Boolean estaVistoCompleto(User user){

        return user.getContenidosVistos().contains(this);
    }


    //PUNTO 2

    public Integer getDuracion() {
        return duracion;
    }


    public Integer cuantoDura(){
        return this.getDuracion();
    }



    //PUNTO 4


    public String getGenero() {
        return genero;
    }




}
