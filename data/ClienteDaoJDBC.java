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
        try{
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sqlQuery);
            resultSet = pst.executeQuery();
            if(resultSet != null){
                clientes = new ArrayList<Cliente>();
                while(resultSet.next()){
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
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return clientes;
    }
    
    @Override
    public void createCliente(Cliente cliente, int id) {
        String sqlQuery = "insert into databus.cliente (id,senha,login,dtNasc,telefone,nome,sexo,endereço,cpf)values (?,?,?,?,?,?,?,?,?);";
        PreparedStatement pst;
        Connection connection;
        try{
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sqlQuery);
            pst.setInt(1, id);
            pst.setString(2,cliente.getSenha());
            pst.setString(3,cliente.getemail());
            pst.setDate(4,cliente.getDataNascimento());
            pst.setString(5,cliente.getTelefone());
            pst.setString(6,cliente.getNome());
            pst.setString(7,String.valueOf(cliente.getSexo()));
            pst.setString(8,cliente.getEndereco());
            pst.setString(9,cliente.getCpf());
            pst.execute();
            pst.close();
            connection.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Cliente readCliente(long id) {
        throw new UnsupportedOperationException("Unimplemented method 'readCliente'");
    }

    @Override
    public void updateCliente(Cliente Cliente) {
        throw new UnsupportedOperationException("Unimplemented method 'updateCliente'");
    }

    @Override
    public void deleteCliente(Cliente Cliente) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteCliente'");
    }
    
}
