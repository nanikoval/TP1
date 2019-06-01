import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {


    private Contenido contenido;

    private ContenidoUnitario contenidoUnitario;

    private List <ContenidoUnitario> contenidosVistos = new ArrayList<>();


    public void play(ContenidoUnitario contenidoUnitario){

        //reproduce el contenido y:
        this.getContenidosVistos().add(contenidoUnitario);
      //  this.generosVistos.add(map de generos de los contenidos)

        //if contenido es el ultimo cap de la temp agregar temporada
        //if contenido es el ultimo cap de la serie agregar serie
    }


    public Contenido getContenido() {
        return contenido;
    }

    public List<ContenidoUnitario> getContenidosVistos() {

        return contenidosVistos;
    }

    //PUNTO 1

    public Boolean vioCompleto(Contenido contenido) {

        return this.contenido.estaVistoCompleto(this);

        //return this.contenidosVistos.contains(contenido);

        //ver que pasa con temp y serie //contains??????
        //return this.contenido.estaVistoCompleto(contenido);

    }




   // public String generosVistosSinRepeticion(){
   //     return this.generosVistos.stream().distinct().collect(Collectors.toSet());
   // }


















     /* CLASE


    contenidosVistos  (solo cap y peliculas?)


    public Boolean visteCompleto (Contenido contenido){

        return contenidosVistos.stream().filter( contenido -> teVioCompleto(this)).collect(Collectors.toList());

    o
        return contenidosVistos.contains(contenido);

    o
            return.contenido.fueVistoCompletoPor(this)

    }


    //4)a) que generos vio sin repetidos
    GenerosQueVio
            contenidosVistos.stream().map(contenido-> contenido.getGenero())
            .distinct().collect(Collectors.toSet));

    //hago una nueva bolsa con generos, elimino los repetidos, y los gusrdo en un Set, una colec que no admite repetidos

    //distinct me devuelve los distintos


    //4)b) generopreferido por minutos vistos

    contenidosVistos.stream(). filterby o algo asi?


    //5)b) fan pensar con AllMatch
    // para todoo lo visto coincide en todos alguno de todos los actores?





    /////// class Serie

    list temporadas     //la serie delega en las temporadas y estas en los capitulos

            public boolean fueVistoCompletoPor(Usuarie usuarie){
        return this.temporadas.stream().allMatch(t -> t.fueVistoCompletoPor(usuarie));
            }



            // lo de la flechita es un better del for each



    /////class temporada

    list capitulos



    capitulos.stream().map(cap->cap.getDuracion()).sum();

    //de una bolsa de capitulos con map paso a una bolsa de numeros(minutos) y los sumo todos

*/

}
