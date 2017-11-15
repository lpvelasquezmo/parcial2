/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Actor;
import datos.Documental;
import datos.Pelicula;
import datos.Serie;
import datos.Video;
import datos.VideoStreamming;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class LogicaVideoStreamming {
    private VideoStreamming videoStreamming; 

    public LogicaVideoStreamming() {
      this.videoStreamming = new VideoStreamming();
    }
    
    
     public String listarVideos(){
      String listaVideos = "";
        for (Video video : this.videoStreamming.getVideos()) {
            listaVideos+=video.retornarInformacion();
        }
        return listaVideos;
    }
    public ArrayList<Actor> listarActores(){
        ArrayList<Actor> actores = new ArrayList<>();
        for (Video video : this.videoStreamming.getVideos()) {
            if(video instanceof Pelicula){
              Pelicula p =(Pelicula)video;
              actores.addAll(p.getActores());
            }
        }
        return actores;
    }
    public void cargar(String ruta){
      
       File lectura = new File(ruta);
       Scanner flujoEntrada = null;
       if(lectura.exists()){
           try {
               flujoEntrada = new Scanner(lectura);
               flujoEntrada.useDelimiter(",");
               String tipo = null, titulo= null, annio= null, director= null, genero = null;
               int temporada =0, capitulos = 0;
               while(flujoEntrada.hasNext()){
                   tipo = flujoEntrada.next().trim();
                   if(tipo.equals("S")){
                       titulo=flujoEntrada.next().trim();
                       annio=flujoEntrada.next().trim();
                       director = flujoEntrada.next().trim();
                       temporada = flujoEntrada.nextInt();
                       capitulos= flujoEntrada.nextInt();
                       
                       //Si fuera agregacion
                       Serie serie = new Serie(capitulos, temporada, titulo, capitulos, director);
                       videoStreamming.addVideo(serie);
                     
                       //Si fuera Composicion
                       videoStreamming.addVideo(titulo, capitulos, director, capitulos, temporada);
                       
                       
                   }else if(tipo.equals("D")){
                       titulo=flujoEntrada.next().trim();
                       annio=flujoEntrada.next().trim();
                       director = flujoEntrada.next().trim();
                       genero = flujoEntrada.next().trim();
                       Documental documental = new Documental(genero, titulo, capitulos, director);
                       videoStreamming.addVideo(documental);
                       
                   }else if(tipo.equals("P")){
                   
                   }
                   //Solo para prueba
                  
               }
               
               
           } catch (FileNotFoundException ex) {
               Logger.getLogger(LogicaVideoStreamming.class.getName()).log(Level.SEVERE, null, ex);
           }
          
        
       }
    
    }
}
