package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
  private Group groupClientesCadastrados;
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
  private TableView<Cliente> tbwClientes;
  @FXML
  private TableColumn<Cliente, String> tableNome;
  @FXML
  private TableColumn<Cliente, String> tableCPF;
  @FXML
  private TableColumn<Cliente, String> tableTelefone;
  @FXML
  private TableColumn<Cliente, String> tablePasse;
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
  private TextField funcionarIoBuscarCliente;
  @FXML
  private TextField funcionarIoEditarCliente;
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

  @FXML
  private Group groupBuscarRotas;
  @FXML
  private TableView<Rota> tbwRotasCadastradas;
  @FXML
  private TableColumn<Cliente, String> idRota;
  @FXML
  private TableColumn<Cliente, String> pontoSaida;
  @FXML
  private TableColumn<Cliente, String> pontoChegada;
  @FXML
  private TableColumn<Cliente, String> saida;
  @FXML
  private TableColumn<Cliente, String> chegada;

  @FXML
  private TextField cadRotaID;
  @FXML
  private TextField cadRotaPartida;
  @FXML
  private TextField cadRotaChegada;
  @FXML
  private TextField cadRotahSaida;
  @FXML
  private TextField cadRotahChegada;
  @FXML
  private ImageView botaoCadastrarRotas;
  @FXML
  private Group groupCadastrarRotas;
  


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
      if (confirmLogin(funcionario)) {
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
    //ATIVIDADE 
    groupFuncionario.setVisible(false);
    groupFuncionario.setDisable(true);

    groupBuscarCliente.setVisible(true);
    groupBuscarCliente.setDisable(false);

    botaoBuscar.setVisible(true);
    botaoBuscar.setDisable(false);

    botaoVoltar.setVisible(true);
    botaoVoltar.setDisable(false);
    homeButton.setVisible(false);
  }

  
  @FXML
  void buscarCpfCliente(MouseEvent event) {
    FuncionarioDaoJDBC fDaoJDBC = new FuncionarioDaoJDBC();
    Cliente clienteSolicitado = fDaoJDBC.readCliente(funcionarIoBuscarCliente.getText());
    if(isInDatabase(clienteSolicitado)){
      showClient(clienteSolicitado.getCpf());
      funcionarIoBuscarCliente.clear();
    }else{
      showCaixaAlerta("Dados inválidos!");
    }
  }

  @FXML
  void salvarDadosEditados(MouseEvent event) {
    FuncionarioDaoJDBC fDaoJDBC = new FuncionarioDaoJDBC();
    Cliente clienteDadosManutencao = fDaoJDBC.readCliente(funcionarIoEditarCliente.getText());
    if(isInDatabase(clienteDadosManutencao)){
      clienteDadosManutencao.setNome(editarNome.getText());
      clienteDadosManutencao.setSenha(editarSenha.getText());
      clienteDadosManutencao.setEndereco(editarEndereco.getText());
      clienteDadosManutencao.setTelefone(editarTelefone.getText());
      clienteDadosManutencao.setEmail(editarEmail.getText());
      fDaoJDBC.updateCliente(clienteDadosManutencao);
    }else{
      showCaixaAlerta("Dados inválidos!");
    }
  }
  @FXML
  void gerenciarCliente(MouseEvent event) {
    groupFuncionario.setVisible(false);
    groupFuncionario.setDisable(true);
    
    groupGerenciarCliente.setVisible(true);
    groupGerenciarCliente.setDisable(false);
    
    botaoVoltar.setVisible(true);
    botaoVoltar.setDisable(false);
    homeButton.setVisible(false);
  }
  
  @FXML
  void buscarRota(MouseEvent event) { 
    groupFuncionario.setVisible(false);
    groupFuncionario.setDisable(true);

    groupBuscarRotas.setVisible(true);
    groupBuscarRotas.setDisable(false);

    botaoBuscar.setVisible(true);
    botaoBuscar.setDisable(false);
    botaoVoltar.setVisible(true);
    botaoVoltar.setDisable(false);
    homeButton.setVisible(false);
    showRoutesTable();
  }

  @FXML
  void gerenciarRotas(MouseEvent event) {
    groupFuncionario.setVisible(false);
    groupFuncionario.setDisable(true);

    groupCadastrarRotas.setVisible(true);
    groupCadastrarRotas.setDisable(false);

    botaoVoltar.setVisible(true);
    botaoVoltar.setDisable(false);
    homeButton.setVisible(false);
  }
  
  @FXML
  void clickBotaoCadastrarRotas(MouseEvent event) { //
    FuncionarioDaoJDBC fDaoJDBC = new FuncionarioDaoJDBC();
    String[] infos = new String[]{cadRotaID.getText(),cadRotaPartida.getText(),cadRotaChegada.getText(),cadRotahSaida.getText(),cadRotahChegada.getText()};
    String codRota = infos[0];
    String pPartida = infos[1];
    String pChegada = infos[2];
    String hSaida = infos[3];
    String hChegada = infos[4];
    Rota rota = new Rota(codRota, pPartida, pChegada, hSaida, hChegada);
    fDaoJDBC.createRota(rota);
    clearText();
    System.out.println("Rota criada!");

  }


  @FXML
  void listarClientes(MouseEvent event) {
    groupClientesCadastrados.setVisible(true);
    groupClientesCadastrados.setDisable(false);
    botaoVoltar.setVisible(true);
    botaoVoltar.setDisable(false);
    homeButton.setVisible(false);
    showClientsTables();
  }

  @FXML
  void funcionarioMode(MouseEvent event) {
    funcionarioFlag = !funcionarioFlag;
    IMGmodofuncionario.setVisible(!IMGmodofuncionario.isVisible());
  }

  public void ClienteLogado(Cliente cliente, Passe passe) {
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
    consultaEmail.setText(cliente.getEmail());
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
    botaoFuncionario.setVisible(false);
    groupInicialScreen.setVisible(false);
    groupInicialScreen.setDisable(true);
    homeButton.setVisible(true);
    groupFuncionario.setVisible(true);
    groupFuncionario.setDisable(false);
  }

  public void showClientTable() {
    FuncionarioDaoJDBC fDaoJDBC = new FuncionarioDaoJDBC();
    ArrayList<Cliente> clientes = fDaoJDBC.getAllClientes();
    // criando lista observável para ser exibida no table view
    ObservableList<Cliente> auxList = FXCollections.observableArrayList(clientes);
    clientInfoAddress();
    for (Cliente cliente : clientes) {
      Cliente clienteAux = fDaoJDBC.readCliente(cliente.getCpf());
      auxList.add(clienteAux);
    }
    tbwClientes1.setItems(auxList);
    tbwClientes2.setItems(auxList);
  }

  public void   clientInfoAddress(){
    tCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
    tEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
    tEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
    tNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    tPasse.setCellValueFactory(new PropertyValueFactory<>("tipoPasse"));
    tSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));
    tTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
  };

  public void showClient(String cpf) {
    FuncionarioDaoJDBC fDaoJDBC = new FuncionarioDaoJDBC();
    Cliente cliente = fDaoJDBC.readCliente(cpf);
    // criando lista observável para ser exibida no table view
    ObservableList<Cliente> auxList = FXCollections.observableArrayList();
    clientInfoAddress();
    auxList.add(cliente);
    tbwClientes1.setItems(auxList);
    tbwClientes2.setItems(auxList);
  }
  public void showClientsTables(){
    FuncionarioDaoJDBC fDao = new FuncionarioDaoJDBC();
    ArrayList<Cliente> clientes = fDao.getAllClientes();
    // criando lista observável para ser exibida no table view
    ObservableList<Cliente> auxList = FXCollections.observableArrayList();
    tableNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    tableCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
    tableTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
    tablePasse.setCellValueFactory(new PropertyValueFactory<>("tipoPasse"));
    for (Cliente cliente : clientes) {
      Cliente clienteAux = fDao.readCliente(cliente.getCpf());
      // Inserindo na lista
      auxList.add(clienteAux);
    }
    // Inserindo na tabela
    tbwClientes.setItems(auxList);
  }

  public void showRoutesTableClient() {
    RotaDaoJDBC RDao = new RotaDaoJDBC();
    ArrayList<Rota> rotas = RDao.getAllRotas();
    // criando lista observável para ser exibida no table view
    ObservableList<Rota> auxList = FXCollections.observableArrayList();
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
  public void showRoutesTable() {
    FuncionarioDaoJDBC fDao = new FuncionarioDaoJDBC();
    ArrayList<Rota> rotas = fDao.getAllRotas();
    // criando lista observável para ser exibida no table view
    ObservableList<Rota> auxList = FXCollections.observableArrayList();
    idRota.setCellValueFactory(new PropertyValueFactory<>("codigoRota"));
    pontoSaida.setCellValueFactory(new PropertyValueFactory<>("pontoPartida"));
    pontoChegada.setCellValueFactory(new PropertyValueFactory<>("pontoChegada"));
    saida.setCellValueFactory(new PropertyValueFactory<>("horarioSaida"));
    chegada.setCellValueFactory(new PropertyValueFactory<>("horarioChegada"));
    for (Rota rota : rotas) {
      Rota rotaAux = fDao.readRota(rota.getCodigoRota());
      // Inserindo na lista
      auxList.add(rotaAux);
    }
    // Inserindo na tabela
    tbwRotasCadastradas.setItems(auxList);
  }

  

  public boolean confirmLogin(Funcionario funcionario) {
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
  public boolean isInDatabase(Cliente cliente) {
    boolean isInDatabase = false;
    FuncionarioDaoJDBC fDaoJDBC = new FuncionarioDaoJDBC();
    ArrayList<Cliente> clientes = fDaoJDBC.getAllClientes();
    for (Cliente verificador : clientes) {
      if(verificador.getCpf().equals(cliente.getCpf())){
        isInDatabase = true;
        return isInDatabase;
      }
    }
    return isInDatabase;
  }
  public boolean verifyExist(Cliente cliente) {
    String email = textUsuario.getText();
    if (pwdFSenha.getLength() < textSenha.getLength()) {
      pwdFSenha.setText(textSenha.getText());
    } else if (textSenha.getLength() < pwdFSenha.getLength()) {
      textSenha.setText(pwdFSenha.getText());
    }
    String senha = pwdFSenha.getText();
    emailFlag = (cDao.queryAccount(cliente.getCpf()).getEmail().equals(email)) ? true : false;
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
    cadRotaID.clear();
    cadRotaPartida.clear();
    cadRotaPartida.clear();
    cadRotahSaida.clear();
    cadRotahChegada.clear();
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
    //teste
    Alert alert = new Alert(AlertType.WARNING);
    alert.setTitle("Aviso");
    alert.setHeaderText("Ocorreu um erro!");
    alert.setContentText(texto);

    alert.showAndWait();
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
    showRoutesTableClient(); 
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
    if (funcionarioFlag) {
      groupGerenciarCliente.setVisible(false);
      groupGerenciarCliente.setDisable(true);
      groupBuscarCliente.setVisible(false);
      groupBuscarCliente.setDisable(true);
      groupBuscarRotas.setVisible(false);
      groupBuscarRotas.setDisable(true);
      groupCadastrarRotas.setVisible(false);
      groupCadastrarRotas.setDisable(true);
      groupClientesCadastrados.setVisible(false);
      groupClientesCadastrados.setDisable(true);
      
      groupFuncionario.setVisible(true);
      groupFuncionario.setDisable(false);
      
    } else {
      saldoIMG.setVisible(true);
      saldoCliente.setVisible(true);

      botaoRecarregar.setDisable(false);
      botaoConsultarDados.setDisable(false);
      botaoConsultarRotas.setDisable(false);

      botaoRecarregar.setVisible(true);
      botaoConsultarDados.setVisible(true);
      botaoConsultarRotas.setVisible(true);
      textOperacao.setVisible(true);

      grupoRotas.setVisible(false);
      grupoRotas.setDisable(true);

      groupConsultaDados.setVisible(false);
      groupConsultaDados.setDisable(true);

      groupRecarga.setVisible(false);
      groupRecarga.setDisable(true);

      valorRecarga.clear();
    }
    botaoVoltar.setDisable(true);
    botaoVoltar.setVisible(false);

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
    editarTelefone.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{11}")) {
        String formattedNumber = "(" + newValue.substring(0, 2) + ")" +
            newValue.substring(2, 7) + "-" +
            newValue.substring(7);
        editarTelefone.setText(formattedNumber);
      }
      if (editarTelefone.getLength() > 14) {
        editarTelefone.setText(oldValue);
      }
    });
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
    funcionarIoBuscarCliente.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{11}")) {
        String formattedNumber = newValue.substring(0, 3) + "." +
            newValue.substring(3, 6) + "." +
            newValue.substring(6, 9) + "-" +
            newValue.substring(9);
        funcionarIoBuscarCliente.setText(formattedNumber);
      }
      if (funcionarIoBuscarCliente.getLength() > 14) {
        funcionarIoBuscarCliente.setText(oldValue);
      }
    });
    funcionarIoEditarCliente.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.matches("\\d{11}")) {
        String formattedNumber = newValue.substring(0, 3) + "." +
            newValue.substring(3, 6) + "." +
            newValue.substring(6, 9) + "-" +
            newValue.substring(9);
        funcionarIoEditarCliente.setText(formattedNumber);
      }
      if (funcionarIoEditarCliente.getLength() > 14) {
        funcionarIoEditarCliente.setText(oldValue);
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

}