package com.github.gabrielsilper;

import com.github.gabrielsilper.daos.PopulacaoDAO;
import com.github.gabrielsilper.daos.PopulacaoIdadeDAO;
import com.github.gabrielsilper.db.DatabaseConnection;
import com.github.gabrielsilper.models.PopulacaoPorFaixaEtaria;
import com.github.gabrielsilper.models.PopulacaoTotal;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class PopulacaoFaixaEtariaMain {
    public static void main(String[] args) {
        String caminho = "C:\\Users\\Elias Dev\\tratamento-dados-DAD\\populacao_idade.csv";
        PopulacaoIdadeDAO populacaoIdadeDAO = new PopulacaoIdadeDAO();

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
                    String codigoMunicipio = linha[0];
                    String Qtd0A10 = linha[3];
                    String Qtd11A20 = linha[4];
                    String Qtd21A30 = linha[5];
                    String Qtd31A40 = linha[6];
                    String Qtd41MAIS = linha[7];

                    PopulacaoPorFaixaEtaria populacaoPorFaixaEtaria = new PopulacaoPorFaixaEtaria(codigoMunicipio, Qtd0A10, Qtd11A20, Qtd21A30, Qtd31A40, Qtd41MAIS);
                    populacaoIdadeDAO.insert(connection, populacaoPorFaixaEtaria);
                    connection.commit();
                }
                System.out.println("Populações por faixa etária importadas.");
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
