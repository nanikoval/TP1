import java.util.List;

public class User {




    private Contenido contenido;

    private List <Contenido> contenidosVistos;


    public void play(Contenido contenido){
        this.contenidosVistos.add(contenido);
    }


    public Boolean vioCompleto(Contenido contenido){
        return this.contenidosVistos.contains(contenido);

        //ver que pasa con temp y serie
    }





}
