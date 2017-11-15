/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Estudiante
 */
public abstract class Video {
    protected String titulo;
    protected int annio;
    protected String director;

    public Video(String titulo, int annio, String director) {
        this.titulo = titulo;
        this.annio = annio;
        this.director = director;
    }
    public abstract String retornarInformacion();
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", annio=" + annio + ", director=" + director + '}';
    }

    
    
    
    
    
}
