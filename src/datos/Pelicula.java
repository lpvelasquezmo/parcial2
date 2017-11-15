/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pelicula extends Video{
    private ArrayList<Actor> actores;
    
    public Pelicula(String titulo, int annio, String director) {
        super(titulo, annio, director);
        this.actores = new ArrayList<>();
    }
    //Si es relacion de Agregacion o asociacion
    public void addActor(Actor actor) {
        this.actores.add(actor);
    }
    //Si fuera relacion de composicion
    public void addActor(String nombre, String apellido){
       Actor actor = new Actor(nombre, apellido);
       this.actores.add(actor);
    }
     @Override
    public String retornarInformacion() {
       String informacion = "";
        for (Actor actor : actores) {
           informacion+=actor; 
        }
        return informacion;
    }
    
    public ArrayList<Actor> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }
   
    
    
   
    
}
