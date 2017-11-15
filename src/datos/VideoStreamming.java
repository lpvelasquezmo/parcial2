
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
public class VideoStreamming {
    private ArrayList<Video> videos;

    public VideoStreamming() {
      this.videos = new ArrayList<>();
    }
    
   
    
    //Para el caso de composicion
    public void addVideo(String titulo, int annio, String director, 
            int capitulos, int temporada){
      Serie serie = new Serie(capitulos, temporada, titulo, annio, director);
      this.videos.add(serie);
    }
        
    //Si fuera relacion de asociacion y agregacion
    public void addVideo(Video video){
      this.videos.add(video);
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
    
    
}
