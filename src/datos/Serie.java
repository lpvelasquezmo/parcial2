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
public class Serie extends Video{
    private int capitulos;
    private int temporada;

    public Serie(int capitulos, int temporada, String titulo, int annio, String director) {
        super(titulo, annio, director);
        this.capitulos = capitulos;
        this.temporada = temporada;
    }

    @Override
    public String retornarInformacion() {
         return this.capitulos + this.temporada + super.toString();
    }
    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

       
}
