package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.Cliente;

public class ScreenController implements Initializable {

  @FXML
  private ImageView PasseEstudante;
  @FXML
  private ImageView backgroundCLT;
  @FXML
  private ImageView backgroundESTUDANTE;
  @FXML
  private ImageView backgroundIDOSO;
  @FXML
  private ImageView botaoCadastrar;
  @FXML
  private ImageView botaoCadastro;
  @FXML
  private ImageView botaoLogin;
  @FXML
  private ImageView passeCLT;
  @FXML
  private ImageView passeIdoso;
  @FXML
  private Group groupCLT;
  @FXML
  private Group groupIDOSO;
  @FXML
  private Group groupCadastro01;
  @FXML
  private Group groupESTUDANTE;
  @FXML
  private Group groupInicialScreen;

  // ITENS CLT
  @FXML
  private TextField textCPFCLT;
  @FXML
  private TextField textEmailCLT;
  @FXML
  private TextField textCTPSCLT;
  @FXML
  private TextField textRGCLT;
  @FXML
  private TextField textNomeCLT;
  @FXML
  private TextField textNascimentoCLT;
  @FXML
  private TextField textTelefoneCLT;
  @FXML
  private TextField textSenhaCLT;
  @FXML
  private TextField textEnderecoCLT;

  // ITENS IDOSO
  @FXML
  private TextField textCPFIDOSO;
  @FXML
  private TextField textEmailIDOSO;
  @FXML
  private TextField textEnderecoIDOSO;
  @FXML
  private TextField textRGIDOSO;
  @FXML
  private TextField textNascimentoIDOSO;
  @FXML
  private TextField textNomeIDOSO;
  @FXML
  private TextField textSenhaIDOSO;
  @FXML
  private TextField textTelefoneIDOSO;

  // ITENS ESTUDADANTE
  @FXML
  private TextField textCPF;
  @FXML
  private TextField textEmail;
  @FXML
  private TextField textEndereco;
  @FXML
  private TextField textInstituicao;
  @FXML
  private TextField textMatricula;
  @FXML
  private TextField textNascimento;
  @FXML
  private TextField textNome;
  @FXML
  private TextField textSenha2;
  @FXML
  private TextField textTelefone;

  @FXML
  private TextField textUsuario;
  @FXML
  private TextField textSenha;
  @FXML
  private ImageView homeButton;
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
  void clickCLT(MouseEvent event) { // Clicou no Passe CLT
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
        //System.out.println( Cliente.confereNome(textNome.getText()));
       //System.out.println( Cliente.confereSenha(textSenha2.getText()));
       //System.out.println(Cliente.confereCpf(textCPF.getText()));
       //System.out.println(Cliente.confereEmail(textEmail.getText()));
        System.out.println(Cliente.confereNumero(textTelefone.getText()));
        break;

      case 2:
       //System.out.println(Cliente.confereNome(textNomeCLT.getText()));
       //System.out.println(Cliente.confereSenha(textSenhaCLT.getText()));
       //System.out.println(Cliente.confereCpf(textCPFCLT.getText()));
       //System.out.println(Cliente.confereEmail(textEmailCLT.getText()));
       //System.out.println(cliente.confereNumero(textTelefoneCLT.getText()));
       //System.out.println(Cliente.confereEndereco(textEnderecoCLT.getText()));
       //System.out.println(cliente.confereData(textNascimentoCLT.getText()));
        break;

      case 3:
       //System.out.println(Cliente.confereNome(textNomeIDOSO.getText()));
       //System.out.println(Cliente.confereSenha(textSenhaIDOSO.getText()));
       //System.out.println(Cliente.confereCpf(textCPFIDOSO.getText()));
       //System.out.println(Cliente.confereEmail(textEmailIDOSO.getText()));
       //System.out.println(cliente.confereNumero(textTelefoneIDOSO.getText()));
       //System.out.println(Cliente.confereEndereco(textEnderecoIDOSO.getText()));
       //System.out.println(cliente.confereData(textNascimentoIDOSO.getText()));
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

  private void showCaixaAlerta() { // metodo da caixa de alerta
    Alert alert = new Alert(AlertType.WARNING);
    alert.setTitle("Aviso");
    alert.setHeaderText("Digite alguma coisa!");
    alert.setContentText("Para enviar uma mensagem voce deve digitar algo bacana primeiro :)   ");

    alert.showAndWait();
  }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      // Formatação Texto do Telefone
      textTelefone.textProperty().addListener((observable, oldValue, newValue) -> {
        if (newValue.matches("\\d{11}")) {
          String formattedNumber = "(" + newValue.substring(0, 2) + ")" +
          newValue.substring(2, 7) + "-" +
          newValue.substring(7);
          textTelefone.setText(formattedNumber);
      }
      if (textTelefone.getLength() > 14){
        textTelefone.setText(oldValue);
      }
    });
  }

}
