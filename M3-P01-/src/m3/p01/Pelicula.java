package m3.p01;

public class Pelicula {
    private String titulo;
    private String director;
    private int anyo;
    private String sinopsis;
    private Genero genero;

    public Pelicula(){
        
    }
    
    public Pelicula(String titulo, String director, int anyo, String sinopsis, Genero genero) {
        this.titulo = titulo;
        this.director = director;
        this.anyo = anyo;
        this.sinopsis = sinopsis;
        this.genero = genero;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(titulo);
        sb.append("\nDirector: ").append(director);
        sb.append("\nAño: ").append(anyo);
        sb.append("\nSinopsis: ").append(sinopsis);
        sb.append("\nGenero: ").append(genero);
        return sb.toString();
    }

}
