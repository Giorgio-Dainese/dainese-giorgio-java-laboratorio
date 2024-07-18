package com.esercitazionepersona.repository;

import com.esercitazionepersona.constants.DBConstants;
import com.esercitazionepersona.model.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaRepository {
    public static List<Persona> selectAllPersona(){
        List<Persona> personaList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PPW);
            String query = "SELECT * FROM PERSONA";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Persona l =  new Persona(
                        rs.getString("EMAIL"),
                        rs.getString("NOME"),
                        rs.getString("COGNOME")

                );
                personaList.add(l);
            }
            return personaList;
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return new ArrayList<>();
    }
    public static Persona inserisciPersona(Persona persona){
        List<Persona> insertLibroList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PPW);
            String query = "INSERT INTO persona VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, persona.getEmail());
            statement.setString(2, persona.getNome());
            statement.setString(3, persona.getCognome());
            statement.executeUpdate();
            return persona;
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static Persona selezionaPerEmail(String email){
        Persona personaEmailList = new Persona();
        try {
            Connection connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PPW);
            String query = "SELECT * FROM persona WHERE EMAIL = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, email);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Persona p =  new Persona(
                        rs.getString("EMAIL"),
                        rs.getString("NOME"),
                        rs.getString("COGNOME")
                );
                personaEmailList = p;
            }
            return personaEmailList;
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return personaEmailList;
    }
}
