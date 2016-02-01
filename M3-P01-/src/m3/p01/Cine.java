package m3.p01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cine {
    private String nombre;
    private String direccion;
    private ArrayList<Pelicula> pelicula = new ArrayList<Pelicula>();
    private ArrayList<Sala> sala = new ArrayList<Sala>();

    public Cine(){
        
    }
    public Cine(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Cine(String nombre, String direccion, ArrayList<Pelicula> cartelera, ArrayList<Sala> sala){
        this.nombre = nombre;
        this.direccion = direccion;
        this.pelicula = cartelera;
        this.sala = sala;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(ArrayList<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Sala> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Sala> sala) {
        this.sala = sala;
    }
    
    /*
    * 5. Debe ser capaz de mostrar la cartelera, es decir, la información 
    * del conjunto de películas que tiene en cartel;
    */
    public String mostrarCartelera(){
        int contador = 0;
        StringBuilder sb = new StringBuilder();
        for (Pelicula i: getPelicula()){
            sb.append("Pelicula " + contador + ".\n");
            sb.append("\t" + i.toString());
        }
        return sb.toString();
    }
    
    public void addPelicula(Pelicula pel){
        pelicula.add(pel);
    }
    public void addPelicula(String titulo, String director, int anyo, String sinopsis, Genero genero){
        Pelicula pel = new Pelicula (titulo, director, anyo, sinopsis, genero);
        addPelicula(pel);
    }
    
    public void delPelicula(Pelicula pel){
        for (Sala i: sala){
            for (Sesion i2: i.getSesion()){
                if (i2.getPelicula().getTitulo().equals(pel.getTitulo())) 
                    pelicula.remove(i2.getPelicula());
                    i.deleteSesion(i2.getDate());
            }
        }
    }
    
    public void delPelicula(String titulo){
        pelicula.remove(buscarPelicula(titulo));
    }
    public Pelicula buscarPelicula(String titulo){
        Pelicula pel = null;
        for (Pelicula i: getPelicula()){
            if (i.getTitulo().equals(titulo)) pel = i;
        }
        return pel;
    }
    
    public void addSala(Sala sala){
        this.sala.add(sala);
    }
    public void addSala(int num, int butacas){
        Sala sala = new Sala(num, butacas);
        addSala(sala);
    }
    
    public void delSala(Sala iSala){
        iSala.deleteSesionNumSala(iSala.getNumSala());
        sala.remove(iSala);
    }
    public void delSala(int num){
        delSala(buscarSala(num));
    }
    public Sala buscarSala(int num){
        Sala sal = null;
        for (Sala i: sala){
            if (i.getNumSala() == num) return i;
        }
        return sal;
    }
    /*
    * 8. Debe permitir la asignación de la proyección de una película en una 
    * sesión en una sala concreta. Se debe tener en cuenta que al asociar una 
    * sesión a una sala, las butacas de la sesión se deben actualizar con la 
    * capacidad que tiene la sala donde se va a proyectar;
    */
    public void asignarPelicula(Pelicula pel, Date fecha, Sala sala){
        sala.addSesion(new Sesion(fecha, pel, sala));
    }
    
    public void asignarPelicula(String titulo,int numSala, int dia, int mes, int anyo, int hora, int minutos) {
        for (Pelicula i: getPelicula()){
            if (i.getTitulo().equals(titulo)){
                asignarPelicula(i, getFecha(dia, mes, anyo, hora, minutos), getSalaWithNum(numSala));
            }
        }
    }
    
    private Sala getSalaWithNum(int numSala){
        for (Sala i : getSala()){
            if (i.getNumSala() == numSala){
                return i;
            }
        }
        return null;
    }
    /*
    * 9. Debe permitir la eliminación de una sesión concreta, dado su fecha 
    * de proyección, de una sala concreta;
    */
    public void eliminarSesion(Date vFecha, Sala sala){
        for (Sala i: getSala()){
            if (i.getNumSala() == sala.getNumSala()){
                i.deleteSesion(vFecha);
            }
        }
    }
    public void eliminarSesion(int vNumSala, int dia, int mes, int anyo, int hora, int minutos){
        for (Sala i: getSala()){
            if (i.getNumSala() == vNumSala){
                i.deleteSesion(getFecha(dia, mes, anyo, hora, minutos));
            }
        }
    }
    /*
    * 10. Debe mostrar la información de las sesiones en las que se 
    * proyecta una película, dado el título de la película;
    */
    public String showSesionesPelicula(String vNombre){
        String aux = "";
        for (Pelicula i: getPelicula()){
            if (i.getTitulo().equals(vNombre)){
                aux = i.toString();
            }
        }
        return aux;
    }
    
    /*
    * 11. Debe mostrar la información de las películas que se proyectan en una 
    * fecha concreta (día, mes y año).
    */

    public String showPelicula(int dia, int mes, int anyo){
        String aux = "";
        Date vFecha = new Date();
        vFecha = getFecha(dia, mes, anyo);
        for (Sala i: getSala()){
            if (i.devolverSesion(vFecha).getDate().equals(vFecha)){
                aux = i.devolverSesion(vFecha).getPelicula().toString();
            }
        }

        return aux;
    }
    
    private Date getFecha(int dia, int mes, int anyo){
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(anyo, mes, dia);
        Date fecha = new Date();
        fecha = cal.getTime();
        return fecha;
    }
    
    private Date getFecha(int dia, int mes, int anyo, int hora, int minutos){
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(anyo, mes, dia, hora, minutos);
        Date fecha = new Date();
        fecha = cal.getTime();
        return fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCine: ").append(nombre);
        sb.append("\nDireccion: ").append(direccion);
        sb.append("\nPeliculas: \n").append(this.getPelicula().toString());
        sb.append("\nSala: \n").append(this.getSala().toString());
        return sb.toString();
    }
    
}
