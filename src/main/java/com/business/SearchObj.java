/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.business;

import com.library.Book;
import com.library.DB;
import com.library.Student;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Maga Kh
 */
@WebService
public class SearchObj {
    
    @WebMethod
    public List<Student> getStudent(String name){
        return new DB().students(name);
    }
    
    @WebMethod
    public List<Student> getStudents(String name,String surname,int age){
		//header
        return new DB().students(name,surname,age);
    }
    
    @WebMethod
    public List<Book> getBook(String name){
        return new DB().books(name);
    }
    
    @WebMethod
    public List<Book> getBooks(String name,String author,String publisher){
        return new DB().books(name,author,publisher);
    }
}
