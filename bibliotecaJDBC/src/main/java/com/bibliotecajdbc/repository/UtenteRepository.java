package com.bibliotecajdbc.repository;

import com.bibliotecajdbc.constants.DBConfig;
import com.bibliotecajdbc.model.Libro;
import com.bibliotecajdbc.model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteRepository {
    public static Utente insertUtente(Utente utente){
        List<Utente> insertUtenteList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "INSERT INTO utente (codiceUtente, nome, cognome)" + " VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, utente.getCodiceUtente());
            statement.setString(2, utente.getNome());
            statement.setString(3, utente.getCognome());
            statement.executeUpdate();
            return utente;
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

}