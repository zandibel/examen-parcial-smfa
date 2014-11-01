/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.smfra;

import java.util.ArrayList;

/**
 *
 * @author FRANCO
 */
public class GeneradorCalificaciones {
    private static ArrayList evaluacion;
    
    ArrayList<evaluacion> nombre=new ArrayList<evaluacion>();
        ArrayList<evaluacion> calificacion=new ArrayList<evaluacion>();
        
        evaluacion a=new evaluacion();
        a.setNombre("Petra");
        a.setCalificacion(5.8);
        
        evaluacion a=new evaluacion();
        a.setNombre("Jose");
        a.setCalificacion(7.4);
        
        evaluacion a=new evaluacion();
        a.setNombre("Roberta");
        a.setCalificacion(8.6);
        
      
    public static ArrayList generarCalificaciones(ArrayList Evaluacion) {
        return Evaluacion;
    }
    
}
