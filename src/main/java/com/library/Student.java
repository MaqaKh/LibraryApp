package com.library;

public class Student {
    public String name;
    public String surname;
    public String birth_date;

    
    
    
//    ctrl+space basiriq 
    public Student(String name, String surname, String birth_date) {
        this.name = name;
        this.surname = surname;
        this.birth_date = birth_date;
    }

    //alt+insert basiriq
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
    
    
}
