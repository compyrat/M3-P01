package m3.p01;

import Exceptions.*;

public class Pelicula {
    private String titulo;
    private String director;
    private int anyo;
    private String sinopsis;
    private Genero genero;
    private int duracion;

    public Pelicula(){
        
    }
    
    public Pelicula(String titulo, String director, int anyo, String sinopsis, Genero genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anyo = anyo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nTitulo: ").append(titulo);
        sb.append("\nDirector: ").append(director);
        sb.append("\nAño: ").append(anyo);
        sb.append("\nSinopsis: ").append(sinopsis);
        sb.append("\nGenero: ").append(genero);
        sb.append("\nDuración: ").append(duracion).append(" min");
        return sb.toString();
    }

}
