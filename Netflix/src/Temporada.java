import java.util.ArrayList;
import java.util.List;

public class Temporada {


    private Integer numero;

    private Integer cantidadDeCapitulos;   //pensar si es necesario un array fijo

    private List<Capitulo> capitulosEnTemporada = new ArrayList<>();


    public void agregarCapitulosATemporada(Capitulo capitulo){

        this.capitulosEnTemporada.add(capitulo);

    }

    public List<Capitulo> getCapitulosEnTemporada() {

        return capitulosEnTemporada;

    }

    //PUNTO 3 (responsabilidad en Serie)
    public Capitulo ultimoCapituloDisponibleDesdeTemp(){

        return this.capitulosEnTemporada.get(capitulosEnTemporada.size()-1);

    }

    //PUNTO 2
    public Integer duracionTemporada() {

        return this.capitulosEnTemporada.stream().map(capitulo -> capitulo.getDuracion()).reduce(0,Integer::sum);

    }


    public Integer getNumero() {
        return numero;
    }
}
