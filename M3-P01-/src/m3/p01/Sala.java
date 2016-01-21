package m3.p01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sala {
    private int numSala, butacasMax;
    private List<Sesion> sesion = new ArrayList<Sesion>();
    
    public Sala(int vNumSala){
        this.numSala = numSala;
    }
    public Sala(int vNumSala, int vButacasMax){
        this.numSala = numSala;
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
    public boolean deleteSesion(Date vFecha){
        /*
        * TODO all.
        */
        return true;
    }
    
    /*
    * 5. Añadir una nueva sesión de proyección en dicha sala;
    */
    public boolean addSesion(Date vFecha){
        /*
        * TODO all.
        */
        return true;
    }
    
    /*
    * 6. Devolver la sesión, a partir de la fecha de proyección;
    */
    public Sesion devolverSesion(Date vFecha){
        Sesion ses;
        for (Sesion i: sesion){
            if (i.getFecha() == (vFecha)){
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
    public Sesion mostrarInfoSesiones(){
        Sesion ses;
        for (Sesion i: sesion){
            if (i.getSala().getNumSala() == this.numSala){
                ses = i;
                return ses;
            }
        }
        return null;
    }
    
    /*
    * 8. Mostrar por pantalla la información de una sesión concreta, 
    * identiﬁcada por la fecha de su proyección. Para ello, utilizaremos 
    * un método llamado mostrarInfoSesion(Date fecha) que reciba como parámetro 
    * la fecha de proyección de la sesión que queremos mostrar.
    */
    
    public String mostrarInfoSesion(Date vFecha){
        for (Sesion i: sesion){
            if (i.getFecha() == (vFecha)){
                return i.toString();
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "Sala{" + "numSala=" + numSala + ", butacasMax=" + butacasMax + ", sesion=" + sesion + '}';
    }
    
    
}
