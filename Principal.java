import java.util.ArrayList;
import data.ClienteDaoJDBC;
import javafx.application.Application;
import javafx.stage.Stage;
import model.*;

public class Principal extends Application{
  public static void main(String[] args) {
    //TESTE DO DAO ABAIXO, JA FUNCIONOU, SO COMENTEI PQ ESVAZIOU O BANCO COM OS DELETES
    /*
    ClienteDaoJDBC teste= new ClienteDaoJDBC();
    ArrayList<Cliente> clientes = teste.getAllClientes();
    for (Cliente cliente : clientes) {
      System.out.println("______________________________\n");
      System.out.println(cliente.getNome());
      System.out.println(cliente.getEndereco());
      System.out.println(cliente.getemail());
      System.out.println(cliente.getDataNascimento());
    }
    teste.deleteCliente(clientes.get(0));
    System.out.println("************\n***DELETOU UM***\n************");
    for (Cliente cliente : clientes) {
      System.out.println("______________________________\n");
      System.out.println(cliente.getNome());
      System.out.println(cliente.getEndereco());
      System.out.println(cliente.getemail());
      System.out.println(cliente.getDataNascimento());
    }
    System.out.println("************\n***Lendo o cliente na ultima posicao do array***\n************");
    System.out.println(teste.readCliente(clientes.size()-1));
     */

    launch(args);
  }
  @Override
  public void start(Stage primaryStage) throws Exception {
    TrocaTelas trocaTelas = new TrocaTelas();
    trocaTelas.start(primaryStage);
  }
}