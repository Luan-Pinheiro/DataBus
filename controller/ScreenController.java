package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import data.ClienteDaoJDBC;
import data.PasseDaoJDBC;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.*;

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
  @FXML
  private Group groupConsultaDados;

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

  // ITENS ESTUDADANTES
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
  private PasswordField pwdFSenha;
  @FXML
  private ImageView homeButton;
  @FXML
  private ImageView imgSeePassword;

  // Itens Cliente
  @FXML
  private ImageView botaoConsultarDados;
  @FXML
  private ImageView botaoConsultarRotas;
  @FXML
  private ImageView botaoRecarregar;
  @FXML
  private ImageView botaoVoltar;
  @FXML
  private Label nomeUsuario;
  @FXML
  private ImageView textOperacao;
  @FXML
  private Group groupCliente;
  @FXML
  private Group grupoRotas;
  @FXML
  private Label saldoCliente;
  @FXML
  private ImageView saldoIMG;
  @FXML
  private TableView<Rota> tbwRotas;

  // Labels consulta dados
  @FXML
  private Label consultaCPF;
  @FXML
  private Label consultaCTPS;
  @FXML
  private Label consultaEmail;
  @FXML
  private Label consultaIndereco;
  @FXML
  private Label consultaInstituicao;
  @FXML
  private Label consultaMatricula;
  @FXML
  private Label consultaNascimento;
  @FXML
  private Label consultaNome;
  @FXML
  private Label consultaRG;
  @FXML
  private Label consultaSenha;
  @FXML
  private Label consultaTelefone;
  @FXML
  private Label consultaCartao;

  @FXML
  private Group groupRecarga;
  @FXML
  private ImageView botaoRecarregou;
  @FXML
  private TextField valorRecarga;

  private Cliente ClienteAtual;
  private Passe passe;
  private boolean emailFlag = false;
  private boolean senhaFlag = false;
  private boolean login = false;
  ClienteDaoJDBC cDao = new ClienteDaoJDBC();
  PasseDaoJDBC pDao = new PasseDaoJDBC();

  private boolean flag = true;
  Image openedEye = new Image("./assets/eye.png");
  Image closedEye = new Image("./assets/closed_eye.png");
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
  void OnClick(MouseEvent event) {
    if (flag) {
      imgSeePassword.setImage(closedEye);
      textSenha.setText(String.valueOf(pwdFSenha.getText()));
      textSenha.setVisible(true);
      pwdFSenha.setVisible(false);
      flag = false;
    } else {
      imgSeePassword.setImage(openedEye);
      pwdFSenha.setText(String.valueOf(textSenha.getText()));
      textSenha.setVisible(false);
      pwdFSenha.setVisible(true);
      flag = true;
    }
  }

  @FXML
  void clickCLT(MouseEvent event) { // Clicou no Passe CLT
    groupCadastro01.setVisible(false);
    groupCadastro01.setDisable(true);
    groupCLT.setVisible(true);
    botaoCadastrar.setVisible(true);
    tipoPasse = 3;
  }

  @FXML
  void clickIdoso(MouseEvent event) { // Cliclou no Passe Idoso
    groupCadastro01.setVisible(false);
    groupCadastro01.setDisable(true);
    groupIDOSO.setVisible(true);
    botaoCadastrar.setVisible(true);
    tipoPasse = 2;
  }

  @FXML
  void clickCadastro(MouseEvent event) { // Clicou no Botao de Cadastro
    groupInicialScreen.setVisible(false);
    groupInicialScreen.setDisable(true);
    groupCadastro01.setVisible(true);
    groupCadastro01.setDisable(false);
    homeButton.setVisible(true);
  }

  public boolean verificaCadastro() {
    boolean verify = true;
    switch (tipoPasse){
    case 1: 
    if (!Cliente.confereNome(textNome.getText()))
      verify = false;
    if (!Cliente.confereSenha(textSenha2.getText()))
      verify = false;
    if (!Cliente.confereCpf(textCPF.getText()))
      verify = false;
    if (!Cliente.confereEmail(textEmail.getText()))
      verify = false;
    if (!Cliente.confereNumero(textTelefone.getText()))
      verify = false;
    if (!Cliente.confereEndereco(textEndereco.getText()))
      verify = false;
    if (!Cliente.confereData(textNascimento.getText()))
      verify = false;
    break;

    case 2:
    if (!Cliente.confereNome(textNomeIDOSO.getText()))
      verify = false;
    if (!Cliente.confereSenha(textSenhaIDOSO.getText()))
      verify = false;
    if (!Cliente.confereCpf(textCPFIDOSO.getText()))
      verify = false;
    if (!Cliente.confereEmail(textEmailIDOSO.getText()))
      verify = false;
    if (!Cliente.confereNumero(textTelefoneIDOSO.getText()))
      verify = false;
    if (!Cliente.confereEndereco(textEnderecoIDOSO.getText()))
      verify = false;
    if (!Cliente.confereData(textNascimentoIDOSO.getText()))
      verify = false;
    break;

    case 3:
    if (!Cliente.confereNome(textNomeCLT.getText()))
      verify = false;
    if (!Cliente.confereSenha(textSenhaCLT.getText()))
      verify = false;
    if (!Cliente.confereCpf(textCPFCLT.getText()))
      verify = false;
    if (!Cliente.confereEmail(textEmailCLT.getText()))
      verify = false;
    if (!Cliente.confereNumero(textTelefoneCLT.getText()))
      verify = false;
    if (!Cliente.confereEndereco(textEnderecoCLT.getText()))
      verify = false;
    if (!Cliente.confereData(textNascimentoCLT.getText()))
      verify = false;
    break;

    }
    return verify;
  }

  @FXML
  void clicouBotaoCadastrar(MouseEvent event) { // Botao Cadastrar
    switch (tipoPasse) {
      case 1: // Cadastro do Estudante
        if (!verificaCadastro()) {
          showCaixaAlerta(Cliente.alertas());
          Cliente.setTextAlerta("Voce digitou incorretamente os campos: ");
        } 
        else {
          ClienteAtual = new Cliente(textEmail.getText(), textSenha2.getText(), textNascimento.getText(),
              textTelefone.getText(), textNome.getText(), textEndereco.getText(), textCPF.getText(), tipoPasse);
          cDao.createCliente(ClienteAtual);
          passe = new Passe(ClienteAtual.getCpf(), textMatricula.getText(), textInstituicao.getText(), 0, "6 meses",
              ClienteAtual.getNome());
          pDao.createPasseAluno(passe);
          clickHomeButton(event);
        }
        break;

      case 2: // Cadastro do Idoso
        if (!verificaCadastro()) {
          showCaixaAlerta(Cliente.alertas());
          Cliente.setTextAlerta("Voce digitou incorretamente os campos: ");
        } 
        else {
          ClienteAtual = new Cliente(textEmailIDOSO.getText(), textSenhaIDOSO.getText(), textNascimentoIDOSO.getText(),
textTelefoneIDOSO.getText(), textNomeIDOSO.getText(), textEnderecoIDOSO.getText(), textCPFIDOSO.getText(), tipoPasse);
          cDao.createCliente(ClienteAtual);

          passe = new Passe(ClienteAtual.getCpf(), 0, "6 meses", textRGIDOSO.getText() ,ClienteAtual.getNome());
          pDao.createPasseIdoso(passe);
          clickHomeButton(event);
        }
        break;

      case 3:
        if (!verificaCadastro()) {
          showCaixaAlerta(Cliente.alertas());
          Cliente.setTextAlerta("Voce digitou incorretamente os campos: ");
        } 
        else {
          ClienteAtual = new Cliente(textEmailCLT.getText(), textSenhaCLT.getText(), textNascimentoCLT.getText(),
textTelefoneCLT.getText(), textNomeCLT.getText(), textEnderecoCLT.getText(), textCPFCLT.getText(), tipoPasse);
          cDao.createCliente(ClienteAtual);

          passe = new Passe(ClienteAtual.getCpf(), 0, "6 meses", textRGCLT.getText() , Integer.parseInt(textCTPSCLT.getText()), ClienteAtual.getNome());
          pDao.createPasseClt(passe);
          clickHomeButton(event);
        break;
    }
  }
  }

  @FXML
  void clickLogin(MouseEvent event) {
    ArrayList<Cliente> clientes = cDao.getAllClientes();
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
      if (verifyExist(cliente)) {
        Passe passe = pDao.readPasse(cliente.getCpf(), cliente.getTipoPasse());
        ClienteLogado(cliente, passe);
        break;
      }
    }
    if (!login) {
      showCaixaAlerta("Login e/ou Senha Digitados Incorretamente");
    }

  }

  public void ClienteLogado(Cliente cliente, Passe passe) {
    groupInicialScreen.setVisible(false);
    groupInicialScreen.setDisable(true);
    groupCliente.setVisible(true);
    groupCliente.setDisable(false);
    homeButton.setVisible(true);

    nomeUsuario.setText("Olá, " + cliente.getNome());

    consultaNome.setText(cliente.getNome());
    consultaCPF.setText(cliente.getCpf());
    consultaNascimento.setText(cliente.getDataNascimento());
    consultaIndereco.setText(cliente.getEndereco());
    consultaTelefone.setText(cliente.getTelefone());
    consultaEmail.setText(cliente.getemail());
    consultaSenha.setText(cliente.getSenha());
    consultaCartao.setText(passe.getNumCartao());

    switch (cliente.getTipoPasse()) {
      case 1:
        consultaMatricula.setText(passe.getNumMatricula());
        consultaInstituicao.setText(passe.getInstituicao());
        consultaRG.setText("--------------");
        consultaCTPS.setText("--------------");
        break;
      case 2:
        consultaMatricula.setText("--------------");
        consultaInstituicao.setText("--------------");
        consultaRG.setText(passe.getRg());
        consultaCTPS.setText("--------------");
        break;
      case 3:
        consultaMatricula.setText("--------------");
        consultaInstituicao.setText("--------------");
        consultaRG.setText(passe.getRg());
        consultaCTPS.setText(String.valueOf(passe.getCarteiraTrabalho()));
        break;
    }
  }

  public boolean verifyExist(Cliente cliente) {
    // VERIFICAR PSWDF E TEXTFILD DA SENHA - cunsultar cpf atraves
    String email = textUsuario.getText();
    if (pwdFSenha.getLength() < textSenha.getLength()) {
      pwdFSenha.setText(textSenha.getText());
    }
    String senha = pwdFSenha.getText();
    emailFlag = (cDao.queryAccount(cliente.getCpf()).getemail().equals(email)) ? true : false;
    if (emailFlag) {
      senhaFlag = (cDao.queryAccount(cliente.getCpf()).getSenha().equals(senha)) ? true : false;
    }
    login = (emailFlag & senhaFlag);
    System.out.println("FLAG:" + login);

    return login;
  }

  @FXML
  void clickHomeButton(MouseEvent event) {
    groupCliente.setVisible(false);
    groupCliente.setDisable(true);
    groupInicialScreen.setVisible(true);
    groupInicialScreen.setDisable(false);
    groupESTUDANTE.setVisible(false);
    groupIDOSO.setVisible(false);
    groupCLT.setVisible(false);
    clearText();
    homeButton.setVisible(false);
    groupConsultaDados.setVisible(false);
    groupConsultaDados.setDisable(true);
    grupoRotas.setVisible(false);
    grupoRotas.setDisable(true);
  }

  public void clearText() {
    pwdFSenha.clear();
    textSenha.clear();
    textUsuario.clear();
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

  public static void showCaixaAlerta(String texto) { // metodo da caixa de alerta
    Alert alert = new Alert(AlertType.WARNING);
    alert.setTitle("Aviso");
    alert.setHeaderText("Ocorreu um erro!");
    alert.setContentText(texto);

    alert.showAndWait();
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    // Verifica o tamanho dos digitos da string e caso seja o tamanho do numero
    // maximo
    // insere a pontuação adequada para a formatacao necessaria e nao permite
    // maiores quantidades que o limite
    imgSeePassword.setImage(openedEye);
    textSenha.setVisible(false);

    // Formatação Texto do Telefone
    textTelefone.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{11}")) {
        String formattedNumber = "(" + newValue.substring(0, 2) + ")" +
            newValue.substring(2, 7) + "-" +
            newValue.substring(7);
        textTelefone.setText(formattedNumber);
      }
      if (textTelefone.getLength() > 14) {
        textTelefone.setText(oldValue);
      }
    });
    textTelefoneCLT.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{11}")) {
        String formattedNumber = "(" + newValue.substring(0, 2) + ")" +
            newValue.substring(2, 7) + "-" +
            newValue.substring(7);
        textTelefoneCLT.setText(formattedNumber);
      }
      if (textTelefoneCLT.getLength() > 14) {
        textTelefoneCLT.setText(oldValue);
      }
    });
    textTelefoneIDOSO.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{11}")) {
        String formattedNumber = "(" + newValue.substring(0, 2) + ")" +
            newValue.substring(2, 7) + "-" +
            newValue.substring(7);
        textTelefoneIDOSO.setText(formattedNumber);
      }
      if (textTelefoneIDOSO.getLength() > 14) {
        textTelefoneIDOSO.setText(oldValue);
      }
    });

    // Formatacao das Datas
    textNascimento.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{8}")) {
        String formattedNumber = newValue.substring(0, 2) + "/" +
            newValue.substring(2, 4) + "/" +
            newValue.substring(4);
        textNascimento.setText(formattedNumber);
      }
      if (textNascimento.getLength() > 10) {
        textNascimento.setText(oldValue);
      }
    });
    textNascimentoCLT.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{8}")) {
        String formattedNumber = newValue.substring(0, 2) + "/" +
            newValue.substring(2, 4) + "/" +
            newValue.substring(4);
        textNascimentoCLT.setText(formattedNumber);
      }
      if (textNascimentoCLT.getLength() > 10) {
        textNascimentoCLT.setText(oldValue);
      }
    });
    textNascimentoIDOSO.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{8}")) {
        String formattedNumber = newValue.substring(0, 2) + "/" +
            newValue.substring(2, 4) + "/" +
            newValue.substring(4);
        textNascimentoIDOSO.setText(formattedNumber);
      }
      if (textNascimentoIDOSO.getLength() > 10) {
        textNascimentoIDOSO.setText(oldValue);
      }
    });
    // Formatacao dos CPFs
    textCPF.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{11}")) {
        String formattedNumber = newValue.substring(0, 3) + "." +
            newValue.substring(3, 6) + "." +
            newValue.substring(6, 9) + "-" +
            newValue.substring(9);
        textCPF.setText(formattedNumber);
      }
      if (textCPF.getLength() > 14) {
        textCPF.setText(oldValue);
      }
    });
    textCPFCLT.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{11}")) {
        String formattedNumber = newValue.substring(0, 3) + "." +
            newValue.substring(3, 6) + "." +
            newValue.substring(6, 9) + "-" +
            newValue.substring(9);
        textCPFCLT.setText(formattedNumber);
      }
      if (textCPFCLT.getLength() > 14) {
        textCPFCLT.setText(oldValue);
      }
    });
    textCPFIDOSO.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{11}")) {
        String formattedNumber = newValue.substring(0, 3) + "." +
          newValue.substring(3, 6) + "." +
          newValue.substring(6, 9) + "-" +
          newValue.substring(9);
          textCPFIDOSO.setText(formattedNumber);
      }
      if (textCPFIDOSO.getLength() > 14) {
        textCPFIDOSO.setText(oldValue);
      }
    });
  }

  @FXML
  void consultarDados(MouseEvent event) {
    saldoIMG.setVisible(false);
    saldoCliente.setVisible(false);

    botaoRecarregar.setDisable(true);
    botaoConsultarDados.setDisable(true);
    botaoConsultarRotas.setDisable(true);

    botaoRecarregar.setVisible(false);
    botaoConsultarDados.setVisible(false);
    botaoConsultarRotas.setVisible(false);
    textOperacao.setVisible(false);

    groupConsultaDados.setVisible(true);
    groupConsultaDados.setDisable(false);

    botaoVoltar.setDisable(false);
    botaoVoltar.setVisible(true);

    homeButton.setVisible(false);
  }

  @FXML
  void consultarRotas(MouseEvent event) {
    saldoIMG.setVisible(false);
    saldoCliente.setVisible(false);

    botaoRecarregar.setDisable(true);
    botaoConsultarDados.setDisable(true);
    botaoConsultarRotas.setDisable(true);

    botaoRecarregar.setVisible(false);
    botaoConsultarDados.setVisible(false);
    botaoConsultarRotas.setVisible(false);
    textOperacao.setVisible(false);

    botaoVoltar.setDisable(false);
    botaoVoltar.setVisible(true);

    grupoRotas.setVisible(true);
    grupoRotas.setDisable(false);

    homeButton.setVisible(false);
  }

  @FXML
  void recarregar(MouseEvent event) {
    saldoIMG.setVisible(false);
    saldoCliente.setVisible(false);

    botaoRecarregar.setDisable(true);
    botaoRecarregar.setVisible(false);
    botaoConsultarDados.setDisable(true);
    botaoConsultarRotas.setDisable(true);

    botaoConsultarDados.setVisible(false);
    botaoConsultarRotas.setVisible(false);
    textOperacao.setVisible(false);

    botaoVoltar.setDisable(false);
    botaoVoltar.setVisible(true);

    groupRecarga.setVisible(true);
    groupRecarga.setDisable(false);
    homeButton.setVisible(false);
  }

  @FXML
  void botaoVoltar(MouseEvent event) {
    saldoIMG.setVisible(true);
    saldoCliente.setVisible(true);

    botaoRecarregar.setDisable(false);
    botaoConsultarDados.setDisable(false);
    botaoConsultarRotas.setDisable(false);

    botaoRecarregar.setVisible(true);
    botaoConsultarDados.setVisible(true);
    botaoConsultarRotas.setVisible(true);
    textOperacao.setVisible(true);

    botaoVoltar.setDisable(true);
    botaoVoltar.setVisible(false);

    grupoRotas.setVisible(false);
    grupoRotas.setDisable(true);
    groupConsultaDados.setVisible(false);
    groupConsultaDados.setDisable(true);
    groupRecarga.setVisible(false);
    groupRecarga.setDisable(true);

    homeButton.setVisible(true);
  }

  @FXML
  void clickRecarregou(MouseEvent event) {
    String aux = valorRecarga.getText();
    boolean isNumeric = (aux != null && aux.matches("[0-9]+"));
    if(isNumeric == true){
      int Valor = Integer.parseInt(aux);
      System.out.println("Valor: "+ Valor);
    }
    else{
      System.out.println("Digite Corretamente");
    }
  }

}
