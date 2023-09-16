package controller;
import model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ClienteController { 
  
  @FXML
  private ImageView botaoConsultarDados;
  @FXML
  private ImageView botaoConsultarRotas;
  @FXML
  private ImageView botaoRecarregar;
  
  TrocaTelas trocaTela = new TrocaTelas();

  @FXML 
  void recarregar(MouseEvent event){

  }
  
  @FXML 
  void consultarDados(MouseEvent event){
    
  }
  
  @FXML 
  void consultarRotas(MouseEvent event){
    
  }

  @FXML
  void voltarCena(MouseEvent event) { //clicou na imagem voltar
    trocaTela.changeScreen("menu"); 
  }
}
