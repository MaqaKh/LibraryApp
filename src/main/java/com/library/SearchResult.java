/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maga Kh
 */
@WebServlet(name = "SearchResult", urlPatterns = {"/searchresult"})
public class SearchResult extends HttpServlet {

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
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
//before             
//if(request.getParameter("name")!=null && request.getParameter("simpleSearch")!=null ){

            if(request.getParameter("simpleSearch")!=null ){
                
                List<Student> list=new DB().students(request.getParameter("name"));
                for(Student s:list){
                    out.println(s.name+" - "+s.surname+" - "+s.birth_date);
                }
                
            
            }else if(request.getParameter("advancedStSearch") != null && request.getParameter("age")!=null){
  

                    int age=Integer.parseInt(request.getParameter("age"));

                    List<Student> list=new DB().students(request.getParameter("name"),request.getParameter("surname"),age);
                    
                    if(list.size()==0){
                        out.print("no element found");
                    }else{
                        for(Student s:list){
                            out.println(s.name+" - "+s.surname+" - "+s.birth_date);
                        }
                    }
                    
                
                
                
            }else if(request.getParameter("advancedBookSearch") != null){
                
                List<Book> list=new DB().books(request.getParameter("name"), request.getParameter("author"), request.getParameter("publisher"));
               
                for(Book b: list){
                    out.println(b.name+" - "+b.author+" - "+b.publisher);
                }
                
            }else{
               request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }catch(Exception e){
            System.out.println(e);
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
