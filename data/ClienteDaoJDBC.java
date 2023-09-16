package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

public class ClienteDaoJDBC implements iClienteDao {

  @Override
  public ArrayList<Cliente> getAllClientes() {
    // Linkar valores com a interface
    String sqlQuery = "select * from databus.cliente";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    ArrayList<Cliente> clientes = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        clientes = new ArrayList<Cliente>();
        while (resultSet.next()) {
          Cliente cliente = new Cliente();
          cliente.setIdentificador(resultSet.getInt("identificador"));
          cliente.setTelefone(resultSet.getString("telefone"));
          cliente.setCpf(resultSet.getString("cpf"));
          cliente.setDataNascimento(resultSet.getDate("dtNasc"));
          cliente.setEndereco(resultSet.getString("endereço"));
          cliente.setEmail(resultSet.getString("login"));
          cliente.setNome(resultSet.getString("nome"));
          cliente.setSenha(resultSet.getString("senha"));
          clientes.add(cliente);
        }
        resultSet.close();
        pst.close();
        connection.close();
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return clientes;
  }

  @Override
  public void createCliente(Cliente cliente, int id) {
    String sqlQuery = "insert into databus.cliente (id,senha,login,dtNasc,telefone,nome,sexo,endereço,cpf)values (?,?,?,?,?,?,?,?,?);";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setInt(1, cliente.getIdentificador());
      pst.setString(2, cliente.getSenha());
      pst.setString(3, cliente.getemail());
      pst.setDate(4, cliente.getDataNascimento());
      pst.setString(5, cliente.getTelefone());
      pst.setString(6, cliente.getNome());
      pst.setString(7, String.valueOf(cliente.getSexo()));
      pst.setString(8, cliente.getEndereco());
      pst.setString(9, cliente.getCpf());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public Cliente readCliente(long id) {
    String sqlQuery = "select * from databus.cliente where id = ?";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    Cliente cliente = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setLong(3, id);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        while (resultSet.next()) {
          cliente = new Cliente();
          cliente.setIdentificador(resultSet.getInt("identidicador"));
          cliente.setNome(resultSet.getString("nome"));
          cliente.setCpf(resultSet.getString("cpf"));
          cliente.setTelefone(resultSet.getString("telefone"));
          cliente.setEndereco(resultSet.getString("endereço"));
        }
        resultSet.close();
        pst.close();
        connection.close();
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return cliente;
  }

  @Override
  public void updateCliente(Cliente cliente) {
    String sqlQuery = "update databus.cliente set senha=?, login=?, telefone=?, nome=?, endereço=? where id=?";
    PreparedStatement pst;
    Connection connection;
    //
    //
    // CONFERIR parameterINDEX
    //
    //
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(2, cliente.getSenha());
      pst.setString(3, cliente.getemail());
      pst.setString(5, cliente.getTelefone());
      pst.setString(6, cliente.getNome());
      pst.setString(8, cliente.getEndereco());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void deleteCliente(Cliente cliente) {
    String sqlQuery = "delete from databus.cliente where id=?";
    PreparedStatement pst;
    Connection connection;
    //
    //
    // CONFERIR parameterINDEX
    //
    //
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setLong(1, cliente.getIdentificador());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

}
