package m3.p01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cine {
    private String nombre, direccion;////
    private ArrayList<Pelicula> pelicula = new ArrayList<Pelicula>();
    private ArrayList<Sala> sala = new ArrayList<Sala>();

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
    
    
    public void delPelicula(Pelicula pel){
        /*Sala sala;
        Sesion sesion;
        Iterator<Sala> iter = listaSalas.iterator();
        while(iter.hasNext()){
            sala=inter.next();
            Iterator<Sesison> iter2 = listaSesiones.iterator();
            while(iter2.hasNext()){
                
            }
        }*/
    }
    
    public void delPelicula(String titulo){
        Pelicula pel = buscarPelicula(titulo);
        if (pel != null) delPelicula(pel);
    }
    public Pelicula buscarPelicula(String titulo){
        Pelicula pel = null;
        for (Pelicula i: pelicula){
            if (i.getTitulo().equals(titulo)) pel = i;
        }
        return pel;
    }
    /*
    * 8. Debe permitir la asignación de la proyección de una película en una 
    * sesión en una sala concreta. Se debe tener en cuenta que al asociar una 
    * sesión a una sala, las butacas de la sesión se deben actualizar con la 
    * capacidad que tiene la sala donde se va a proyectar;
    */
    public void asignarPelicula(Pelicula pel, Date fecha, Sala sala){
        //TODO
    }
    
    public void asignarPelicula(String titulo,int numSala, int dia, int mes, int anyo, int hora, int minutos) {
        //TODO
        getFecha(dia, mes, anyo, hora, minutos);
    }
    
    /*
    * 9. Debe permitir la eliminación de una sesión concreta, dado su fecha 
    * de proyección, de una sala concreta;
    */
    public void eliminarSesion(Date vFecha, int vNumSala){
        for (Sala i: sala){
            if (i.getNumSala() == vNumSala){
                i.deleteSesion(vFecha);
            }
        }
    }
    public void eliminarSesion(int vNumSala, int dia, int mes, int anyo, int hora, int minutos){
        for (Sala i: sala){
            if (i.getNumSala() == vNumSala){
                i.deleteSesion(getFecha(dia, mes, anyo, hora, minutos));
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
            if (i.devolverSesion(vFecha).getFecha().equals(vFecha)){
                i.devolverSesion(vFecha).getPelicula().toString();
            }
        }
    }
    public void showPelicula(int dia, int mes, int anyo, int hora, int minutos){
        showPelicula(getFecha(dia, mes, anyo, hora, minutos));
    }
    private Date getFecha(int dia, int mes, int anyo, int hora, int minutos){
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(anyo, mes, dia, hora, minutos);
        Date fecha = new Date();
        fecha = cal.getTime();
        return fecha;
    }
}
