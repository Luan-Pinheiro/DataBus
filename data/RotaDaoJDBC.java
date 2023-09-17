package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cliente;
import model.Passe;
import model.Rota;

public class RotaDaoJDBC implements iRotaDao{

  @Override
  public ArrayList<Rota> getAllRotas() {
    String sqlQuery = "select * from databus.rotas";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    ArrayList<Rota> rotas = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        rotas = new ArrayList<Rota>();
        while (resultSet.next()) {
          Rota rota = new Rota();
          rota.setCodigoRota(resultSet.getString("codigoRota"));
          rota.setPontoPartida(resultSet.getString("ponto_partida"));
          rota.setPontoChegada(resultSet.getString("ponto_chegada"));
          rota.setHorarioSaida(resultSet.getString("horario_saida"));
          rota.setHorarioChegada(resultSet.getString("horario_chegada"));
          rotas.add(rota);
        }
        resultSet.close();
        pst.close();
        connection.close();
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return rotas;
  }

  @Override
  public void createRota(Rota rota) {
    String sqlQuery = "insert into databus.rotas (codigoRota,ponto_partida,ponto_chegada,horario_saida,horario_chegada) values (?,?,?,?,?);";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, rota.getCodigoRota());
      pst.setString(2, rota.getPontoPartida());
      pst.setString(3, rota.getPontoChegada());
      pst.setString(4, rota.getHorarioSaida());
      pst.setString(5, rota.getHorarioChegada());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public Rota readRota(String codRota) {
    String sqlQuery = "select * from databus.cliente where codigoRota=?";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    Rota rota = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, codRota);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        while (resultSet.next()) {
          rota = new Rota();
          rota.setCodigoRota(resultSet.getString("codigoRota"));
          rota.setPontoPartida(resultSet.getString("ponto_partida"));
          rota.setPontoChegada(resultSet.getString("ponto_chegada"));
          rota.setHorarioSaida(resultSet.getString("horario_saida"));
          rota.setHorarioChegada(resultSet.getString("horario_chegada"));
        }
        resultSet.close();
        pst.close();
        connection.close();
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return rota;
  }

  @Override
  public void updateRota(Rota rota) {
    String sqlQuery = "update databus.cliente set codigoRota=?, ponto_partida=?, ponto_chegada=?, horario_saida=?, horario_chegada=? where codigoRota=?";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, rota.getCodigoRota());
      pst.setString(2, rota.getPontoPartida());
      pst.setString(3, rota.getPontoChegada());
      pst.setString(4, rota.getHorarioSaida());
      pst.setString(5, rota.getHorarioChegada());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
  @Override
  public void deleteRota(Rota rota) {
    String sqlQuery = "delete from databus.cliente where codigoRota=?";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, rota.getCodigoRota());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
