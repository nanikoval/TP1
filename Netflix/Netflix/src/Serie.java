import java.util.ArrayList;
import java.util.List;

public class Serie implements Contenido{

    //private Integer cantidadDeTemporadas;   //a priori no lo pide

    private String genero;

    private List<Actor> actoresProtagonistas = new ArrayList<>();

    private List<Temporada> temporadasEnSerie = new ArrayList<>();


    public void agregarTemporadaASerie(Temporada temporada){

        this.temporadasEnSerie.add(temporada);
        temporada.setGenero(this.getGenero());                      //PUNTO 4

    }


    //PUNTO 1

    public Boolean estaVistoCompleto(Contenido contenido){
        return user.getContenidosVistos().stream().              ///////falta
    }


    //PUNTO 2

    public Integer cuantoDura() {

        return this.temporadasEnSerie.stream().map(temporada -> temporada.cuantoDura()).reduce(0,Integer::sum);

    }


    //PUNTO 3

    public Capitulo ultimoCapituloDisponibleDeLaSerie(){

        return this.temporadasEnSerie.get(temporadasEnSerie.size()-1).ultimoCapituloDisponibleDeLaTemp();

    }


    //PUNTO 4


    public String getGenero() {
        return genero;
    }


    //PUNTO 5


    public void agregarProtagonista(Actor actor){
        this.actoresProtagonistas.add(actor);
    }


    public Boolean actua(Actor actor){

        return this.actoresProtagonistas.contains(actor);
    }




}
