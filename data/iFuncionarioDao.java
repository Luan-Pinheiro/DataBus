package data;

import java.util.ArrayList;

import model.Cliente;
import model.Funcionario;
import model.Passe;
import model.Rota;

public interface iFuncionarioDao {
  ArrayList<Funcionario> getAllFuncionarios();
  Funcionario readFuncionario(String codigoFuncionario);
  ArrayList<Cliente> getAllClientes();
  void createCliente (Cliente cliente);
  Cliente readCliente (String cpf);
  void updateCliente (Cliente cliente);
  void deleteCliente (Cliente cliente);
  Cliente queryAccount (String cpf);
  Cliente queryName(String cpf);
  void updatePasse (Passe passe);
  void deletePasse(Passe passe);
  ArrayList<Rota> getAllRotas();
  void createRota (Rota rota);
  Rota readRota (String codRota);
  void updateRota (Rota rota);
  void deleteRota (Rota rota);
}
