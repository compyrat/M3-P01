package m3.p01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cine {
    private String nombre, direccion;
    private List<Pelicula> pelicula = new ArrayList<Pelicula>();
    private List<Sala> sala = new ArrayList<Sala>();

    
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
    * 9. Debe permitir la eliminación de una sesión concreta, dado su fecha 
    * de proyección, de una sala concreta;
    */
    public boolean eliminarSesion(Date vFecha, int vSala){
        for (Sala i: sala){
            if (i.getNumSala() == vSala){
                i.deleteSesion(vFecha);
                return true;
            }
        }
        return false;
    }
    
    /*
    * 10. Debe mostrar la información de las sesiones en las que se 
    * proyecta una película, dado el título de la película;
    */
    public boolean showSesionesPelicula(String vNombre){
        for (Pelicula i: pelicula){
            if (i.getTitulo().equals(vNombre)){
                i.toString();
                return true;
            }
        }
        return false;
    }
    
    /*
    * 11. Debe mostrar la información de las películas que se proyectan en una 
    * fecha concreta (día, mes y año).
    */
    public boolean showPelicula(Date vFecha){
        for (Sala i: sala){
            if (i.mostrarInfoSesiones().getFecha().equals(vFecha)){
                i.mostrarInfoSesiones().getPelicula().toString();
            }
        }
        return false;
    }
}
