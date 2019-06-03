import java.util.List;

public class Capitulo implements Contenido, ContenidoUnitario{

    private  Integer numero;

    private String nombre;

    private Integer duracion;

    private String genero;

    private Serie serieALaQuePertenece;

    private List<Actor>actoresInvitados;



    public Capitulo (Integer numero, String nombre, Integer duracion, String genero, Serie serieALaQuePertenece){
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
        this.serieALaQuePertenece = serieALaQuePertenece;
    }


    public Integer getNumero() {
        return numero;
    }

    public String getNombre() { return nombre; }

    protected Integer getDuracion() {
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

    public Boolean actua(Actor actor){

        return this.serieALaQuePertenece.getActores().contains(actor) && this.getActoresInvitados().contains(actor);
    }

    //B

    public List<Actor> getActores() {
        return this.serieALaQuePertenece.getActores();   //&& this.getActoresInvitados();

    }


    public List<Actor> getActoresInvitados() {
        return actoresInvitados;
    }


}
