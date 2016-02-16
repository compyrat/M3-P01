package m3.p01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Exceptions.*;

public class Sala {
    private static int INTERVAL = 10;
    
    private int numSala, butacasMax;
    private ArrayList<Sesion> listaSesiones = new ArrayList<Sesion>();
    
    public Sala(){
        
    }
    public Sala(int vNumSala, int vButacasMax, ArrayList<Sesion> sesion){
        this.numSala = vNumSala;
        this.butacasMax = vButacasMax;
        this.listaSesiones = sesion;
    }
    public Sala(int vNumSala, int vButacasMax){
        this.numSala = vNumSala;
        this.butacasMax = vButacasMax;
    }
    
    public static int getInterval(){
        return INTERVAL;
    }
    public static void setInterval(int intervalo){
        INTERVAL = intervalo;
    }
    
    public int getNumSala(){
        return numSala;
    }
    public int getNButacas(){
        return butacasMax;
    }
    public void setNButacas(int vButacas){
        if (vButacas <= 0){
            throw new IllegalArgumentException("No puedes introducir butacas negativas");
        }else{
            this.butacasMax = vButacas;
        }
    }
   public ArrayList<Sesion> getSesion(){
        return listaSesiones;
    }
    public void setSesion(ArrayList<Sesion> listaSesiones){
        this.listaSesiones = listaSesiones;
    }
    
    /*
    * 4. Es capaz de eliminar una sesión concreta a partir de su 
    * fecha de proyección;
    */
    public void deleteSesion(Date vFecha){
        String aux = "";
        for(int i = 0; i<listaSesiones.size();i++){
            if(fechaIgual(listaSesiones.get(i).getDate(),(vFecha), true)){
                 listaSesiones.remove(listaSesiones.get(i));
                  aux = listaSesiones.get(i).toString();
            }
        }
    }
    public void deleteSesion(int anyo, int mes, int dia, int hora, int minuto){
        deleteSesion(getFecha(anyo, mes, dia, hora, minuto));
    }
    public void deleteSesionNumSala(int nSala){
        for(int i = 0; i<listaSesiones.size();i++){
            if(listaSesiones.get(i).getSala().getNumSala() == nSala){
                 listaSesiones.remove(listaSesiones.get(i));
            }
        }
    }
    /*
    * 5. Añadir una nueva sesión de proyección en dicha sala;
    */
    public void addSesion(Sesion iSesion) throws SesionSolapada{
        if (!overlap(iSesion)){
            iSesion.setSala(this);
            iSesion.setnButacas(getNButacas());
            iSesion.setButacasLibres(getNButacas());
            listaSesiones.add(iSesion);
        }else{
            throw new SesionSolapada("Esta sesion ("+ iSesion.getDate()+ "), de la sala ("+iSesion.getSala().getNumSala()+") se solapa con otra.");
        }
    }
    
    public void addSesion(Pelicula iPelicula, Date iFecha){
        Sesion ses = new Sesion(iFecha, iPelicula, this);
        if (!overlap(ses)){
            listaSesiones.add(ses);
        }
    }
    public void addSesion(Pelicula iPelicula, int anyo, int mes, int dia, int hora, int minuto){
        addSesion(iPelicula, getFecha(anyo, mes, dia, hora, minuto));
    }
    
    /*
    * 6. Devolver la sesión, a partir de la fecha de proyección;
    */
    public Sesion devolverSesion(Date vFecha){
        Sesion ses;
        for (Sesion i: listaSesiones){
            if (fechaIgual(i.getDate(), vFecha)){
                ses = i;
                return ses;
            }
        }
        return null;
    }
    
    /*
    * 7. Mostrar por pantalla la información de todas las listaSesiones que se 
    * proyectan en la sala. Esta funcionalidad se encapsulará en un método 
    * denominado mostrarInfoSesiones();
    */
    public String mostrarInfoSesiones(){
        Sesion ses;
        for (Sesion i: listaSesiones){
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
        for (Sesion i: listaSesiones){
            if (i.getDate().equals(vFecha)){
                return i.toString();
            }
        }
        return "";
    }

    private Date getFecha(int dia, int mes, int anyo, int hora, int minutos){
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(anyo, mes, dia, hora, minutos);
        Date fecha = new Date();
        fecha = cal.getTime();
        return fecha;
    }
    
    private boolean fechaIgual(Date date1, Date date2){
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        boolean sameDay = false; 
                if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                  cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
                  cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)) sameDay = true;
                  //cal1.get(Calendar.HOUR) == cal2.get(Calendar.HOUR) &&
                  //cal1.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE);
        return sameDay;
    }
    private boolean fechaIgual(Date date1, Date date2, boolean ismin){
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        boolean sameDay = false; 
                if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                  cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
                  cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)&&
                  cal1.get(Calendar.HOUR) == cal2.get(Calendar.HOUR) &&
                  cal1.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE)) sameDay = true;
        return sameDay;
    }
    private boolean fechaIntervalo(Sesion ses1, Sesion ses2){
        boolean sameDay = false; 
                if (Math.abs((ses1.getDate().getTime()+(ses1.getPelicula().getDuracion()*60000)) - 
                        (ses1.getDate().getTime()+(ses1.getPelicula().getDuracion()*60000))) > 
                        (INTERVAL * 60000)) sameDay = true;
        return sameDay;
    }
    
    private boolean overlap(Sesion sesion){
        boolean aux = false;
        for(Sesion ses:listaSesiones){
            if (fechaIgual(ses.getDate(), sesion.getDate(), true)){
                aux = true;
            }
            if (fechaIntervalo(ses, sesion)){
                aux = true;
            }
        }
        return aux;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nNumero de sala: ").append(numSala);
        sb.append("\nNumero de Butacas totales: ").append(butacasMax);
        if (!mostrarInfoSesiones().equals("")){
        sb.append("\nInformacion de las Sesiones actuales: \n").append(listaSesiones.toString());
        }
        return sb.toString();
    }
}
