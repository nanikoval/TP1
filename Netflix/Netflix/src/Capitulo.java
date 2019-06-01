import java.util.List;

public class Capitulo implements Contenido, ContenidoUnitario{

    private  Integer numero;

    private String nombre;

    private Integer duracion;

    private String genero;

    private List<Actor>actoresInvitados;



    public Capitulo (Integer numero, String nombre, Integer duracion, String genero){
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
    }


    public Integer getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }


    //PUNTO 1

    public Boolean estaVistoCompletoPor(User user){

        return user.getContenidosVistos().contains(this);
    }


    //PUNTO 2

    public Integer cuantoDura(){

        return this.getDuracion();
    }


    //PUNTO 4

    protected void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }



    //PUNTO 5

    //A

    //metodo para tener los actores de la serie


    public Boolean actua(Actor actor){

        return seriealaquepertenezco.actoresProtagonistas.contains(actor);

       && this.actoresInvitados.contains(actor);
    }

    //B



}
