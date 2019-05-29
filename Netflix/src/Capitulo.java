import java.util.List;

public class Capitulo {

    private  Integer numero;

    private String nombre;

    private Integer duracion;

    private List<Actor>actores;

    private String genero;



    public Capitulo (Integer numero, String nombre, Integer duracion, String genero){
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }


    public Integer getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDuracion() {           //punto 2 desp ver temp y serie
        return duracion;
    }

    public String getGenero() {
        return genero;
    }
}
