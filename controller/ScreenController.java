package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ScreenController implements Initializable {

  // Itens Tela Inicial
    @FXML private ImageView botaoCadastro;
    @FXML private ImageView botaoLogin;
    @FXML private TextField textSenha;
    @FXML private TextField textUsuario;

    @FXML
    void clickLogin(MouseEvent event) {
      
    }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
  }

}
