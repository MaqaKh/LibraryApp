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

            if(request.getParameter("simpleSearch")!=null ){
                
                List<Student> list=new DB().students(request.getParameter("name"));
                if(list.size()>0){
                    for(Student s:list){
                        out.println(s.name+" - "+s.surname+" - "+s.birth_date);
                    }
                }else{
                    out.println("no element found");
                }
                
            
            }else if(request.getParameter("advancedStSearch") != null ){

                //Recheck
                if(request.getParameter("age").length()==0){
                        List<Student> list=new DB().students(request.getParameter("name"),request.getParameter("surname"));

                    if(list.size()>0){
                        for(Student s:list){
                            out.println(s.name+" - "+s.surname+" - "+s.birth_date);
                        }

                    }else{
                        out.print("no element found");
                    }
                }else if( request.getParameter("age")!=null && request.getParameter("age").length()>0){

                    int age=Integer.parseInt(request.getParameter("age"));
                    List<Student> list=new DB().students(request.getParameter("name"),request.getParameter("surname"),age);

                    if(list.size()>0){
                         for(Student s:list){
                            out.println(s.name+" - "+s.surname+" - "+s.birth_date);
                        }

                    }else{
                       out.print("no element found");
                    }
                }else{
                    out.println("Error: Age should be a number");
                }
                        
                
            }else if(request.getParameter("simpleBookSearch")!=null){
                
                List<Book> list=new DB().books(request.getParameter("name"));
                if(list.size()>0){
                    for(Book b: list){
                        out.println(b.name+" - "+b.author+" - "+b.publisher);
                    }
                }else{out.println("No element found");}
                
            }else if(request.getParameter("advancedBookSearch") != null){
                
                List<Book> list=new DB().books(request.getParameter("name"), request.getParameter("author"), request.getParameter("publisher"));
               if(list.size()>0){
                    for(Book b: list){
                        out.println("Name: '"+b.name+"' | Author: '"+b.author+"' | Publisher:'"+b.publisher+"'"+"<br>"+"Borrowed by: "+b.studentNameAssociated+" "+b.studentSurnameAssociated);
                    }
               }else{
                   out.println("no element found");
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
