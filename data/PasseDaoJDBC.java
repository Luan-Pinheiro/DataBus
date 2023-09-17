package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Passe;

public class PasseDaoJDBC implements iPasseDao {

  @Override
  public ArrayList<Passe> getAllPasses() {
    String sqlQuery = "select * from databus.passe";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    ArrayList<Passe> passes = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        passes = new ArrayList<Passe>();
        while (resultSet.next()) {
          Passe passe = new Passe();
          passe.setNumCartao(resultSet.getString("numPasse"));
          passe.setSaldo(resultSet.getFloat("saldo"));
          passe.setValidade(resultSet.getString("validade"));
          passe.setCpfCliente(resultSet.getString("idCliente"));
          passes.add(passe);
        }
        resultSet.close();
        pst.close();
        connection.close();
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return passes;
  }

  @Override
  public void createPasse(Passe passe) {
    String sqlQuery = "insert into databus.passe (numCartao,saldo,validade,cpf,nome) values (?,?,?,?,?);";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, passe.getNumCartao());
      pst.setFloat(2, passe.getSaldo());
      pst.setString(3, passe.getValidade());
      pst.setString(4, passe.getCpfCliente());
      pst.setString(5, passe.getNomeCliente());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void createPasseAluno(Passe passe) {
    String sqlQuery = "insert into databus.passeAluno (cpf,matricula,instituicao,numPasse) values (?,?,?,?);";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, passe.getCpfCliente());
      pst.setString(2, passe.getNumMatricula());
      pst.setString(3, passe.getInstituicao());
      pst.setString(4, passe.getNumCartao());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void createPasseIdoso(Passe passe) {
    String sqlQuery = "insert into databus.passeIdoso (rg,numPasse) values (?,?);";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, passe.getRg());
      pst.setString(2, passe.getNumCartao());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void createPasseClt(Passe passe) {
    String sqlQuery = "insert into databus.passeClt (cpf,ctps,numPasse) values (?,?,?);";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, passe.getCpfCliente());
      pst.setInt(2, passe.getCarteiraTrabalho());
      pst.setString(3, passe.getNumCartao());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public Passe readPasse(String numCartao) {
    String sqlQuery = "select * from databus.passe where numCartao=?";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    Passe passe = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, numCartao);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        while (resultSet.next()) {
          passe = new Passe();
          passe.setNumCartao(resultSet.getString("numCartao"));
          passe.setSaldo(resultSet.getFloat("saldo"));
          passe.setValidade(resultSet.getString("validade"));
          passe.setCpfCliente(resultSet.getString("idCliente"));
          passe.setNomeCliente(resultSet.getString("nome"));
        }
        resultSet.close();
        pst.close();
        connection.close();
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return passe;
  }

  @Override
  public void updatePasse(Passe passe) {
    String sqlQuery = "update databus.passe set saldo=?, validade=? numCartao=?";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setFloat(2, passe.getSaldo());
      pst.setString(3, passe.getValidade());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void deletePasse(Passe passe) {
    String sqlQuery = "delete from databus.passe where numCartao=?";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, passe.getNumCartao());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
