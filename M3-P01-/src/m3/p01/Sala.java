package m3.p01;

import java.util.ArrayList;
import java.util.Date;

public class Sala {
    private int numSala, butacasMax;
    private ArrayList<Sesion> sesiones = new ArrayList<Sesion>();
    
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
    
    public int getNumSala(){
        return numSala;
    }

    /*
    * 4. Es capaz de eliminar una sesión concreta a partir de su 
    * fecha de proyección;
    */
    public void deleteSesion(Date vFecha){
        for(int i = 0; i<sesiones.size();i++){
            if(sesiones.get(i).getFecha().equals(vFecha)){
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
    
    public ArrayList<Sesion> getSesion(){
        return sesiones;
    }
    /*
    * 6. Devolver la sesión, a partir de la fecha de proyección;
    */
    public Sesion devolverSesion(Date vFecha){
        Sesion ses;
        for (Sesion i: sesiones){
            if (i.getFecha().equals(vFecha)){
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
            if (i.getFecha().equals(vFecha)){
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
        sb.append("\nInformacion de la Sesion actual: \n\n").append(sesiones.toString());
        return sb.toString();
    }
}
