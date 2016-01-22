package m3.p01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cine {
    private String nombre, direccion;
    private List<Pelicula> pelicula = new ArrayList<Pelicula>();
    private List<Sala> sala = new ArrayList<Sala>();

    public Cine(){
        
    }
    /*
    * 5. Debe ser capaz de mostrar la cartelera, es decir, la información 
    * del conjunto de películas que tiene en cartel;
    */
    public String mostrarCartelera(){
        int contador = 0;
        StringBuilder sb = new StringBuilder();
        for (Pelicula i: pelicula){
            sb.append("Pelicula " + contador + ".\n");
            sb.append("\t" + i.toString());
        }
        return sb.toString();
    }
    
    /*
    * 8. Debe permitir la asignación de la proyección de una película en una 
    * sesión en una sala concreta. Se debe tener en cuenta que al asociar una 
    * sesión a una sala, las butacas de la sesión se deben actualizar con la 
    * capacidad que tiene la sala donde se va a proyectar;
    */
    public void asignarPelicula(/*Pelicula pel, Sesion ses, Sala sala*/){
        //TODO
    }
    
    /*
    * 9. Debe permitir la eliminación de una sesión concreta, dado su fecha 
    * de proyección, de una sala concreta;
    */
    public void eliminarSesion(Date vFecha, int vSala){
        for (Sala i: sala){
            if (i.getNumSala() == vSala){
                i.deleteSesion(vFecha);
            }
        }
    }
    
    /*
    * 10. Debe mostrar la información de las sesiones en las que se 
    * proyecta una película, dado el título de la película;
    */
    public void showSesionesPelicula(String vNombre){
        for (Pelicula i: pelicula){
            if (i.getTitulo().equals(vNombre)){
                i.toString();
            }
        }
    }
    
    /*
    * 11. Debe mostrar la información de las películas que se proyectan en una 
    * fecha concreta (día, mes y año).
    */
    public void showPelicula(Date vFecha){
        for (Sala i: sala){
            if (i.mostrarInfoSesiones().getFecha().equals(vFecha)){
                i.mostrarInfoSesiones().getPelicula().toString();
            }
        }
    }
    
    
}
