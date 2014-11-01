

package com.mycompany.smfra;

import java.util.ArrayList;


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
