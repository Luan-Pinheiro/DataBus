import java.util.ArrayList;

import data.ClienteDaoJDBC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.Cliente;

public class Principal extends Application {
  private static Scene telaEntrada; // Cena inicial

  @Override
  public void start(Stage stagePrimary) throws Exception {
    stagePrimary.getIcons().add(new Image("/assets/icon.png"));//Definindo icone do programa
    stagePrimary.setTitle("DataBus"); // Setando Nome na barra de pesquisa
    Parent fxmlStart = FXMLLoader.load(getClass().getResource("/view/DataBus.fxml")); // Carregamento do FXML Tela
    telaEntrada = new Scene(fxmlStart); // Definicao cena nova com o fxml carregado

    stagePrimary.setScene(telaEntrada); // setando a Cena no stage
    stagePrimary.setResizable(false); // Impossibilitando mudar tamanho da janela
    stagePrimary.show(); // mostrando o stage
  }

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
}