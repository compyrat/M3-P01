package m3.p01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        this.fecha = getFecha(anyo, mes, dia, hora, minuto);
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

    public void setnButacas(int nButacas) {
        this.nButacas = nButacas;
    }

    public int getnButacasLibres() {
        return nButacasLibres;
    }
    public void setButacasLibres(int num){
        nButacasLibres = num;
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

    public void actualizarButacasVendidas(int vendidas) {
        nButacasLibres = nButacas - vendidas;
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
        sb.append("\nFecha: ").append(fecha);
        sb.append("\nNumero de Butacas totales: ").append(nButacas);
        sb.append("\nNumero de Butacas disponibles: ").append(nButacasLibres);
        sb.append("\nPelicula: ").append(pelicula.getTitulo());
        sb.append("\nNumero de sala: ").append(sala.getNumSala());
        return sb.toString();
    }
}
