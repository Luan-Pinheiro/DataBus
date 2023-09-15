package controller;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
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

  //Itens Tela Cadastro02
  @FXML private ImageView botaoCadastrar;
  @FXML private TextField textMatricula;
  @FXML private TextField textCPF;
  @FXML private TextField textEmail;
  @FXML private TextField textEndereco;
  @FXML private TextField textInstituicao;
  @FXML private TextField textNascimento;
  @FXML private TextField textNome;
  @FXML private TextField textSenha2;
  @FXML private TextField textTelefone;
  @FXML private ImageView backgroundESTUDANTE;
  @FXML private Group groupESTUDANTE;
  @FXML private ImageView backgroundIDOSO;


    @FXML
    void ClickEstudante(MouseEvent event) { // Clicou no Passe Estudante
      groupCadastro01.setVisible(false);
      groupESTUDANTE.setVisible(true);
      backgroundESTUDANTE.setVisible(true);
      textInstituicao.setVisible(true);
    }

    @FXML
    void clickCLT(MouseEvent event) { //Clicou no Passe CLT
      groupCadastro01.setVisible(false);
    }

    @FXML
    void clickCadastro(MouseEvent event) { // Clicou no Botao de Cadastro
      groupInicialScreen.setVisible(false);
      groupInicialScreen.setDisable(true);
      groupCadastro01.setVisible(true);
    }

    @FXML
    void clickIdoso(MouseEvent event) { // Cliclou no Passe Idoso
      groupCadastro01.setVisible(false);
    }

    
    @FXML
    void clicouBotaoCadastrar(MouseEvent event) { // Botao Cadastrar

    }

    @FXML
    void clickLogin(MouseEvent event) {
    }

}
