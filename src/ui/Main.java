/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import logica.LogicaVideoStreamming;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LogicaVideoStreamming cargar = new LogicaVideoStreamming();
       cargar.cargar("videoStreamming");
       String videos = cargar.listarVideos();
        System.out.println(videos);
    }
    
}
