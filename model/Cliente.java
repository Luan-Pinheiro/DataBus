package model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import controller.ScreenController;

public class Cliente {
  private int identificador;
  private String email;
  private String senha;
  private Date dataNascimento;
  private String telefone;
  private String nome;
  private String endereco;
  private String cpf;
  private char sexo;
  static String textAlerta = "Voce digitou incorretamente os campos: ";

  ScreenController sc;

  public Cliente() {
  };

  public Cliente(int identificador, String email, String senha, Date dataNascimento, String numeroTel, String nome,
      String endereco, String cpf) {
    this.identificador = identificador++;
    this.email = email;
    this.senha = senha;
    this.dataNascimento = dataNascimento;
    this.telefone = numeroTel;
    this.nome = nome;
    this.endereco = endereco;
    this.cpf = cpf;
  }
  public static String alertas() {
    return textAlerta;
}

  public static void setTextAlerta(String textAlerta) {
    Cliente.textAlerta = textAlerta;
  }
  public static boolean confereNome(String nome) {
    nome.toUpperCase();
    System.out.println(nome);
    boolean valido = true;
    if (nome.length() < 3) {
      valido = false;
    }
    if (!nome.matches("[a-zA-Z\\s]*")) {
      valido = false;
    }

    if (valido == false) {
      ScreenController.showCaixaAlerta("O nome digitado nao e valido! Confira  o nome e tente novamente.");
    }

    return valido;
  }

  public static boolean confereSenha(String senha) {
    senha.toUpperCase();
    Boolean valido = true;
    if (senha.length() < 6) {
      valido = false;
    }
    if (!valido) {
      ScreenController.showCaixaAlerta("O senha digitada eh invalida! Confira  o nome e tente novamente.");
    }

    return valido;
  }

  public static boolean confereCpf(String cpf) {
    boolean valido = true;
    if (cpf.length() != 14) {
      valido = false;
    }
    if (!cpf.matches("[0-9]*")) {
      return false;
    }
    if (!valido) {
      ScreenController.showCaixaAlerta("O cpf digitado esta incorreto! Confira e tente novamente.");
    }

    return valido;
  }

  public static boolean confereEmail(String email) {
    boolean valido = false;
    if (email != null && email.length() > 0) {
      String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
      Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher(email);
      if (matcher.matches()) {
        valido = true;
      }
      if (!valido) {
        ScreenController.showCaixaAlerta("O email digitado eh invalido! Confira e tente novamente.");
      }
    }

    return valido;
  }

  public static Boolean confereNumero(String numero) {
    numero = numero.replaceAll("[^a-zA-Z0-9]", "");
    boolean valido = true;
    if (numero.length() != 11) {
      valido = false;
    }

    if (!valido) {
      ScreenController.showCaixaAlerta("O numero digitado eh invalido! Confira e tente novamente.");
    }

    if (!numero.matches("[0-9]*")) {
      return false;
    }

    return valido;
  }

  public static boolean confereEndereco(String endereco) {
    boolean valido = true;
    if (endereco.length() < 15) {
      valido = false;
    }

    if (!valido) {
      ScreenController.showCaixaAlerta("O endereco digitado eh invalido! Confira  o nome e tente novamente.");
    }
    return valido;
  }

  public static boolean confereData(String dataNascimento) {
    Boolean valido;
    try {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate d = LocalDate.parse(dataNascimento, formatter);
      valido = true;
    } catch (DateTimeParseException e) {
      valido = false;
    }
    return valido;
  }

  // Getters e Setters
  public char getSexo() {
    return sexo;
  }
  public void setSexo(char sexo) {
    this.sexo = sexo;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  public int getIdentificador() {
    return identificador;
  }

  public String getemail() {
    return email;
  }

  public String getSenha() {
    return senha;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public String getTelefone() {
    return telefone;
  }

  public String getNome() {
    return nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public String getCpf() {
    return cpf;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

}
