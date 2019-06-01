import java.util.ArrayList;
import java.util.List;

public class Temporada implements Contenido{


    private Integer numero;

    private String genero;

    private Integer cantidadDeCapitulos;   //pensar si es necesario un array fijo

    private List<Capitulo> capitulosEnTemporada = new ArrayList<>();


    public Temporada (Integer numero, Integer cantidadDeCapitulos){
        this.numero = numero;
        this.cantidadDeCapitulos = cantidadDeCapitulos;
    }


    public List<Capitulo> getCapitulosEnTemporada() {

        return capitulosEnTemporada;

    }

    public Integer getNumero() {

        return numero;

    }

    public void agregarCapitulosATemporada(Capitulo capitulo){

        this.capitulosEnTemporada.add(capitulo);
        capitulo.setGenero(this.getGenero());                 //PUNTO 4

    }


    //PUNTO 1

    public Boolean estaVistoCompletoPor(User user){
        //ideas
        //return user.getContenidosVistos().contains(this.capitulosEnTemporada.stream().allMatch());         ///////falta
        //return this.capitulosEnTemporada.stream().allMatch(t -> t.estaVistoCompletoPor(user));

    }


    //PUNTO 2

    public Integer cuantoDura() {

        return this.capitulosEnTemporada.stream().map(capitulo -> capitulo.getDuracion()).reduce(0,Integer::sum);

    }

    //PUNTO 3 (responsabilidad en Serie)

    protected Capitulo ultimoCapituloDisponibleDeLaTemp(){

        return this.capitulosEnTemporada.get(capitulosEnTemporada.size()-1);

    }


    //PUNTO 4


    protected void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }


    //PUNTO 5


    //metodo para tener los actores de la serie


    public Boolean actua(Actor actor){

        return seriealaquepertenezco.actoresProtagonistas.contains(actor);
    }


}
