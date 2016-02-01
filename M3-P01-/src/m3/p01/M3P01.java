package m3.p01;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class M3P01 {
    public static void main(String[] args) {
        //Creamos el cine
        Cine cine=new Cine("Mambrino", "C/Mayor, El Toboso, La Mancha");
        
        //Añadimos 4 películas, utilizando las dos versiones sobrecargadas del método addPelicula()
        Pelicula peli1=new Pelicula("El halcón maltés", "John Huston", 1941, "Sam Spade se enfrenta a varias bandas que van tras el halcón maltés", Genero.ACCION);
        cine.addPelicula(peli1);
        Pelicula peli2=new Pelicula("Blade Runner", "Ridley Scott", 1982, "En un futuro no lejano, un ex-policía es llamado por su Departamento para que \"retire\" un grupo de replicantes rebeldes", Genero.CIENCIA_FICCION);
        cine.addPelicula(peli2);
        
        cine.addPelicula("El Guateque", "Blake Edwards", 1968, "Un patoso actor de origen hindú que se encuentra rodando una película en el desierto, es invitado por error a asistir a una sofisticada fiesta organizada por el productor de su última película", Genero.COMEDIA);
        cine.addPelicula("La noche de los muertos vivientes", "George A. Romero", 1968, "Un grupo de personas se refugia en una granja cuando los muertos comienzan a cobrar vida", Genero.TERROR);
        
        //Añadimos 3 salas, utilizando las dos versiones sobrecargadas del método addSala()
        Sala sala1=new Sala(1, 100);
        cine.addSala(sala1);
        
        Sala sala2=new Sala(2, 92);
        cine.addSala(sala2);
        
        cine.addSala(3, 102);
        
        //En la Sala 1, días 15 y 16 de Febrero, se proyectará "El halcón maltés" a las 16, 18 y 20 horas.
        //En la Sala 2, días 15 y 16 de Febrero, se proyectará "Blade Runner" a las 16, 18 y 20 horas.
        //En la Sala 3, el día 15 de Febrero, se proyectará "El guateque" a las 16, 18 y 20 horas.
        //En la Sala 3, el día 16 de Febrero, se proyectará "Blade Runner" a las 16, 
        //                                                  "El guateque" a las 18,
        //                                                y "La noche de los muertos vivientes" a las 20 horas.
        
        //Día 15
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(2016, 1, 15, 16, 0, 0);
        Date fecha=cal.getTime();
        
        //Añadimos Sesiones de las 16
        cine.asignarPelicula(peli1, fecha, sala1);
        cine.asignarPelicula(peli2, fecha, sala2);
        cine.asignarPelicula(cine.buscarPelicula("El Guateque"), fecha, cine.buscarSala(3));
        
        //Añadimos Sesiones de las 18
        cal.set(Calendar.HOUR_OF_DAY, 18);
        fecha=cal.getTime();
        cine.asignarPelicula(peli1, fecha, sala1);
        cine.asignarPelicula(peli2, fecha, sala2);
        cine.asignarPelicula(cine.buscarPelicula("El Guateque"), fecha, cine.buscarSala(3));
        
        //Añadimos Sesiones de las 20
        cal.set(Calendar.HOUR_OF_DAY, 20);
        fecha=cal.getTime();
        cine.asignarPelicula(peli1, fecha, sala1);
        cine.asignarPelicula(peli2, fecha, sala2);
        cine.asignarPelicula(cine.buscarPelicula("El Guateque"), fecha, cine.buscarSala(3));
        
        
        //Para el día 16, usamos la segunda versión sobrecargada de addPeliYsesionAsala()
        //Añadimos Sesiones de las 16
        cine.asignarPelicula(peli1.getTitulo(), sala1.getNumSala(), 16, 2, 2016,16,0);
        cine.asignarPelicula(peli2.getTitulo(), sala2.getNumSala(), 16, 2, 2016,16,0);
        cine.asignarPelicula("Blade Runner", 3, 16, 2, 2016,16,0);
        
        //Añadimos Sesiones de las 18
        cine.asignarPelicula(peli1.getTitulo(), sala1.getNumSala(), 16, 2, 2016,18,0);
        cine.asignarPelicula(peli2.getTitulo(), sala2.getNumSala(), 16, 2, 2016,18,0);
        cine.asignarPelicula("El Guateque", 3, 16, 2, 2016,18,0);
        
        
        //Añadimos Sesiones de las 20
        cine.asignarPelicula(peli1.getTitulo(), sala1.getNumSala(), 16, 2, 2016,20,0);
        cine.asignarPelicula(peli2.getTitulo(), sala2.getNumSala(), 16, 2, 2016,20,0);
        cine.asignarPelicula("La noche de los muertos vivientes", 3, 16, 2, 2016,20,0);
        
        //Vemos las sesiones de una película
        System.out.println("---------------------------");
        System.out.println(cine.showSesionesPelicula("Blade Runner"));
        
        //Vemos las sesiones de día
        System.out.println(cine.showPelicula(15, 2, 2016));
        
        System.out.println("---------------------------");
        System.out.println(cine.toString());
        
        //Borramos la última sesión del día 15 de la Sala 1
        cine.eliminarSesion(fecha, sala1);
        
        System.out.println("---------------------------");
        System.out.println(cine.toString());
        
        //Borramos la película "Blade Runner"
        cine.delPelicula("Blade Runner");
        
        System.out.println("---------------------------");
        System.out.println(cine.toString());
        
        //Borramos la Sala 3
        cine.delSala(3);
        
        System.out.println("---------------------------");
        System.out.println(cine.toString());
    }
}
