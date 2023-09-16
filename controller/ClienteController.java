package controller;

import model.*;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class ClienteController { //TESTANDO TELA
  TrocaTelas tT = new TrocaTelas();

  @FXML
  void voltarCena(MouseEvent event) { //clicou na imagem voltar
    tT.changeScreen("menu"); 
  }
}
