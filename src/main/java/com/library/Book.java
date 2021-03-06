/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.library;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Maga Kh
 */

@XmlRootElement(name = "Book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {

    public String name;
    public String author;
    public String publisher;


    public String studentNameAssociated;
    public String studentSurnameAssociated;
    
    
    
    public Book(){}
    
    public Book(String name, String author, String publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
    public Book(String name,String author,String publisher,String studentName,String studentSurname){
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.studentNameAssociated=studentName;
        this.studentSurnameAssociated=studentSurname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public String getStudentNameAssociated() {
        return studentNameAssociated;
    }

    public void setStudentNameAssociated(String studentNameAssociated) {
        this.studentNameAssociated = studentNameAssociated;
    }

    public String getStudentSurnameAssociated() {
        return studentSurnameAssociated;
    }

    public void setStudentSurnameAssociated(String studentSurnameAssociated) {
        this.studentSurnameAssociated = studentSurnameAssociated;
    }
}
