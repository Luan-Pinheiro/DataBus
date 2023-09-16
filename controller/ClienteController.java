package controller;

import model.*;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ClienteController implements Initializable{ //TESTANDO TELA
  @FXML
  private ImageView botaoConsultarDados;

  @FXML
  private ImageView botaoConsultarRotas;

  @FXML
  private ImageView botaoRecarregar;

  @FXML
  private ImageView botaoVoltar;

  @FXML
  private ImageView homeButton;

  @FXML
  private ImageView textOperacao;

  TrocaTelas trocaTela = new TrocaTelas();

  @FXML
  void consultarDados(MouseEvent event) {
    botaoRecarregar.setDisable(true);
    botaoConsultarDados.setDisable(true);
    botaoConsultarRotas.setDisable(true);

    botaoRecarregar.setVisible(false);
    botaoConsultarDados.setVisible(false);
    botaoConsultarRotas.setVisible(false);
    textOperacao.setVisible(false);

    botaoVoltar.setDisable(false);
    botaoVoltar.setVisible(true);
  }

  @FXML
  void consultarRotas(MouseEvent event) {
    botaoRecarregar.setDisable(true);
    botaoConsultarDados.setDisable(true);
    botaoConsultarRotas.setDisable(true);

    botaoRecarregar.setVisible(false);
    botaoConsultarDados.setVisible(false);
    botaoConsultarRotas.setVisible(false);
    textOperacao.setVisible(false);

    botaoVoltar.setDisable(false);
    botaoVoltar.setVisible(true);
  }

  @FXML
  void recarregar(MouseEvent event) {
    botaoRecarregar.setDisable(true);
    botaoConsultarDados.setDisable(true);
    botaoConsultarRotas.setDisable(true);

    botaoRecarregar.setVisible(false);
    botaoConsultarDados.setVisible(false);
    botaoConsultarRotas.setVisible(false);
    textOperacao.setVisible(false);

    botaoVoltar.setDisable(false);
    botaoVoltar.setVisible(true);
  }
  
  @FXML
  void voltarCena(MouseEvent event) { //clicou na imagem voltar
    trocaTela.changeScreen("menu"); 
  }

  @FXML
  void botaoVoltar(MouseEvent event) { 
    botaoRecarregar.setDisable(false);
    botaoConsultarDados.setDisable(false);
    botaoConsultarRotas.setDisable(false);

    botaoRecarregar.setVisible(true);
    botaoConsultarDados.setVisible(true);
    botaoConsultarRotas.setVisible(true);
    textOperacao.setVisible(true);

    botaoVoltar.setDisable(true);
    botaoVoltar.setVisible(false);
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    botaoVoltar.setDisable(true);
    botaoVoltar.setVisible(false);
  }
}
