/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserBean;
import sun.rmi.server.Dispatcher;

/**
 *
 * @author COD
 */
public class Controller extends HttpServlet {

    
    Database db;
    Connection con;
    PreparedStatement pst;

    public Controller() {
        super();
        db = new Database();
        con = db.getConnection();
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
        doPost(request, response);
    }

    
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String u,p;
        u= request.getParameter("username");
        p= request.getParameter("password");
        
        UserBean b= new UserBean();
        b.setUsername(u);
        b.setPassword(p);
        boolean s= b.validateUser();
        if(s)
        {
            RequestDispatcher d= request.getRequestDispatcher("sucess.jsp");
            d.forward(request, response);
        }
        else
        {
            RequestDispatcher d= request.getRequestDispatcher("error.jsp");
            d.forward(request, response);
        }
        
    }

    

}
