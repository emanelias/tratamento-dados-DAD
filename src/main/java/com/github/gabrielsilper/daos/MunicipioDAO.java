package com.github.gabrielsilper.daos;

import com.github.gabrielsilper.models.Municipio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MunicipioDAO {
    public void insert(Connection con, Municipio municipio){
        String sql = "INSERT INTO municipios " +
                " (codigo_ibge, uf, municipio) " +
                " VALUES (?, ?, ?) " +
                " ON DUPLICATE KEY UPDATE " +
                " uf = VALUES(uf), " +
                " municipio = VALUES(municipio);";

        try(PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, municipio.getCodigoIbge());
            ps.setString(2, municipio.getUf());
            ps.setString(3, municipio.getMunicipio());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
