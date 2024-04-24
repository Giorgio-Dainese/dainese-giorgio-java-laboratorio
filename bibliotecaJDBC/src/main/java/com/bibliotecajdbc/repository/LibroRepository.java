package com.bibliotecajdbc.repository;

import com.bibliotecajdbc.model.Libro;
import com.bibliotecajdbc.constants.DBConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroRepository {
public static List<Libro> selezionaTuttiLibri(){
    List<Libro> libroList = new ArrayList<>();
    try {
        Connection connection = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
        String query = "SELECT * FROM libri";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            Libro f =  new Libro(
                    rs.getString("CODICE_ISBN"),
                    rs.getString("TITOLO"),
                    rs.getString("GENERE"),
                    rs.getString("ANNO_PUBBLICAZIONE"),
                    rs.getString("AUTORE")
            );
            libroList.add(f);
        }
        return libroList;
    }catch (SQLException ex){
        System.out.println(ex.getMessage());
    }
        return new ArrayList<>();
}

    public static List<Libro> selezionaGenereLibri(String genere){
        List<Libro> libroGenereList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM libri" + " WHERE GENERE = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,genere);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Libro f =  new Libro(
                        rs.getString("CODICE_ISBN"),
                        rs.getString("TITOLO"),
                        rs.getString("GENERE"),
                        rs.getString("ANNO_PUBBLICAZIONE"),
                        rs.getString("AUTORE")
                );
                libroGenereList.add(f);
            }
            return libroGenereList;
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return new ArrayList<>();
    }

}