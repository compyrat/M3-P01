package m3.p01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Exceptions.*;

public class Sesion {
    private Date fecha;
    //private String formato_fecha = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss").format(fecha);
    private int nButacas, nButacasLibres;
    private Pelicula pelicula;
    private Sala sala;
    
    public Sesion(){}
    
    public Sesion (Date iFecha, Pelicula iPelicula){
        this.fecha = iFecha;
        this.pelicula = iPelicula;
    }

    public Sesion (Date iFecha, Pelicula iPelicula, Sala iSala){
        this.fecha = iFecha;
        this.nButacas = iSala.getNButacas();
        this.nButacasLibres = iSala.getNButacas();
        this.pelicula = iPelicula;
        this.sala = iSala;
    }
    
    public Sesion( Pelicula iPelicula, Sala iSala, int anyo, int mes, int dia, int hora, int minuto){
        this.fecha = getFecha(dia, mes, anyo, hora, minuto);
        this.nButacas = iSala.getNButacas();
        this.nButacasLibres = iSala.getNButacas();
        this.pelicula = iPelicula;
        this.sala = iSala;
    }
    
    public Date getDate() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getnButacas() {
        return nButacas;
    }

    public void setnButacas(int nButacas) throws IllegalArgumentException{
        if (nButacas <= 0 || nButacas > getSala().getNButacas()){
            throw new IllegalArgumentException("No se puede introducior un numero de butacas negativas ni mayor al numero de butacas de su sala");
        }else{
            this.nButacas = nButacas;
        }
    }

    public int getnButacasLibres() {
        return nButacasLibres;
    }
    public void setButacasLibres(int num) throws IllegalArgumentException{
        if (num <= 0 || num > getSala().getNButacas()){
            throw new IllegalArgumentException("No se puede introducior un numero de butacas libres negativas ni mayor al numero de butacas de su sala");
        }else{
            nButacasLibres = num;
        }
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
        nButacas = sala.getNButacas();
    }

    public void actualizarButacasVendidas(int vendidas) throws IllegalArgumentException{
        if (vendidas <= 0 || vendidas > nButacasLibres){
            throw new IllegalArgumentException("No se puede introducior un numero de butacas libres negativas ni mayor al numero de butacas libres");
        }else{
            nButacasLibres = nButacas - vendidas;
        }
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
        sb.append("\n\nFecha: ").append(fecha);
        sb.append("\nNumero de Butacas totales: ").append(nButacas);
        sb.append("\nNumero de Butacas disponibles: ").append(nButacasLibres);
        sb.append("\nPelicula: ").append(pelicula.getTitulo());
        return sb.toString();
    }
}
