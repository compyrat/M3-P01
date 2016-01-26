package m3.p01;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class M3P01 {

    public static void main(String[] args) throws ParseException {
        /*Date fecha = new Date();
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
        */
        Date date = new Date();
        Pelicula pelicula1= new Pelicula("Pelicula1", "Director1", 1995, "Es una pelicula 1", Genero.COMEDIA);
        Sala sala1= new Sala(1, 90);
        Sesion sesion1= new Sesion(date, pelicula1, sala1);
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(pelicula1);
        ArrayList<Sala> listaSalas=new ArrayList<>();
        Cine cine1 = new Cine("Cinesa", "C/Falsa", listaPeliculas, listaSalas);
        System.out.println(pelicula1.toString());
        System.out.println(sala1.toString());
        System.out.println(sesion1.toString());
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Constructores con todos los parámetros
        
        
        /**
         * 
         * 
         * 
         */
        
        Pelicula pelicula2=new Pelicula("Pelicula2", "Director2", 2002, "Es una pelicula 2", Genero.CIENCIA_FICCION);
        Sala sala2= new Sala(2);
        Sesion sesion2= new Sesion(pelicula2, sala2, 2016, 1, 26, 17, 30);
        Cine cine2 = new Cine("El bosque", "C/Real");
        System.out.println(pelicula2.toString());
        System.out.println(sala2.toString());
        System.out.println(sesion2.toString());
        
        
    }
    
}
