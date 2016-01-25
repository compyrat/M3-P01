package m3.p01;

import java.text.ParseException;
import java.util.Date;

public class M3P01 {

    public static void main(String[] args) throws ParseException {
        Date fecha = new Date();
        Pelicula pel = new Pelicula("Test1", "", 1, "", Genero.ACCION);
        Sala sala = new Sala(15, 85);
        Sesion ses = new Sesion(fecha, pel, sala);
        ses.actualizarButacasVendidas(23);
        sala.addSesion(ses);
        System.out.println(sala.toString());
        
        Pelicula pel2 = new Pelicula("Test2", "", 2, "", Genero.COMEDIA);
        Sala sala2 = new Sala(25, 45);
        //Sesion ses2 = new Sesion(fecha, pel, sala);
        Cine cine = new Cine();
        System.out.println("\n---------------------------------");

        System.out.println(sala.toString());
        System.out.println("---------------------------------");

        System.out.println(sala2.toString());
        
        
    }
    
}
