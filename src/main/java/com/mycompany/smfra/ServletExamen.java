
package com.mycompany.smfra;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExamen extends HttpServlet {

    protected void doGET(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        RequestDispatcher despachador=request.getRequestDispatcher("/presentacion.jsp");
        despachador.forward(request, response);
     
        evaluacion a=new evaluacion();
        a.setNombre("Ana");
        a.setCalificacion(7);
        
    }
 }
