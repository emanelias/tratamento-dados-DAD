package com.github.gabrielsilper.municipio_project;

import com.github.gabrielsilper.daos.MunicipioDAO;
import com.github.gabrielsilper.db.DatabaseConnection;
import com.github.gabrielsilper.models.Municipio;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

public class MunicipioMain {
    public static void main(String[] args) {
        String caminho = "/home/gasp/gabriel-dev/java/json-cep-reader/municipios.csv";
        MunicipioDAO municipioDAO = new MunicipioDAO();

        try (Connection connection = DatabaseConnection.getConnection()) {
            connection.setAutoCommit(false);
            try (CSVReader reader = new CSVReader(new FileReader(caminho))) {
                String[] linha;
                boolean primeiraLinha = true;
                while ((linha = reader.readNext()) != null) {
                    if (primeiraLinha) {
                        primeiraLinha = false;
                        continue;
                    }
                    String uf = linha[0];
                    String codigoMunicipio = linha[2];
                    String nomeMunicipio = linha[3];

                    Municipio municipio = new Municipio(codigoMunicipio, uf, nomeMunicipio);
                    municipioDAO.insert(connection, municipio);
                    connection.commit();
                }
                System.out.println("Municípios importados.");
            } catch (IOException | CsvValidationException e) {
                throw new RuntimeException(e);
            } finally {
                connection.rollback();
                connection.setAutoCommit(true);
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
