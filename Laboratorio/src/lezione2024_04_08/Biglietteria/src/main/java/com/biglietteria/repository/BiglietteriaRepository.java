package com.biglietteria.repository;

//Il database dove viene creato? Da intellij posso vederlo?

import com.biglietteria.model.Biglietteria;
import com.biglietteria.constants.DbConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BiglietteriaRepository {
    public static List<Biglietteria> selezionaBiglietterie(){
        List<Biglietteria> biglietteriaList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DbConfig.URL, DbConfig.USER, DbConfig.PPW);
            String query = "SELECT * FROM BIGLIETTERIA";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Biglietteria b =  new Biglietteria(
                        rs.getString("CODICE_BIGLIETTERIA"),
                        rs.getString("INDIRIZZO_BIGLIETTERIA"),
                        rs.getString("NOME_BIGLIETTERIA")
                );
                biglietteriaList.add(b);
            }
            return biglietteriaList;
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
