/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.Controller;

import com.udea.ejb.UserFacade;
import com.udea.ejb.UserFacadeLocal;
import com.udea.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres
 */
public class UsuariosController extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)            
            throws ServletException, IOException, ParseException {        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      try {
            String action= request.getParameter("action");
            String url="index.jsp" ;
            if("list".equals(action)){
               List<User> findAll= userFacade.findAll();
               request.getSession().setAttribute("user",findAll);
               url = "listaUsuarios.jsp";

            }else if ("login".equals(action)){
                String u= request.getParameter("username");
                String p= request.getParameter ("password");
                boolean login= userFacade.Login(u,p);
                        if (login){
                              request.getSession().setAttribute("login",u);
                              url= "usuario.jsp";
                        }else{url="login.jsp?error=1";}

            }else if("insert".equals(action)){
                
                User a= new User();
                a.setId(Integer.parseInt(request.getParameter("id")));
                a.setNombre(request.getParameter("nombre"));
                a.setApellido(request.getParameter("apellido"));
                a.setCargo(request.getParameter("cargo"));
                a.setTelefono((request.getParameter("telefono")));
                a.setUsername(request.getParameter("username"));
                a.setPassword(request.getParameter("password"));
                a.setRol(request.getParameter("rol"));
                a.setDireccion(request.getParameter("direccion"));
                a.setDepartamento(request.getParameter("departamento"));                 
                a.setNacimiento((request.getParameter("nacimiento")));
                userFacade.create(a);
                url= "login.jsp";
            }else if("delete".equals(action)){
                String id= request.getParameter("id");
                User a= userFacade.find(Integer.valueOf(id));
                userFacade.remove(a);
  
                url= "UsuariosController?action=list";
            }else if("logout".equals(action)){
               request.getSession().removeAttribute("login");
               url= "login.jsp";
            }
            response.sendRedirect(url);
        }finally{out.close();}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(UsuariosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(UsuariosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
