package controller;

import model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class TesteController { //TESTANDO TELA
  TrocaTelas tT = new TrocaTelas();

  @FXML
  void voltarCena(MouseEvent event) { //clicou na imagem voltar
    trocaTela.changeScreen("menu"); 
  }
}
