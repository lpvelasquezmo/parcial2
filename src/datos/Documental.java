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
public class Documental extends Video{
     private String genero;

    public Documental(String genero, String titulo, int annio, String director) {
        super(titulo, annio, director);
        this.genero = genero;
    }

    @Override
    public String retornarInformacion() {
       return this.genero + "" + super.toString();
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

 
     
}
