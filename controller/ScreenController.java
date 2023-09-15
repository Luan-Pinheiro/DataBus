package controller;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ScreenController {

  @FXML private ImageView PasseEstudante;
  @FXML private ImageView backgroundCLT;
  @FXML private ImageView backgroundESTUDANTE;
  @FXML private ImageView backgroundIDOSO;
  @FXML private ImageView botaoCadastrar;
  @FXML private ImageView botaoCadastro;
  @FXML private ImageView botaoLogin;
  @FXML private ImageView passeCLT;
  @FXML private ImageView passeIdoso;
  @FXML private Group groupCLT;
  @FXML private Group groupIDOSO;
  @FXML private Group groupCadastro01;
  @FXML private Group groupESTUDANTE;
  @FXML private Group groupInicialScreen;
  
  //ITENS CLT
  @FXML private TextField textCPFCLT;
  @FXML private TextField textEmailCLT;
  @FXML private TextField textCTPSCLT;
  @FXML private TextField textRGCLT;
  @FXML private TextField textNomeCLT;
  @FXML private TextField textNascimentoCLT;
  @FXML private TextField textTelefoneCLT;
  @FXML private TextField textSenhaCLT;
  @FXML private TextField textEnderecoCLT;
  
  //ITENS IDOSO
  @FXML private TextField textCPFIDOSO;
  @FXML private TextField textEmailIDOSO;
  @FXML private TextField textEnderecoIDOSO;
  @FXML private TextField textRGIDOSO;
  @FXML private TextField textNascimentoIDOSO;
  @FXML private TextField textNomeIDOSO;
  @FXML private TextField textSenhaIDOSO;
  @FXML private TextField textTelefoneIDOSO;
  
  // ITENS ESTUDADANTE
  @FXML private TextField textCPF;
  @FXML private TextField textEmail;
  @FXML private TextField textEndereco;
  @FXML private TextField textInstituicao;
  @FXML private TextField textMatricula;
  @FXML private TextField textNascimento;
  @FXML private TextField textNome;
  @FXML private TextField textSenha2;
  @FXML private TextField textTelefone;
  
  @FXML private TextField textUsuario;
  @FXML private TextField textSenha;
  @FXML private ImageView homeButton;
  int tipoPasse = 0;

    @FXML
    void ClickEstudante(MouseEvent event) { // Clicou no Passe Estudante
      groupCadastro01.setVisible(false);
      groupCadastro01.setDisable(true);
      groupESTUDANTE.setVisible(true);
      botaoCadastrar.setVisible(true);
      tipoPasse = 1;
    }
    @FXML
    void clickCLT(MouseEvent event) { //Clicou no Passe CLT
      groupCadastro01.setVisible(false);
      groupCadastro01.setDisable(true);
      groupCLT.setVisible(true);
      botaoCadastrar.setVisible(true);
      tipoPasse = 2;
    }
    @FXML
    void clickIdoso(MouseEvent event) { // Cliclou no Passe Idoso
      groupCadastro01.setVisible(false);
      groupCadastro01.setDisable(true);
      groupIDOSO.setVisible(true);
      botaoCadastrar.setVisible(true);
      tipoPasse = 3;
    }
    @FXML
    void clickCadastro(MouseEvent event) { // Clicou no Botao de Cadastro
      groupInicialScreen.setVisible(false);
      groupInicialScreen.setDisable(true);
      groupCadastro01.setVisible(true);
      groupCadastro01.setDisable(false);
      homeButton.setVisible(true);
    }


    
    @FXML
    void clicouBotaoCadastrar(MouseEvent event) { // Botao Cadastrar
      switch(tipoPasse){
        case 1:
        break;

        case 2:
        break;

        case 3:
        break;
      }
    }

    @FXML
    void clickLogin(MouseEvent event) {
    }

    @FXML
    void clickHomeButton(MouseEvent event) {
      groupInicialScreen.setVisible(true);
      groupInicialScreen.setDisable(false);
      groupESTUDANTE.setVisible(false);
      groupIDOSO.setVisible(false);
      groupCLT.setVisible(false);
      clearText();
      homeButton.setVisible(false);
    }

    public void clearText(){
   textCPFCLT.clear();
   textEmailCLT.clear();
   textCTPSCLT.clear();
   textRGCLT.clear();
   textNomeCLT.clear();
   textNascimentoCLT.clear();
   textTelefoneCLT.clear();
   textSenhaCLT.clear();
   textEnderecoCLT.clear();
   textCPFIDOSO.clear();
   textEmailIDOSO.clear();
   textEnderecoIDOSO.clear();
   textRGIDOSO.clear();
   textNascimentoIDOSO.clear();
   textNomeIDOSO.clear();
   textSenhaIDOSO.clear();
   textTelefoneIDOSO.clear();
   textCPF.clear();
   textEmail.clear();
   textEndereco.clear();
   textInstituicao.clear();
   textMatricula.clear();
   textNascimento.clear();
   textNome.clear();
   textSenha2.clear();
   textTelefone.clear();
    }

}
