package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TrocaTelas extends Application{
  private static Stage stage;
  private static Scene telaEntrada; // Cena inicial
  private static Scene telaCliente; // Cena cliente

  @Override
  public void start(Stage stagePrimary) throws Exception {
    stage = stagePrimary;

    stagePrimary.getIcons().add(new Image("/assets/icon.png")); //Definindo icone do programa
    stagePrimary.setTitle("DataBus"); // Setando Nome na barra de pesquisa

    Parent fxmlStart = FXMLLoader.load(getClass().getResource("/view/DataBus.fxml")); // Carregamento do FXML Tela
    telaEntrada = new Scene(fxmlStart); // Definicao cena nova com o fxml carregado

    Parent fxmlCliente = FXMLLoader.load(getClass().getResource("/view/Cliente.fxml"));
    telaCliente = new Scene(fxmlCliente); 

    stagePrimary.setScene(telaEntrada); // setando a Cena no stage
    stagePrimary.setResizable(false); // Impossibilitando mudar tamanho da janela
    stagePrimary.show(); // mostrando o stage
  }
  
  public void changeScreen(String source){
    switch(source){
      case "menu": //caso usuario queira voltar para o menu
        stage.setScene(telaEntrada);
        break;
      case "cliente":
        stage.setScene(telaCliente);
        break;
    }
  }
}
