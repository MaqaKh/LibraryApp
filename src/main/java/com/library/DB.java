package com.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DB {

    public Connection conn;
    public PreparedStatement ps;
    public ResultSet rs;

    public DB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useEncoding=true&characterEncoding=UTF-8", "root", "123456");
            System.out.println("success");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection problem : "+e);

        }
    }

    public void close() {
        try {
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //if only name is given

    public List<Student> students(String name) {
        try {
            List<Student> list = new ArrayList<>();
            String sql = "select * from student where name like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+name+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Student(rs.getString(2),rs.getString(3), rs.getString(4)));
            };
            return list;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        } finally {
            close();
        }
    }
    //if age is given
        public List<Student> students(String name,String surname,int age) {
        try {
            LocalDate now=LocalDate.now();
            LocalDate lowerBound=now.minusYears(age+1);
            LocalDate higherBound=now.minusYears(age-1);
            System.out.println("----------------------------------------");
            System.out.println(lowerBound);
            System.out.println(higherBound);
            
            List<Student> list = new ArrayList<>();
            String sql = "select * from student where name like ? AND surname like ? AND (birth_date >= ? AND birth_date<= ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+name+"%");
            ps.setString(2, "%"+surname+"%");
            ps.setString(3, ""+lowerBound.toString()+"");
            ps.setString(4, ""+higherBound.toString()+"");
            System.out.println(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Student(rs.getString(2),rs.getString(3), rs.getString(4)));
            };
            return list;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        } finally {
            close();
        }
    }
//        //if age is not given
//       public List<Student> students(String name,String surname) {
//        try {
//
//            
//            List<Student> list = new ArrayList<>();
//            String sql = "select * from student where name like ? AND surname like ? )";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, "%"+name+"%");
//            ps.setString(2, "%"+surname+"%");
//
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                list.add(new Student(rs.getString(2),rs.getString(3), rs.getString(4)));
//            };
//            return list;
//        } catch (Exception ex) {
//            System.out.println("Error: " + ex);
//            return null;
//        } finally {
//            close();
//        }
//    }

    public List<Book> books(String name) {
        try {
            List<Book> list = new ArrayList<>();
            String sql = "select * from book where name like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+name+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Book(rs.getString(2),rs.getString(3), rs.getString(4)));
            };
            return list;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        } finally {
            close();
        }
    }
    public List<Book> books(String name,String author,String publisher) {
        try {
            List<Book> list = new ArrayList<>();
            String sql = "select * from book where name like ? AND author like ? AND publisher like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+name+"%");
            ps.setString(2, "%"+author+"%");
            ps.setString(3, "%"+publisher+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Book(rs.getString(2),rs.getString(3), rs.getString(4)));
            };
            return list;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        } finally {
            close();
        }
    }    
}
