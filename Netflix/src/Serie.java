import java.util.ArrayList;
import java.util.List;

public class Serie {

    private Capitulo capitulo;

    private Temporada temporada;

    private Integer cantidadDeTemporadas;   //pensar si es necesario un array fijo

    private List<Temporada> temporadasEnSerie = new ArrayList<>();


    public void agregarTemporadasASerie(Temporada temporada){

        this.temporadasEnSerie.add(temporada);

    }

    //PUNTO 2
    public Integer duracionSerie() {
        return this.temporadasEnSerie.stream().map(temporada -> temporada.duracionTemporada()).reduce(0,Integer::sum);
    }


    //PUNTO 3
    public Capitulo ultimoCapituloDisponible(){
        return this.temporadasEnSerie.get(temporadasEnSerie.size()-1).ultimoCapituloDisponibleDesdeTemp();
    }


}
