import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import controller.ScreenController; // Import Necessário para Compilação do Projet

public class Principal extends Application {
  private static Scene telaEntrada; // Cena inicial

  @Override
  public void start(Stage stagePrimary) throws Exception {
    stagePrimary.getIcons().add(new Image("./assets/icon.png"));//Definindo icone do programa

    stagePrimary.setTitle("DataBus"); // Setando Nome na barra de pesquisa
    Parent fxmlStart = FXMLLoader.load(getClass().getResource("view/DataBus.fxml")); // Carregamento do FXML Tela
    telaEntrada = new Scene(fxmlStart); // Definicao cena nova com o fxml carregado

    stagePrimary.setScene(telaEntrada); // setando a Cena no stage
    stagePrimary.setResizable(false); // Impossibilitando mudar tamanho da janela
    stagePrimary.show(); // mostrando o stage
  }
  public static void main(String[] args) {
    new ScreenController();
    launch(args);
  }
}