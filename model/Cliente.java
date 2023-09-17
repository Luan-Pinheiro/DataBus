package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import controller.ScreenController;

public class Cliente {
  private String email;
  private String senha;
  private String dataNascimento;
  private String telefone;
  private String nome;
  private String endereco;
  private String cpf;
  private int tipoPasse;
  static String textAlerta = "Voce digitou incorretamente os campos: ";

  ScreenController sc;

  public Cliente() {
  };

  public Cliente(String email, String senha, String dataNascimento, String numeroTel, String nome, String endereco,String cpf, int tipoPasse) {
    this.email = email;
    this.senha = senha;
    this.dataNascimento = dataNascimento;
    this.telefone = numeroTel;
    this.nome = nome;
    this.endereco = endereco;
    this.cpf = cpf;
    this.tipoPasse = tipoPasse;
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
      textAlerta += "Nome, ";
    }

    return valido;
  }

  public static boolean confereSenha(String senha) {
    senha.toUpperCase();
    Boolean valido = true;
    if (senha.length() < 6) {
      valido = false;
    }
    if (valido == false) {
      textAlerta += "Senha, ";
    }
    return valido;
  }

  public static boolean confereCpf(String cpf) {
    cpf = cpf.replaceAll("[.-]", "");
    boolean valido = true;
    if (cpf.length() != 11) {
      valido = false;
    }
    if (!cpf.matches("[0-9]*")) {
      valido = false;
    }
    if (valido == false) {
      textAlerta += "CPF, ";
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
    }
    if (valido == false) {
      textAlerta += "Email, ";
    }
    return valido;
  }
  public static Boolean confereNumero(String numero) {
    numero = numero.replaceAll("[()-]", "");
    boolean valido = true;
    if (numero.length() != 11) {
      valido = false;
    }
    if (!numero.matches("[0-9]*")) {
      valido = false;
    }
    if (valido == false) {
      textAlerta += "Telefone, ";
    }
    return valido;
  }

  public static boolean confereEndereco(String endereco) {
    boolean valido = true;
    if (endereco.length() < 15) {
      valido = false;
    }
    if (valido == false) {
      textAlerta += "Endereco, ";
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
    if (valido == false) {
      textAlerta += "Data, ";
    }
    return valido;
  }

  // Getters e Setters
  public int getTipoPasse() {
    return tipoPasse;
  }
  public void setTipoPasse(int tipoPasse) {
    this.tipoPasse = tipoPasse;
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
  public void setDataNascimento(String dataNascimento) {
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
  public String getemail() {
    return email;
  }
  public String getSenha() {
    return senha;
  }
  public String getDataNascimento() {
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
}
