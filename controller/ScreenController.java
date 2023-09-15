package controller;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ScreenController {

  // Itens do Inicio
  @FXML private ImageView botaoCadastro;
  @FXML private ImageView botaoLogin;
  @FXML private Group groupInicialScreen;
  @FXML private TextField textSenha;
  @FXML private TextField textUsuario;

  // Itens Tela Cadastro01
  @FXML private Group groupCadastro01;
  @FXML private ImageView PasseEstudante;
  @FXML private ImageView passeCLT;
  @FXML private ImageView passeIdoso;

    @FXML
    void ClickEstudante(MouseEvent event) { // Clicou no Passe Estudante
      groupCadastro01.setVisible(false);
    }

    @FXML
    void clickCLT(MouseEvent event) { //Clicou no Passe CLT
      groupCadastro01.setVisible(false);
    }

    @FXML
    void clickCadastro(MouseEvent event) { // Clicou no Botao de Cadastro
      groupInicialScreen.setVisible(false);
      groupInicialScreen.setDisable(true);
    }

    @FXML
    void clickIdoso(MouseEvent event) { // Cliclou no Passe Idoso
      groupCadastro01.setVisible(false);
    }

    @FXML
    void clickLogin(MouseEvent event) {
    }

}
