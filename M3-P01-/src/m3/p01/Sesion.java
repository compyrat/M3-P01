package m3.p01;

public class Sesion {
    private String fecha;
    private int nButacas, nButacasLibres;
    private Pelicula pelicula;
    private Sala sala;
    
    public Sesion(){}

    public Sesion (String iFecha, Pelicula iPelicula, Sala iSala){
        this.fecha = iFecha;
        this.nButacas = this.sala.getNButacas();
        this.pelicula = iPelicula;
        this.sala = iSala;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
    }

    @Override
    public String toString() {
        return "Sesion{" + "fecha=" + fecha + ", nButacas=" + nButacas 
                + ", nButacasLibres=" + nButacasLibres + ", pelicula=" 
                + pelicula + ", sala=" + sala + '}';
    }
    
    public void actualizarButacasVendidas(int vendidas) {
        nButacasLibres = nButacas - vendidas;
    }
}
