package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cliente;
import model.Funcionario;
import model.Passe;
import model.Rota;

public class FuncionarioDaoJDBC implements iFuncionarioDao{

  //---------------------------------- FUNCIONARIO ----------------------------------//
  @Override
  public ArrayList<Funcionario> getAllFuncionarios() {
    String sqlQuery = "select * from databus.funcionario";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    ArrayList<Funcionario> funcionarios = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        funcionarios = new ArrayList<Funcionario>();
        while (resultSet.next()) {
          Funcionario funcionario = new Funcionario();
          funcionario.setCodigoFuncionario(resultSet.getString("codigoFuncionario"));
          funcionario.setEmail(resultSet.getString("email"));
          funcionario.setSenha(resultSet.getString("senha"));
          funcionarios.add(funcionario);
        }
        resultSet.close();
        pst.close();
        connection.close();
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return funcionarios;
  }

  @Override
  public Funcionario readFuncionario(String codigoFuncionario) {
    String sqlQuery = "select * from databus.funcionario where codigoFuncionario=?";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    Funcionario funcionario = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, codigoFuncionario);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        while (resultSet.next()) {
          funcionario = new Funcionario();
          funcionario.setEmail(resultSet.getString("email"));
          funcionario.setSenha(resultSet.getString("senha"));
        }
        resultSet.close();
        pst.close();
        connection.close();
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return funcionario;
  }
  //---------------------------------- CLIENTE ----------------------------------//
  @Override
  public ArrayList<Cliente> getAllClientes() {
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
          cliente.setTelefone(resultSet.getString("telefone"));
          cliente.setCpf(resultSet.getString("cpf"));
          cliente.setDataNascimento(resultSet.getString("dtNasc"));
          cliente.setEndereco(resultSet.getString("endereco"));
          cliente.setEmail(resultSet.getString("email"));
          cliente.setNome(resultSet.getString("nome"));
          cliente.setSenha(resultSet.getString("senha"));
          cliente.setTipoPasse(resultSet.getInt("tipoPasse"));
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
  public void createCliente(Cliente cliente){
    String sqlQuery = "insert into databus.cliente (senha,email,dtNasc,telefone,nome,endereco,cpf,tipoPasse) values (?,?,?,?,?,?,?,?);";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, cliente.getSenha());
      pst.setString(2, cliente.getEmail());
      pst.setString(3, cliente.getDataNascimento());
      pst.setString(4, cliente.getTelefone());
      pst.setString(5, cliente.getNome());
      pst.setString(6, cliente.getEndereco());
      pst.setString(7, cliente.getCpf());
      pst.setInt(8, cliente.getTipoPasse());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public Cliente readCliente(String cpf) {
    String sqlQuery = "select * from databus.cliente where cpf=?";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    Cliente cliente = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, cpf);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        while (resultSet.next()) {
          cliente = new Cliente();
          cliente.setNome(resultSet.getString("nome"));
          cliente.setCpf(resultSet.getString("cpf"));
          cliente.setEmail(resultSet.getString("email"));
          cliente.setTelefone(resultSet.getString("telefone"));
          cliente.setSenha(resultSet.getString("senha"));
          cliente.setTipoPasse(resultSet.getInt("tipoPasse"));
          cliente.setEndereco(resultSet.getString("endereco"));
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
  public Cliente queryCliente(String cpf) {
    String sqlQuery = "select * from databus.cliente where cpf=?";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    Cliente cliente = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, cpf);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        while (resultSet.next()) {
          cliente = new Cliente();
          cliente.setNome(resultSet.getString("nome"));
          cliente.setCpf(resultSet.getString("cpf"));
          cliente.setTelefone(resultSet.getString("telefone"));
          cliente.setTipoPasse(resultSet.getInt("tipoPasse"));
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
  public Cliente queryAccount(String cpf) {
    String sqlQuery = "select * from databus.cliente where cpf=?";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    Cliente cliente = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, cpf);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        while (resultSet.next()) {
          cliente = new Cliente();
          cliente.setEmail(resultSet.getString("email"));
          cliente.setSenha(resultSet.getString("senha"));
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
  public Cliente queryName(String cpf){
    String sqlQuery = "select * from databus.cliente where cpf=?";
    PreparedStatement pst;
    Connection connection;
    ResultSet resultSet;
    Cliente cliente = null;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, cpf);
      resultSet = pst.executeQuery();
      if (resultSet != null) {
        while (resultSet.next()) {
          cliente = new Cliente();
          cliente.setNome(resultSet.getString("nome"));
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
    String sqlQuery = "update databus.cliente set senha=?, email=?, telefone=?, nome=?, endereco=? where cpf=?";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, cliente.getSenha());
      pst.setString(2, cliente.getEmail());
      pst.setString(3, cliente.getTelefone());
      pst.setString(4, cliente.getNome());
      pst.setString(5, cliente.getEndereco());
      pst.setString(6, cliente.getCpf());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void deleteCliente(Cliente cliente) {
    String sqlQuery = "delete from databus.cliente where cpf=?";
    PreparedStatement pst;
    Connection connection;
    try {
      connection = new ConnectionFactory().getConnection();
      pst = connection.prepareStatement(sqlQuery);
      pst.setString(1, cliente.getCpf());
      pst.execute();
      pst.close();
      connection.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
  // ---------------------------------- PASSE ---------------------------------- //
  @Override
  public void updatePasse(Passe passe) {
    String sqlQuery = "update databus.passe set validade=? numCartao=?";
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
  //---------------------------------- ROTAS ----------------------------------//
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
    String sqlQuery = "select * from databus.rotas where codigoRota=?";
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
    String sqlQuery = "update databus.rotas set codigoRota=?, ponto_partida=?, ponto_chegada=?, horario_saida=?, horario_chegada=? where codigoRota=?";
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
    String sqlQuery = "delete from databus.rotas where codigoRota=?";
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
