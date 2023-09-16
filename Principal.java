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
    ClienteDaoJDBC teste= new ClienteDaoJDBC();
    ArrayList<Cliente> clientes = teste.getAllClientes();
    for (Cliente cliente : clientes) {
      System.out.println("______________________________\n");
      System.out.println(cliente.getNome());
      System.out.println(cliente.getEndereco());
      System.out.println(cliente.getemail());
      System.out.println(cliente.getDataNascimento());
    }
    launch(args);
  }
}