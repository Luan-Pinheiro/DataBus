package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

import data.ClienteDaoJDBC;
import data.FuncionarioDaoJDBC;
import data.PasseDaoJDBC;
import data.RotaDaoJDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
  private ImageView botaoSalvar;
  @FXML
  private ImageView passeCLT;
  @FXML
  private ImageView passeIdoso;
  @FXML
  private ImageView botaoListarClientes;
  @FXML
  private ImageView botaoBuscarCliente;
  @FXML
  private ImageView botaoGerenciarCliente;
  @FXML
  private ImageView botaoBuscarRota;
  @FXML
  private ImageView botaoGerenciarRotas;
  @FXML
  private ImageView botaoFuncionario;
  @FXML
  private ImageView botaoBuscar;
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
  private Group groupFuncionario;
  @FXML
  private Group groupBuscarCliente;
  @FXML
  private Group groupGerenciarCliente;
  @FXML
  private Label saldoCliente;
  @FXML
  private ImageView saldoIMG;
  @FXML
  private ImageView textOperacaoFuncionario;
  // Tabela de rotas
  @FXML
  private TableView<Rota> tbwRotas;
  @FXML
  private TableColumn<Rota, String> codRota;
  @FXML
  private TableColumn<Rota, String> pSaida;
  @FXML
  private TableColumn<Rota, String> pChegada;
  @FXML
  private TableColumn<Rota, String> hour;
  @FXML
  private TableColumn<Rota, String> hour1;
  @FXML
  private TableView<Cliente> tbwClientes1;
  @FXML
  private TableView<Cliente> tbwClientes2;
  @FXML
  private TableColumn<Cliente, String> tCpf;
  @FXML
  private TableColumn<Cliente, String> tEmail;
  @FXML
  private TableColumn<Cliente, String> tEndereco;
  @FXML
  private TableColumn<Cliente, String> tNome;
  @FXML
  private TableColumn<Cliente, String> tPasse;
  @FXML
  private TableColumn<Cliente, String> tSenha;
  @FXML
  private TableColumn<Cliente, String> tTelefone;
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
  @FXML
  private TextField funcionarioBuscarCliente;
  @FXML
  private TextField editarEmail;
  @FXML
  private TextField editarEndereco;
  @FXML
  private TextField editarNome;
  @FXML
  private TextField editarSenha;
  @FXML
  private TextField editarTelefone;
  @FXML
  private TextField editarCliente;
   @FXML
  private ImageView IMGmodofuncionario;

  private Cliente ClienteAtual;
  private Passe passe;
  private boolean emailFlag = false;
  private boolean senhaFlag = false;
  private boolean login = false;
  FuncionarioDaoJDBC fDao = new FuncionarioDaoJDBC();
  ClienteDaoJDBC cDao = new ClienteDaoJDBC();
  PasseDaoJDBC pDao = new PasseDaoJDBC();
  private boolean funcionarioFlag = false;
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
    switch (tipoPasse) {
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

  public boolean verificaCadastroPasse() {
    boolean verify = true;
    switch (tipoPasse) {
      case 1:
        if (!Passe.confereNumMatricula(textMatricula.getText()))
          verify = false;
        break;
      case 2:
        if (!Passe.confereRg(textRGIDOSO.getText()))
          verify = false;
        break;

      case 3:
        if (!Passe.confereRg(textRGCLT.getText()))
          verify = false;
        if (!Passe.confereCtps(textCTPSCLT.getText()))
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
        } else {
          if (verificaCadastroPasse()) {
            ClienteAtual = new Cliente(textEmail.getText(), textSenha2.getText(), textNascimento.getText(), textTelefone.getText(), textNome.getText(), textEndereco.getText(), textCPF.getText(), tipoPasse);
            cDao.createCliente(ClienteAtual);
            passe = new Passe(ClienteAtual.getCpf(), textMatricula.getText(), textInstituicao.getText(), 0, "6 meses", ClienteAtual.getNome());
            pDao.createPasseAluno(passe);
            clickHomeButton(event);
          } else {
            showCaixaAlerta(Passe.alertas());
            Passe.setTextAlerta("Voce digitou incorretamente os campos: ");
          }
        }
        break;

      case 2: // Cadastro do Idoso
        if (!verificaCadastro()) {
          showCaixaAlerta(Cliente.alertas());
          Cliente.setTextAlerta("Voce digitou incorretamente os campos: ");
        } else {
          if (verificaCadastroPasse()) {
            ClienteAtual = new Cliente(textEmailIDOSO.getText(), textSenhaIDOSO.getText(),textNascimentoIDOSO.getText(), textTelefoneIDOSO.getText(), textNomeIDOSO.getText(), textEnderecoIDOSO.getText(), textCPFIDOSO.getText(), tipoPasse);
            cDao.createCliente(ClienteAtual);
            passe = new Passe(ClienteAtual.getCpf(), 0, "6 meses", textRGIDOSO.getText(), ClienteAtual.getNome());
            pDao.createPasseIdoso(passe);
            clickHomeButton(event);
          } else {
            showCaixaAlerta(Passe.alertas());
            Passe.setTextAlerta("Voce digitou incorretamente os campos: ");
          }
        }
        break;

      case 3:
        if (!verificaCadastro()) {
          showCaixaAlerta(Cliente.alertas());
          Cliente.setTextAlerta("Voce digitou incorretamente os campos: ");
        } else {
          if (verificaCadastroPasse()) {
            ClienteAtual = new Cliente(textEmailCLT.getText(), textSenhaCLT.getText(), textNascimentoCLT.getText(),
                textTelefoneCLT.getText(), textNomeCLT.getText(), textEnderecoCLT.getText(), textCPFCLT.getText(),
                tipoPasse);
            cDao.createCliente(ClienteAtual);

            passe = new Passe(ClienteAtual.getCpf(), 0, "6 meses", textRGCLT.getText(), Integer.parseInt(Passe.ctpsSemBarra(textCTPSCLT.getText())), ClienteAtual.getNome());
            pDao.createPasseClt(passe);
            clickHomeButton(event);
          } else {
            showCaixaAlerta(Passe.alertas());
            Passe.setTextAlerta("Voce digitou incorretamente os campos: ");
          }
        }

        break;
    }
  }

  @FXML
  void clickLogin(MouseEvent event) {
    if(funcionarioFlag){
    ArrayList<Funcionario> funcionarios = fDao.getAllFuncionarios();
    for (Funcionario funcionario : funcionarios) {
      if (isInDatabase(funcionario)) {
        funcionarioLogado(funcionario);
        System.out.println("foi");
        break;
      }
    }
    if (!login) {
      showCaixaAlerta("Login e/ou Senha Digitados Incorretamente");
    }
    }else{
      ArrayList<Cliente> clientes = cDao.getAllClientes();
      for (Cliente cliente : clientes) {
        if (verifyExist(cliente)) {
          Passe passeAUX = pDao.readPasse(cliente.getCpf(), cliente.getTipoPasse());
          passe = passeAUX;
          ClienteAtual = cliente;
          ClienteLogado(cliente, passeAUX);
          break;
        }
      }
      if (!login) {
        showCaixaAlerta("Login e/ou Senha Digitados Incorretamente");
      }
    }
  }

  @FXML
  void buscarCliente(MouseEvent event) {
    groupFuncionario.setVisible(false);
    groupFuncionario.setDisable(true);

    groupBuscarCliente.setVisible(true);

    botaoBuscar.setVisible(true);
    botaoBuscar.setDisable(false);

    botaoVoltar.setVisible(true);
    botaoVoltar.setDisable(false);
  }

  @FXML
  void buscarRota(MouseEvent event) {

  }

  @FXML
  void gerenciarCliente(MouseEvent event) {
    groupFuncionario.setVisible(false);
    groupFuncionario.setDisable(true);

    groupGerenciarCliente.setVisible(true);
    groupGerenciarCliente.setDisable(false);

  }

  @FXML
  void gerenciarRotas(MouseEvent event) {

  }

  @FXML
  void buscarCpfCliente(MouseEvent event) {
    //if(!funcionarioBuscarCliente.getText().isEmpty()){
      System.out.println("BUSCOU A PICA");
      //showClient(funcionarioBuscarCliente.getText());
    //}
  }

  @FXML
  void salvarDadosEditados(MouseEvent event) {

  }

  @FXML
  void listarClientes(MouseEvent event) {
    botaoListarClientes.setVisible(false);
    botaoListarClientes.setDisable(true);
    botaoBuscarCliente.setVisible(false);
    botaoBuscarCliente.setDisable(true);
    botaoGerenciarCliente.setVisible(false);
    botaoGerenciarCliente.setDisable(true);
    botaoGerenciarRotas.setVisible(false);
    botaoGerenciarRotas.setDisable(true);
    botaoBuscarRota.setVisible(false);
    botaoBuscarRota.setDisable(true);
    textOperacaoFuncionario.setVisible(false);

    botaoVoltar.setVisible(true);
    botaoVoltar.setDisable(false);
  }

  @FXML
  void funcionarioMode(MouseEvent event) {
    funcionarioFlag = !funcionarioFlag;
    IMGmodofuncionario.setVisible(!IMGmodofuncionario.isVisible());
  }

  public void ClienteLogado(Cliente cliente, Passe passe) {
    showRoutesTable();
    botaoFuncionario.setVisible(false);
    groupInicialScreen.setVisible(false);
    groupInicialScreen.setDisable(true);
    groupCliente.setVisible(true);
    groupCliente.setDisable(false);
    homeButton.setVisible(true);

    nomeUsuario.setText("Olá, " + cliente.getNome());
    saldoCliente.setText("R$ "+ passe.getSaldo());

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
  public void funcionarioLogado(Funcionario funcionario) {
    showRoutesTable();
    botaoFuncionario.setVisible(false);
    groupInicialScreen.setVisible(false);
    groupInicialScreen.setDisable(true);
    groupCliente.setVisible(true);
    groupCliente.setDisable(false);
    homeButton.setVisible(true);
    groupFuncionario.setVisible(true);
  }

  public void showClientsTable() {
    FuncionarioDaoJDBC fDaoJDBC = new FuncionarioDaoJDBC();
    ArrayList<Cliente> clientes = fDaoJDBC.getAllClientes();
    // criando lista observável para ser exibida no table view
    ObservableList<Cliente> auxList = FXCollections.observableArrayList(clientes);
    tCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
    tEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
    tEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
    tNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    tPasse.setCellValueFactory(new PropertyValueFactory<>("tipoPasse"));
    tSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));
    tTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
    for (Cliente cliente : clientes) {
      Cliente clienteAux = fDaoJDBC.readCliente(cliente.getCpf());
      auxList.add(clienteAux);
    }
    tbwClientes1.setItems(auxList);
    tbwClientes2.setItems(auxList);
  }

  public void showClient(String cpf) {
    FuncionarioDaoJDBC fDaoJDBC = new FuncionarioDaoJDBC();
    Cliente cliente = fDaoJDBC.readCliente(cpf);
    // criando lista observável para ser exibida no table view
    ObservableList<Cliente> auxList = FXCollections.observableArrayList();
    tCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
    tEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
    tEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
    tNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    tPasse.setCellValueFactory(new PropertyValueFactory<>("tipoPasse"));
    tSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));
    tTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
    auxList.add(cliente);
    tbwClientes1.setItems(auxList);
    tbwClientes2.setItems(auxList);
  }

  public void showRoutesTable() {
    RotaDaoJDBC RDao = new RotaDaoJDBC();
    ArrayList<Rota> rotas = RDao.getAllRotas();
    System.out.println("TAMNHO DO ARRAY DE ROTAS: " + rotas.size());
    // criando lista observável para ser exibida no table view
    ObservableList<Rota> auxList = FXCollections.observableArrayList(rotas);
    codRota.setCellValueFactory(new PropertyValueFactory<>("codigoRota"));
    pSaida.setCellValueFactory(new PropertyValueFactory<>("pontoPartida"));
    pChegada.setCellValueFactory(new PropertyValueFactory<>("pontoChegada"));
    hour.setCellValueFactory(new PropertyValueFactory<>("horarioSaida"));
    hour1.setCellValueFactory(new PropertyValueFactory<>("horarioChegada"));
    for (Rota rota : rotas) {
      Rota rotaAux = RDao.readRota(rota.getCodigoRota());
      // Inserindo na lista
      auxList.add(rotaAux);
    }
    // Inserindo na tabela
    tbwRotas.setItems(auxList);
  }

  public boolean isInDatabase(Funcionario funcionario) {
    String email = textUsuario.getText();
    if (pwdFSenha.getLength() < textSenha.getLength()) {
      pwdFSenha.setText(textSenha.getText());
    } else if (textSenha.getLength() < pwdFSenha.getLength()) {
      textSenha.setText(pwdFSenha.getText());
    }
    String senha = pwdFSenha.getText();
    emailFlag = (fDao.readFuncionario(funcionario.getCodigoFuncionario()).getEmail().equals(email)) ? true : false;
    if (emailFlag) {
      senhaFlag = (fDao.readFuncionario(funcionario.getCodigoFuncionario()).getSenha().equals(senha)) ? true : false;
    }
    login = (emailFlag & senhaFlag);
    return login;
  }

  public boolean verifyExist(Cliente cliente) {
    String email = textUsuario.getText();
    if (pwdFSenha.getLength() < textSenha.getLength()) {
      pwdFSenha.setText(textSenha.getText());
    } else if (textSenha.getLength() < pwdFSenha.getLength()) {
      textSenha.setText(pwdFSenha.getText());
    }
    String senha = pwdFSenha.getText();
    emailFlag = (cDao.queryAccount(cliente.getCpf()).getemail().equals(email)) ? true : false;
    if (emailFlag) {
      senhaFlag = (cDao.queryAccount(cliente.getCpf()).getSenha().equals(senha)) ? true : false;
    }
    login = (emailFlag & senhaFlag);
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
    groupFuncionario.setVisible(false);
    groupFuncionario.setDisable(true);
    botaoFuncionario.setVisible(true);
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
    valorRecarga.clear(); 
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
    botaoFuncionario.setVisible(true);

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
    // Formatacao dos RGs
    textRGCLT.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{10}")) {
        String formattedNumber = newValue.substring(0, 2) + "." +
            newValue.substring(2, 5) + "." +
            newValue.substring(5, 8) + "-" +
            newValue.substring(8);
        textRGCLT.setText(formattedNumber);
      }
      if (textRGCLT.getLength() > 13) {
        textRGCLT.setText(oldValue);
      }
    });
    textRGIDOSO.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{10}")) {
        String formattedNumber = newValue.substring(0, 2) + "." +
            newValue.substring(2, 5) + "." +
            newValue.substring(5, 8) + "-" +
            newValue.substring(8);
        textRGIDOSO.setText(formattedNumber);
      }
      if (textRGIDOSO.getLength() > 13) {
        textRGIDOSO.setText(oldValue);
      }
    });
    // Formatacao do CTPS
    textCTPSCLT.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{9}")) {
        String formattedNumber = newValue.substring(0, 6) + "/" +
            newValue.substring(6);
        textCTPSCLT.setText(formattedNumber);
      }
      if (textCTPSCLT.getLength() > 10) {
        textCTPSCLT.setText(oldValue);
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
    valorRecarga.clear(); 
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
    valorRecarga.clear(); 
    groupBuscarCliente.setVisible(false);
    homeButton.setVisible(true);
  }

  @FXML
  void clickRecarregou(MouseEvent event) { 
    String aux = valorRecarga.getText();
    boolean isNumeric = (aux != null && aux.matches("[0-9]+"));
    if (isNumeric == true) {
      int Valor = Integer.parseInt(aux);
      passe.setSaldo(Valor);
      pDao.updatePasse(passe, ClienteAtual.getTipoPasse());
      valorRecarga.clear();
      saldoCliente.setText("R$ "+ passe.getSaldo());
      botaoVoltar(event);
    } else {
      showCaixaAlerta("Digite o Valor Corretamente, USE EXCLUSIVAMENTE OS NUMEROS");
    }
  }
}