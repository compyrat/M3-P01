package m3.p01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Sala {
    private int numSala, butacasMax;
    private ArrayList<Sesion> sesiones = new ArrayList<Sesion>();
    
    public Sala(){
        
    }
    public Sala(int vNumSala){
        this.numSala = numSala;
    }
    public Sala(int vNumSala, int vButacasMax){
        this.numSala = vNumSala;
        this.butacasMax = vButacasMax;
    }
    public int getNButacas(){
        return butacasMax;
    }
    public void setNButacas(int vButacas){
        this.butacasMax = vButacas;
    }
   private Date getFecha(int dia, int mes, int anyo, int hora, int minutos){
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(anyo, mes, dia, hora, minutos);
        Date fecha = new Date();
        fecha = cal.getTime();
        return fecha;
    }
    
    public int getNumSala(){
        return numSala;
    }

    /*
    * 4. Es capaz de eliminar una sesión concreta a partir de su 
    * fecha de proyección;
    */
    public void deleteSesion(Date vFecha){
        for(int i = 0; i<sesiones.size();i++){
            if(sesiones.get(i).getDate().equals(vFecha)){
                 sesiones.remove(sesiones.get(i));
            }
        }
    }
    public void deleteSesion(int anyo, int mes, int dia, int hora, int minuto){
        deleteSesion(getFecha(anyo, mes, dia, hora, minuto));
    }
    public void deleteSesionNumSala(int nSala){
        for(int i = 0; i<sesiones.size();i++){
            if(sesiones.get(i).getSala().getNumSala() == nSala){
                 sesiones.remove(sesiones.get(i));
            }
        }
    }
    /*
    * 5. Añadir una nueva sesión de proyección en dicha sala;
    */
    public void addSesion(Sesion iSesion){
        iSesion.setSala(this);
        iSesion.setnButacas(getNButacas());
        iSesion.setButacasLibres(getNButacas());
        sesiones.add(iSesion);
    }
    
    public void addSesion(Pelicula iPelicula, Date iFecha){
        Sesion ses = new Sesion(iFecha, iPelicula, this);
        sesiones.add(ses);
    }
    public void addSesion(Pelicula iPelicula, int anyo, int mes, int dia, int hora, int minuto){
        addSesion(iPelicula, getFecha(anyo, mes, dia, hora, minuto));
    }
    
    public ArrayList<Sesion> getSesion(){
        return sesiones;
    }
    public void setSesion(ArrayList<Sesion> sesiones){
        this.sesiones = sesiones;
    }
    /*
    * 6. Devolver la sesión, a partir de la fecha de proyección;
    */
    public Sesion devolverSesion(Date vFecha){
        Sesion ses;
        for (Sesion i: sesiones){
            if (i.getDate().equals(vFecha)){
                ses = i;
                return ses;
            }
        }
        return null;
    }
    
    /*
    * 7. Mostrar por pantalla la información de todas las sesiones que se 
    * proyectan en la sala. Esta funcionalidad se encapsulará en un método 
    * denominado mostrarInfoSesiones();
    */
    public String mostrarInfoSesiones(){
        Sesion ses;
        for (Sesion i: sesiones){
            if (i.getSala().getNumSala() == this.numSala){
                ses = i;
                return i.toString();
            }
        }
        return "";
    }
    
    /*
    * 8. Mostrar por pantalla la información de una sesión concreta, 
    * identiﬁcada por la fecha de su proyección. Para ello, utilizaremos 
    * un método llamado mostrarInfoSesion(Date fecha) que reciba como parámetro 
    * la fecha de proyección de la sesión que queremos mostrar.
    */
    
    public String mostrarInfoSesion(Date vFecha){
        for (Sesion i: sesiones){
            if (i.getDate().equals(vFecha)){
                return i.toString();
            }
        }
        return "";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero de sala: ").append(numSala);
        sb.append("\nNumero de Butacas totales: ").append(butacasMax);
        if (!mostrarInfoSesiones().equals("")){
        sb.append("\nInformacion de la Sesion actual: \n\n").append(sesiones.toString());
        }
        return sb.toString();
    }
}
